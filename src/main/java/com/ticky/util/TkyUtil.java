package com.ticky.util;

import com.ticky.bean.TkyCustomerRequest;
import com.ticky.error.InvalidRequestException;

public class TkyUtil {

	public static boolean validateRequest(TkyCustomerRequest tkyCustRequest) {
		 if(tkyCustRequest.getCustTkyNumber().equalsIgnoreCase("null"))
			  throw new InvalidRequestException("ERR1000");
				 
		return false;
	}

}
