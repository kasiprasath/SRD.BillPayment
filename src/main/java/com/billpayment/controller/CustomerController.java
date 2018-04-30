package com.billpayment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	 @RequestMapping(value="/cUpdate/{id}")
		public List<Customer> updateCustomer(@PathVariable("customerId") int customerId) throws Exception {
			return customerService.updateCService(customerId);
		 
			
		}
	 @RequestMapping(value="/cUpdateAndSave")
	   public Boolean cUpdateAndSave(@RequestBody Customer cus) {
		return customerService.cUpdateAndSaveS(cus);
		 
	 }
}
