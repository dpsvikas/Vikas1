package com.sample.aspect;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.entity.ResponseObject;

@ControllerAdvice
public class ExceptionAdvice {
	private static final Logger LOGGER = Logger.getLogger(ExceptionAdvice.class);
	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	@RequestMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseObject handleAllException(Exception e) {
	    LOGGER.error(e.getMessage(), e);
	    String message = "Unknown error";//ErrorMessages.UNKNOWN_ERROR;
	    
	   /* if ((e instanceof SQLException) || (e instanceof DataAccessException) || (e instanceof TransactionException)){
	    	// Any database related exception, we don't want to show it to the user.
	    	message = ErrorMessages.ERROR_WHILE_CONTACTING_DATABASE_ERROR_MSG;
	    } else if (e instanceof ApircException){
	    	message = e.getMessage();
	    }*/
	    message = e.getMessage();
	    return ResponseObject.createErrorResponse(message);
	}
}
