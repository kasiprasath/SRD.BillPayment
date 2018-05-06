package com.srd.billpayment.srdBillpayment.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.srd.billpayment.srdBillpayment.entity.Admin;

@Repository
public class AdminDao {
@Autowired
SessionFactory session;
 public String validateAdmin(Admin admin)
 {
	 Session sess=session.openSession();
	 Transaction tran = sess.getTransaction();
	 tran.begin();
	 sess.save(admin);
	 tran.commit();
	 return "success";
 
 }
 
 public String  checkAdminDao(Admin admin) {
	 Session sess=session.openSession();
	 Transaction tran = sess.getTransaction();
	 tran.begin();
	Query set = sess.createQuery("from Admin where name='"+admin.getName()+"' and password='"+admin.getPassword()+"'");
	List str = set.list();
	if (str.size()>0)
	{
		return "ok admin is there";
	}
	else
	{
		return "fail";
	}
	 
 }
}
