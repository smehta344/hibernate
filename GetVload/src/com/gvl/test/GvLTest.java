package com.gvl.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gvl.entites.Driver;
import com.gvl.helper.SessionFactoryHelper;

public class GvLTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Driver driver = null;
		Transaction transaction = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			driver = new Driver();
			driver.setDriverNo(5633);
			driver.setDriverName("Sohan");
			driver.setAge(23);
			driver.setGender("male");
			driver.setMobileNo(8653256356L);
			driver.setExprience(23.1f);
			driver.setSalary(24001);
			session.save(driver);
			System.out.println("Data saved : " + driver);
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
				session.close();
			}
			SessionFactoryHelper.close();
		}

	}
}
