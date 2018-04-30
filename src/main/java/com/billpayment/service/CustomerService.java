package com.billpayment.service;

import java.util.List;

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


	public List<Customer> updateCService(int customerId) throws Exception {
		// TODO Auto-generated method stub
		return customerDao.updateCDao(customerId);
	}


	public Boolean cUpdateAndSaveS(Customer cus) {
		// TODO Auto-generated method stub
		return customerDao.cSaveAndUpdateDao(cus);
	}

}
