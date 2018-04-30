package com.srd.billpayment.srdBillpayment.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.srd.billpayment.srdBillpayment.entity.Customer;

@Repository
public class CustomerDao {
	/*ResponseEntity<String > response;
	@Autowired
	CustomerRepo repo;
	
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer){
		repo.save(customer);
	ResponseEntity<String > response=	new ResponseEntity<String>("saved successfully",HttpStatus.OK);
		return response;
	}*/
}
