package com.sample;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sample.aspect.ExceptionLoggerAspect;
import com.sample.aspect.LoggerAspect;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
    
	@Bean 
	public LoggerAspect getLoggerAspect(){
		return new LoggerAspect();
	}
	
	@Bean 
	public ExceptionLoggerAspect getExceptionLoggerAspect(){
		return new ExceptionLoggerAspect();
	}


}