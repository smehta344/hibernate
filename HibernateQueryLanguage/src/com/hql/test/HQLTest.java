package com.hql.test;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hql.entities.Customer;
import com.hql.helper.SessionFactoryHelper;

public class HQLTest {

	@SuppressWarnings({ "unused", "unchecked" })
	private static void showNoOfCustomer(Session session) {
		Query query = null;
		List<Customer> customers = null;
		query = session.createQuery("select count(c) from Customer c");
		customers = query.list();
		for (Customer c : customers) {
			System.out.println(c.getCustomerNo());
		}
	}

	@SuppressWarnings({ "unchecked", "unused" })
	private static void showCustomerByGender(Session session, String gender) {
		Query query = null;
		List<Customer> customers = null;
		query = session.createQuery("select c from Customer c where c.gender=?");
		query.setParameter(0, gender);
		customers = query.list();
		for (Customer c : customers) {
			System.out.println(c.getGender() + " " + c.getCustomerName());
		}
	}

	@SuppressWarnings({ "unchecked", "unused" })
	private static void showCustomerByDobAndGender(Session session, int year, String gender) {
		Query query = null;
		List<Customer> customers = null;
		query = session.createQuery("select c from Customer c where year(c.dob)=? and c.gender=?");
		query.setParameter(0, year);
		query.setParameter(1, gender);
		customers = query.list();
		for (Customer c : customers) {
			System.out.println(c.getDob() + " " + c.getCustomerName());
		}
	}

	@SuppressWarnings("unchecked")
	private static void showCustomerByNameAndGender(Session session, String name, String gender) {
		Query query = null;
		List<Customer> customers = null;
		query = session.createQuery("select c from Customer c where c.customer_nm like =? and c.gender =?");
		query.setParameter(0, "%" + name + "%");
		query.setParameter(1, gender);
		customers = query.list();
		for (Customer c : customers) {
			System.out.println(c.getCustomerName() + " " + c.getGender());
		}
	}

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			// showNoOfCustomer(session);
			// showCustomerByGender(session, "male");
			// showCustomerByDobAndGender(session, 1993, "male");
			showCustomerByNameAndGender(session, "a", "male");
		} finally {
			if (session != null) {
				session.close();
			}
		}
		SessionFactoryHelper.close();
	}
}
