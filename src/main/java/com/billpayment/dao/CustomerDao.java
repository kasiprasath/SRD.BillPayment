package com.billpayment.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.billpayment.model.Customer;

@Repository
public class CustomerDao {

@Autowired
SessionFactory sessionFactoy;


public void addCustomer(Customer customer)
{
	Session session=sessionFactoy.getCurrentSession();
	session.save(customer);
}
	
}
