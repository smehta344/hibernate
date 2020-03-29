package com.gvl.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gvl.entites.Driver;
import com.gvl.entites.IDriver;
import com.gvl.helper.SessionFactoryHelper;

public class GetVloadInterfaceTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		IDriver driver = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			//driver = (IDriver) session.get(Driver.class, 5632);
			driver = (IDriver) session.load(Driver.class, 5632);
			//session.close();
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
