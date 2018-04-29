package com.billpayment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.billpayment.model.Customer;
import com.billpayment.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	public void Customer(@RequestBody Customer customer)
	{
		customerService.addCustomer(customer);
		
	}
}
