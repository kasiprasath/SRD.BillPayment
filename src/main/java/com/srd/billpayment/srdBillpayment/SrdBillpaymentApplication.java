package com.srd.billpayment.srdBillpayment;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SrdBillpaymentApplication {
	
	@Bean
	public SessionFactory getSesionFactory(HibernateEntityManagerFactory manager)
	{
		return manager.getSessionFactory();
	}
	public static void main(String[] args) {
		SpringApplication.run(SrdBillpaymentApplication.class, args);
	}
}
