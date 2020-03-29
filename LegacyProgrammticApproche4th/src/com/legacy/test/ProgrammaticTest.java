package com.legacy.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.legacy.entites.Journey;

public class ProgrammaticTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		boolean flag = false;
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Journey journey = null;

		try {
			config = new Configuration();
			config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
			config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/support");
			config.setProperty("hibernate.connection.username", "root");
			config.setProperty("hibernate.connection.password", "root");
			config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
			config.setProperty("hibernate.connection.show_sql", "true");
			config.addResource("com/legacy/entites/Journey.hbm.xml");
			factory = config.buildSessionFactory();
			session = factory.openSession();
			journey = new Journey();
			journey = (Journey) session.get(Journey.class, 2);
			System.out.println("data Saved" + journey);
			flag = true;
		} finally {
			if (session != null) {
				session.close();
			}
			if (factory != null) {
				factory.close();
			}

		}
	}
}
