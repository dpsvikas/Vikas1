package com.sample.aspect;


import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class LoggerAspect {

    private static final Logger LOGGER = Logger.getLogger(LoggerAspect.class);

   @Around("execution(public * com.sample.controllers..*.*(..))")
    public Object logCommonServiceRequest(ProceedingJoinPoint pjp) throws Throwable {
    	 Object obj;
         try {
             obj = pjp.proceed();
         } catch (Exception e) {
             LOGGER.error("Service Exception:" + e.getMessage());
             throw e;
         }
         return obj;
      //  return logServiceRequest(pjp);
    }
   @Around("execution(public * com.sample.controllers..*.*(..))")
    public Object logCommonServiceRequest1(ProceedingJoinPoint pjp) throws Throwable {
    	 Object obj;
         try {
             obj = pjp.proceed();
         } catch (Exception e) {
             LOGGER.error("Service Exception:" + e.getMessage());
             throw e;
         }
         return obj;
      //  return logServiceRequest(pjp);
    }

   
    private Object logServiceRequest(ProceedingJoinPoint pjp) throws Throwable, Exception {
        Object obj;
        try {
            obj = pjp.proceed();
        } catch (Exception e) {
            LOGGER.error("Service Exception:" + e.getMessage());
            throw e;
        }
        return obj;
    }

   
   
    private Object logDAORequest(ProceedingJoinPoint pjp) throws Throwable, Exception {
        Object obj;
        try {
            obj = pjp.proceed();
        } catch (Exception e) {
            LOGGER.error("DAO Exception:" + e.getMessage());
            throw e;
        }
        return obj;
    }


}