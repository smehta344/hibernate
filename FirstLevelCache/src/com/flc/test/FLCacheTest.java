package com.flc.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.flc.entites.Schedule;
import com.flc.helper.SessionFactoryHelper;

public class FLCacheTest {
	public static void retriveDta() {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Schedule schedule = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			schedule = new Schedule();
			schedule.setStationNo(122);
			schedule.setSource("Hyderabad");
			schedule.setDestination("Kolkata");
			schedule.setDepartureDate(new Date());
			schedule.setArrivalTime(new Date());
			session.save(schedule);
			System.out.println("Data saved :" + schedule);
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
