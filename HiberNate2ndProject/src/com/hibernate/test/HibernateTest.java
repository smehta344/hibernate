package com.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entities.Bus;

public class HibernateTest {
	@SuppressWarnings({ "deprecation", "null" })
	public static void main(String[] args) {
		Transaction transaction = null;
		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Bus bus = null;
		@SuppressWarnings("unused")
		boolean flag = true;
		try {
			configuration = new Configuration().configure();
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			bus = new Bus();
			bus.setBusNo(2);
			bus.setServiceNo("BU567");
			bus.setBusType("Sleeper");
			bus.setSeatingCapacity(100);
			bus.setFuleType("Petrol");
			bus.setPrice(120212.00);
			System.out.println(bus);
			session.save(bus);
			transaction = session.beginTransaction();
			flag = true;
			if (transaction != null) {
				System.out.println("Hibernate transaction succedfully");
			} else {
				System.out.println("Transaction fail");
			}

		} finally {
			if (transaction != null) {
				transaction.commit();
			} else {
				transaction.rollback();
			}
			if (sessionFactory != null) {
				sessionFactory.close();
			}
			/*
			 * if (session != null) { session.close(); }
			 */
		}
		
	}
}