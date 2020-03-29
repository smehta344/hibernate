package com.hbs.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.hbs.entites.Provider;
import com.hbs.helper.SessionFactoryHelper;

public class HibernateBootstrapTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Provider provider = null;

		provider = new Provider();
		provider.setProviderNo(1);
		provider.setProviderName("Evening star");
		provider.setEstablishDate(new Date());
		provider.setContactNumber(847995634);
		provider.setEmailAddress("eveningstar@gmail.com");
		sessionFactory = SessionFactoryHelper.getSessionFactory();
		session = sessionFactory.openSession();
		session.save(provider);
		session.flush();
		session.close();
		System.out.println("Data saved.." + provider);
		
	}
}
