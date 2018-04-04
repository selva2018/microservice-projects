package com.ticky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ticky.bean.TkyCustomerRequest;
import com.ticky.service.TkyCustomerService;
import com.ticky.util.TkyUtil;

@RestController
public class TkyController {
    @Autowired
    TkyCustomerService tkyCustomerService;
	
	@RequestMapping(value="/customerinfo",method=RequestMethod.POST,
					produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void processRequest(@RequestBody TkyCustomerRequest tkyCustRequest){
		if(TkyUtil.validateRequest(tkyCustRequest))		
		   tkyCustomerService.fetchAllCustomerInfo();
	}
 
	
}
