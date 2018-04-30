package com.billpayment.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.billpayment.model.Customer;

@Repository
public class CustomerDao {

	@Autowired
	SessionFactory sessionFactoy;

	Session session=sessionFactoy.openSession();

	public void addCustomer(Customer customer)
	{

		session.save(customer);

	}

	@SuppressWarnings("unchecked")
	public List<Customer> updateCDao(int customerId) throws Exception {
		Query hql=session.createQuery("from Customer where custmoerId="+customerId);		
		List<Customer> li=hql.list();
		session.close();
		return li;
	}


	public Boolean cSaveAndUpdateDao(Customer cus) {
		Boolean status;
		if((boolean) session.save(cus)) {
			status=true;	
		}else {
			status=false;
		}		
		return status;
	}


}
