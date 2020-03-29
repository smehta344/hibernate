package com.gvl.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gvl.entites.Driver;
import com.gvl.helper.SessionFactoryHelper;

public class GetVLoadTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		Driver driver = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			driver = new Driver();
			driver = (Driver) session.get(Driver.class, 5633);
			//driver = (Driver) session.load(Driver.class, 5632);
			session.close();
			System.out.println("Driver data retrived : " + driver.getDriverName());
			System.out.println(driver.getClass().getName());
			flag = true;
		} finally {
			if (flag) {
				transaction.commit();
			} else {
				transaction.rollback();
			}
			SessionFactoryHelper.close();
		}
	}
}