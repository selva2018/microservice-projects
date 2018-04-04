package com.ticky.error;

public class InvalidRequestException extends BaseRuntimeException {
	private static final long serialVersionUID = -746903085863017362L;
	
	
	public InvalidRequestException(String errorCode) {
		super(errorCode);
		
	}


	

}
