package com.srd.billpayment.srdBillpayment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srd.billpayment.srdBillpayment.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer>{
	

}
