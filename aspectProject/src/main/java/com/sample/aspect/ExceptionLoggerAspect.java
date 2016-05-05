package com.sample.aspect;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import com.sample.entity.ResponseObject;


@Aspect
public class ExceptionLoggerAspect {

    private static final Logger LOGGER = Logger.getLogger(ExceptionLoggerAspect.class);

    @AfterThrowing(pointcut = "execution(public * com.sample.controllers..*.*(..))", throwing = "error")
    public Object logCommonServiceRequest(JoinPoint  pjp, Throwable error) throws Throwable {
    	LOGGER.info("logAfterThrowing() is running!");
    	LOGGER.info("*************************************************!");

    	LOGGER.debug("hijacked : " + pjp.getSignature().getName());
    	LOGGER.debug("Exception : " + error);
    	LOGGER.debug("******");
        return logException(pjp);
    }


    private Object logException(JoinPoint  pjp) throws Throwable, Exception {
    	LOGGER.debug(pjp.getKind());
        ResponseObject obj = new ResponseObject(false, null);
        obj.setErrorMessage("Exception occured");
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Service: " + pjp.getTarget().getClass() + " -- " + pjp.getSignature());
        }
        
        return obj;
    }

}