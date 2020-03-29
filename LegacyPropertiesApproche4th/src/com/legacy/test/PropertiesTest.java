package com.legacy.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.legacy.entites.Journey;

public class PropertiesTest {
	@SuppressWarnings({ "null", "deprecation" })
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		boolean flag = false;
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		Journey journey = null;

		try {
			config = new Configuration();
			config.addResource("com/legacy/entites/Journey.hbm.xml");
			factory = config.buildSessionFactory();
			session = factory.openSession();
			journey = new Journey();
			journey.setJourneyNo(4);
			journey.setSource("Bihar");
			journey.setDestination("Delhi");
			journey.setJourneyDate(new Date());
			journey.setEstimatedHours(15);
			journey.setDistanceInKm(1800);
			journey.setPrice(563.00);
			session.save(journey);
			transaction = session.beginTransaction();
			System.out.println("data Saved" + journey);
			flag = true;
		} finally {
			if (transaction != null) {
				transaction.commit();
			} else {
				transaction.rollback();
			}
			if (session != null) {
				session.close();
			}
			if (factory != null) {
				factory.close();
			}

		}
	}
}
