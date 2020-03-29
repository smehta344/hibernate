package com.kg.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryHelper {
	private static SessionFactory sessionFactory;

	static {
		Configuration configuration = new Configuration().configure("com/kg/config/hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory(
				new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
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
