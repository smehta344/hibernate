package com.msf.accesor;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.msf.entites.Passenger;
import com.msf.helper.SessionFactoryHelper;

public class PassengerDao {
	public Passenger getPassenger(int passengerNo) {
		SessionFactory sessionFactory = null;
		Passenger passenger = null;
		Session session = null;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			passenger = (Passenger) session.get(Passenger.class, passengerNo);
		} catch (HibernateException e) {
			e.printStackTrace();
			throw e;
		}
		return passenger;
	}

	public void savePassenger(Passenger passenger) {
		boolean flag = false;
		Session session = null;
		Transaction transaction = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(passenger);
			flag = true;
		} finally {
			if (transaction != null)
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			if (session != null) {
				session.close();
			}
		}

	}
}
