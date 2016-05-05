package com.sample.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.entity.ResponseObject;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @RequestMapping("/test1")
    public ResponseObject index1() {
    	
    	return ResponseObject.createSuccessResponse("Greetings from Spring Boot! TEst1");
         
    }

    @RequestMapping("/test2")
    public String index2() {
    	System.out.println(1/0);   
    	return "Greetings from Spring Boot! TEst1";
    }

    @RequestMapping("/test3")
    public String index3() {
        return "Greetings from Spring Boot! TEst1";
    }

    @RequestMapping("/test4")
    public String index4() {
        return "Greetings from Spring Boot! TEst1";
    }

}