package com.srd.billpayment.srdBillpayment.dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.srd.billpayment.srdBillpayment.entity.Customer;

@Repository
public class CustomerDao {
	@Autowired
	CustomerRepo repo;
	
	public ResponseEntity<String> addCustomer(Customer customer){
		Date dateobj = customer.getcRegistrationDate();
		DateFormat dateformat= new SimpleDateFormat("yyyy-MM-dd");
		String newdate=dateformat.format(dateobj);
		Date dated = null;
		try {
			dated = dateformat.parse(newdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		customer.setcRegistrationDate(dated);
		repo.save(customer);
	ResponseEntity<String > response=	new ResponseEntity<String>("saved successfully",HttpStatus.OK);
		return response;
	}
}
