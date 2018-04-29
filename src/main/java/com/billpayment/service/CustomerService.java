package com.billpayment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billpayment.dao.CustomerDao;
import com.billpayment.model.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerDao customerDao;


	public void addCustomer(Customer customer)
	{
		customerDao.addCustomer(customer);
	}

}
