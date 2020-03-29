package com.flc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.flc.entites.Schedule;
import com.flc.helper.SessionFactoryHelper;

public class FirstLevelCacheTest {
	public static void retriveDta() {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Schedule schedule1 = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			schedule1 = (Schedule) session.get(Schedule.class, 121);
			System.out.println("Before editing :" + schedule1);
			schedule1.setSource("Bihar");
			session.update(schedule1);
			Schedule schedule2 = (Schedule) session.get(Schedule.class, 121);
			System.out.println("After editing :" + schedule2);
			session.flush();
			session.evict(schedule1);
			session.clear();
			System.out.println("Data Saved...");
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

	public static void main(String[] args) {
		FLCacheTest.retriveDta();
	}

}
