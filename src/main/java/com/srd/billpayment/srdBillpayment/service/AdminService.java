package com.srd.billpayment.srdBillpayment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srd.billpayment.srdBillpayment.dao.AdminDao;
import com.srd.billpayment.srdBillpayment.entity.Admin;

@Service
public class AdminService {

	@Autowired
	AdminDao dao;
	
	public String validateAdmin(Admin admin)
	{
		dao.validateAdmin(admin);
		return null;
	}
	
	public String checkAdminservice(Admin admin) {
	String r=dao.checkAdminDao(admin);
	return r;
}
}