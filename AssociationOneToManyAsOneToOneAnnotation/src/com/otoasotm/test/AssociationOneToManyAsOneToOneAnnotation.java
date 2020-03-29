package com.otoasotm.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otoasotm.entities.Address;
import com.otoasotm.entities.Customer;
import com.otoasotm.helper.SessionFactoryHelper;

public class AssociationOneToManyAsOneToOneAnnotation {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		Address address = null;
		Customer customer = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			address = new Address();
			address.setAddressLine1("Sanskrit");
			address.setAddressLine2("Nirmali");
			address.setCity("Patna");
			address.setState("Bihar");
			address.setZip(854339);
			address.setCountry("India");
			session.save(address);

			customer = new Customer();
			customer.setCustomerName("Puja Kumari");
			customer.setDob(new Date());
			customer.setGender("Male");
			customer.setMobileNo(8479995633L);
			customer.setEmailAddress("take.sanjeev344@gmail.com");
			customer.setAddress(address);
			session.save(customer);
			
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			if (session != null) {
				session.close();
			}
		}
		SessionFactoryHelper.close();
	}
}
