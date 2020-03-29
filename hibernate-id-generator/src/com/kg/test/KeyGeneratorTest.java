package com.kg.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.kg.entites.Pensioner;
import com.kg.helper.SessionFactoryHelper;

public class KeyGeneratorTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Pensioner pensioner = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			pensioner = new Pensioner();
			pensioner.setFirstName("Smith");
			pensioner.setLastName("Sen");
			pensioner.setDob(new Date());
			pensioner.setGender("Male");
			pensioner.setMobileNumber(8456332659L);
			pensioner.setEmailAddress("smith@gmail.com");
			pensioner.setAddressLine1("Hyderabad");
			pensioner.setAddressLine2("Ameerpet");
			pensioner.setState("Telgna");
			pensioner.setZip(500038);
			pensioner.setCountry("India");
			session.save(pensioner);
			//session.save(pensioner);
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			session.close();
		}
		SessionFactoryHelper.close();
	}
}
