package com.sample.entity;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.apache.commons.lang3.StringUtils;



@XmlRootElement(name="response")
@XmlAccessorType (XmlAccessType.FIELD )
public class ResponseObject implements ApiRcEntity {
	private boolean success = true;
	private String errorMessage = StringUtils.EMPTY;
	private Object response = null;
	private String errorCode  = StringUtils.EMPTY;
	private String successCode  = StringUtils.EMPTY;
	private String successMessage  = StringUtils.EMPTY;
	
	public ResponseObject() { 
		super(); 
	}
	public ResponseObject(boolean success) { 
		this.success = success; 
	}
	

	public ResponseObject(boolean success, String errorMessage,
			Object response, String errorCode, String successCode,
			String successMessage) {
		super();
		this.success = success;
		this.errorMessage = errorMessage;
		this.response = response;
		this.errorCode = errorCode;
		this.successCode = successCode;
		this.successMessage = successMessage;
	}
	
	public ResponseObject(boolean success, Object response) {
		super();
		this.success = success;
		this.response = response;
	}

	public ResponseObject(boolean success, String errorMessage,
			Object response, String errorCode) {
		super();
		this.success = success;
		this.errorMessage = errorMessage;
		this.response = response;
		this.errorCode = errorCode;
	}
	
	public ResponseObject(boolean success, String errorMessage, String errorCode) {
		super();
		this.success = success;
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}
	
	public ResponseObject(boolean success, Object response, String successCode,
			String successMessage) {
		super();
		this.success = success;
		this.response = response;
		this.successCode = successCode;
		this.successMessage = successMessage;
	}

	public static  ResponseObject createErrorResponse(String errorMessage){
		ResponseObject resp = new ResponseObject(false);
		resp.setErrorMessage(errorMessage);
		return resp;
	}
	public static  ResponseObject createErrorResponse(){
		return new ResponseObject(false);
	}
	
	public static ResponseObject createErrorResponse(Object response) {
		ResponseObject resp = new ResponseObject(false);
		resp.setResponse(response);
		return resp;
	}

	public static  ResponseObject createErrorResponse(String errorMessage, String errorCode){
		ResponseObject resp = new ResponseObject(false);
		resp.setErrorMessage(errorMessage);
		resp.setErrorCode(errorCode);
		return resp;
	}
	
	public static  ResponseObject createSuccessResponse(String successMessage){
		ResponseObject resp = new ResponseObject(true);
		resp.setSuccessMessage(successMessage);
		return resp;
	}
	public static  ResponseObject createSuccessResponse(){
		return new ResponseObject(true);
	}
	
	public static ResponseObject createSuccessResponse(Object response) {
		ResponseObject resp = new ResponseObject(true);
		resp.setResponse(response);
		return resp;
	}
	
	public static  ResponseObject createSuccessResponse(String successMessage, String successCode){
		ResponseObject resp = new ResponseObject(true);
		resp.setSuccessMessage(successMessage);
		resp.setSuccessCode(successCode);
		return resp;
	}
	
	public static  ResponseObject createSuccessResponse(String successMessage, String successCode, Object response){
		ResponseObject resp = new ResponseObject(true);
		resp.setSuccessMessage(successMessage);
		resp.setSuccessCode(successCode);
		resp.setResponse(response);
		return resp;
	}
	
	public static  ResponseObject createSuccessResponse(String successMessage, Object response){
		ResponseObject resp = new ResponseObject(true);
		resp.setSuccessMessage(successMessage);
		resp.setResponse(response);
		return resp;
	}
	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public ResponseObject setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
		return this;
	}

	public Object getResponse() {
		return response;
	}

	public ResponseObject setResponse(Object response) {
		this.response = response;
		return this;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public ResponseObject setErrorCode(String errorCode) {
		this.errorCode = errorCode;
		return this;
	}

	public String getSuccessCode() {
		return successCode;
	}

	public ResponseObject setSuccessCode(String successCode) {
		this.successCode = successCode;
		return this;
	}

	public String getSuccessMessage() {
		return successMessage;
	}

	public ResponseObject setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
		return this;
	}

	@Override
	public String toString() {
		return "ResponseObject [success=" + success + ", errorMessage="
				+ errorMessage + ", response=" + response + ", errorCode="
				+ errorCode + ", successCode=" + successCode
				+ ", successMessage=" + successMessage + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((errorCode == null) ? 0 : errorCode.hashCode());
		result = prime * result
				+ ((errorMessage == null) ? 0 : errorMessage.hashCode());
		result = prime * result
				+ ((response == null) ? 0 : response.hashCode());
		result = prime * result + (success ? 1231 : 1237);
		result = prime * result
				+ ((successCode == null) ? 0 : successCode.hashCode());
		result = prime * result
				+ ((successMessage == null) ? 0 : successMessage.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseObject other = (ResponseObject) obj;
		if (errorCode == null) {
			if (other.errorCode != null)
				return false;
		} else if (!errorCode.equals(other.errorCode))
			return false;
		if (errorMessage == null) {
			if (other.errorMessage != null)
				return false;
		} else if (!errorMessage.equals(other.errorMessage))
			return false;
		if (response == null) {
			if (other.response != null)
				return false;
		} else if (!response.equals(other.response))
			return false;
		if (success != other.success)
			return false;
		if (successCode == null) {
			if (other.successCode != null)
				return false;
		} else if (!successCode.equals(other.successCode))
			return false;
		if (successMessage == null) {
			if (other.successMessage != null)
				return false;
		} else if (!successMessage.equals(other.successMessage))
			return false;
		return true;
	}
}
