package com.srd.billpayment.srdBillpayment.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

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
	ResultSet set= (ResultSet) sess.createQuery("select * from admin where name="+admin.getName()+"and password="+admin.getPassword());
	try {
		if (set.next())
		{
			return "ok";
		}
		else
		{
			return "fail";
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 tran.commit();
	return "ok";
	 
 }
}
