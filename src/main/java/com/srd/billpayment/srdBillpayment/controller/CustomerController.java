package com.srd.billpayment.srdBillpayment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.srd.billpayment.srdBillpayment.dao.CustomerRepo;

import com.srd.billpayment.srdBillpayment.entity.Customer;
import com.srd.billpayment.srdBillpayment.service.CustomerService;

@RestController
@CrossOrigin(maxAge=3600)
public class CustomerController {
	@Autowired
//	CustomerRepo repo;
	CustomerService service;
	
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer)
	{
	/*	repo.save(customer);
		return new ResponseEntity<String>("succes",HttpStatus.OK);*/
		
		ResponseEntity<String> response=service.addCustomer(customer);
		
		return response;
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public ResponseEntity<String> updateCustomer()
	{
		return new ResponseEntity<String>("succes",HttpStatus.OK);
	}
	
	

	
	
}
