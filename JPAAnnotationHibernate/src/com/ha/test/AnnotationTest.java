package com.ha.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ha.entites.Branch;
import com.ha.helper.SessionFactoryHelper;

public class AnnotationTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		Branch branch = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			branch = new Branch();
			branch.setBranchNo(121);
			branch.setBranchName("Balua Bazar");
			branch.setConnectNo(8479562322L);
			branch.setLocation("Balua");
			branch.setPersionConnect("Sanjeev Kumar");
			session.save(branch);
			System.out.println("Data saved: " + branch);
			flag=true;
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
