package com.ha.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryHelper {
	private static SessionFactory sessionFactory;

	static {
		Configuration configuration = new Configuration().configure("com/ha/config/hibernate.cfg.xml");
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(registry);
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
