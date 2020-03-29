package com.hbs.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryHelper {
	private static SessionFactory sessionFactory;

	static {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure("com/hbs/config/hibernate.cfg.xml").build();
		MetadataSources metadataSources = new MetadataSources(registry);
		MetadataBuilder metadataBuilder = metadataSources.getMetadataBuilder();
		Metadata metadata = metadataBuilder.build();
		//metadataBuilder.applyImplicitSchemaName("supports");
		//sessionFactory=metadata.buildSessionFactory();
		SessionFactoryBuilder sessionFactoryBuilder = metadata.getSessionFactoryBuilder();
		sessionFactoryBuilder.allowOutOfTransactionUpdateOperations(true);
		//sessionFactoryBuilder.applyAutoClosing(true);
		//sessionFactoryBuilder.applyAutoFlushing(true);
		sessionFactory=sessionFactoryBuilder.build();
		//sessionFactoryBuilder.applyInterceptor(new CustomInterceptor());
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
