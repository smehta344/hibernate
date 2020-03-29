package com.dml.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dml.entites.Student;
import com.dml.helper.SessionFactoryHelper;

public class DmlOperationTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		Student student = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			student = new Student();

			student.setFirstName("Mohan");
			student.setLastName("Kumar");
			student.setGender("male");
			student.setAge(23);
			student.setMobileNumber("847995645");
			student.setEmailAddress("mohan@gmail.com");
			session.save(student);
			System.out.println("Data saved: " + student);
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
