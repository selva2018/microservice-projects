package com.ticky.error;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ticky.property.ErrorProperty;

@ControllerAdvice
public class GlobalExceptionHandler {
    
	@Autowired
	ErrorProperty errorProperty;
	
	
	@ExceptionHandler(InvalidRequestException.class)
	@ResponseBody
	public ResponseEntity<Object> handleServiceException(InvalidRequestException invalidRequestException){
		return new ResponseEntity<>(this.generateErrorResponse(invalidRequestException),HttpStatus.BAD_REQUEST);
		  
	}

	private Object generateErrorResponse(BaseRuntimeException runtimeexception) {
		ErrorResponse errorResponse=new ErrorResponse();    
		String errorCode=runtimeexception.getErrorCode();
    	errorResponse.setErrMessage(errorProperty.getDescription(errorCode));

	    return errorResponse;
	}
	
	
	  
}
