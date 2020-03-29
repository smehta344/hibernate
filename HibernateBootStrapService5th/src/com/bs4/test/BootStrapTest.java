package com.bs4.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bs4.entities.Staff;
import com.bs4.helper.SessionFactoryHelper;

public class BootStrapTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Staff staff = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			staff = new Staff();
			staff.setStaffNo(3);
			staff.setStaffFirstName("Sahul");
			staff.setStaffLastName("Eaj");
			staff.setGender("male");
			staff.setAge(22);
			staff.setDesignation("Driver");
			staff.setExperience((float) 3.2);
			session.save(staff);
			System.out.println(staff);
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag)
					transaction.commit();
			} else {
				// transaction.rollback();
			}
			if (session != null) {
				session.close();
			}
			SessionFactoryHelper.close();
		}
	}

}
