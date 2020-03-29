package com.msf.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryHelper {
	private static SessionFactory sessionFactory;
	static {
		Configuration configuration = new Configuration().configure("com/msf/common/hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void close() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
