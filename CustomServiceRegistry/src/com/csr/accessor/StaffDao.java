package com.csr.accessor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.csr.entites.Staff;
import com.csr.helper.ServiceRegistryHelper;

public class StaffDao {
	public Staff getStaff(int staffNo) {
		Staff staff = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = ServiceRegistryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			staff = (Staff) session.get(Staff.class, staffNo);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return staff;
	}
}
