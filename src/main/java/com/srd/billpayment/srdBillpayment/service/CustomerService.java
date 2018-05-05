package com.srd.billpayment.srdBillpayment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.srd.billpayment.srdBillpayment.dao.CustomerDao;
import com.srd.billpayment.srdBillpayment.entity.Customer;

@Service
public class CustomerService {
	
	@Autowired
	CustomerDao custmerDao;
	
	
	public ResponseEntity<String > addCustomer(Customer customer)
	{
		ResponseEntity<String> response=custmerDao.addCustomer(customer);
		
		return response;
	}
}
