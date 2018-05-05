package com.srd.billpayment.srdBillpayment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.srd.billpayment.srdBillpayment.entity.Admin;
import com.srd.billpayment.srdBillpayment.service.AdminService;

@RestController
@CrossOrigin(maxAge=3600)
public class LoginController {

	@Autowired 
	AdminService service;
	
	
	@RequestMapping(value="/adminlogin", method=RequestMethod.POST)
	public String valiadateAdmin(@RequestBody Admin admin)
	{
		System.out.println("Name is "+admin.getName());
		System.out.println("password is "+admin.getPassword());
		service.validateAdmin(admin);	
		return "Success";
	}
	
	
	@RequestMapping(value="/checkadmin")
	public String checkAdmin(@RequestBody Admin admin)
	{
		String results=service.checkAdminservice(admin);
		return results;
	}

}