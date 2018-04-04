package com.ticky.error;

import java.io.Serializable;

public class BaseRuntimeException extends RuntimeException implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9079268517991199413L;
	
	private String errorCode;
	
	public BaseRuntimeException(String errorCode){
		super(errorCode);
		this.errorCode=errorCode;
		
	}

	public String getErrorCode() {
		return errorCode;
	}

	 
}
