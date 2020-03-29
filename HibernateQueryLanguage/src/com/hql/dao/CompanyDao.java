package com.hql.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hql.entities.Company;
import com.hql.helper.SessionFactoryHelper;

public class CompanyDao {
	public int saveCompany(Company company) {
		int companyNo = 0;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			companyNo = (int) session.save(company);
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

		return companyNo;
	}
}
