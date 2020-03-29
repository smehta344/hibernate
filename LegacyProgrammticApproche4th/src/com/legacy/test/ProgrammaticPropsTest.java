package com.legacy.test;

import java.io.IOException;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.legacy.entites.Journey;

public class ProgrammaticPropsTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("unused")
		boolean flag = false;
		Configuration configuration = null;
		SessionFactory factory = null;
		Properties prop = null;
		Session session = null;
		Journey journey = null;
		try {
			prop = new Properties();
			prop.load(ProgrammaticPropsTest.class.getClassLoader().getResourceAsStream("hibernate.properties"));
			System.out.println("Sanjeev"+prop);
			configuration = new Configuration();
			configuration.setProperty("hibernate.connection.driver_class", prop.getProperty("driver_class"));
			configuration.setProperty("hibernate.connection.url", prop.getProperty("url"));
			configuration.setProperty("hibernate.connection.username", prop.getProperty("username"));
			configuration.setProperty("hibernate.connection.password", prop.getProperty("password"));
			configuration.setProperty("hibernate.dialect", prop.getProperty("dialect"));
			configuration.setProperty("hibernate.show_sql", prop.getProperty("show_sql"));
			configuration.addResource("com/legacy/entites/Journey.hbm.xml");
			factory = configuration.buildSessionFactory();
			session = factory.openSession();
			journey = new Journey();
			journey = (Journey) session.get(Journey.class, 1);
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