package com.oto.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.oto.entities.Product;
import com.oto.entities.Warranty;
import com.oto.helper.SessionFactoryHelper;

public class OneToOneTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Product product = null;
		Warranty warranty = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			product = new Product();
			product.setProductName("LG TV");
			product.setDescription("LG Telivision");
			product.setPrice(300000.25f);
			session.save(product);
			System.out.println("Product no :" + product.getProductNo());

			warranty = new Warranty();
			warranty.setPurchesDate(new Date());
			warranty.setManufacturerName("Dell");
			warranty.setWarrantyYears(2);
			warranty.setProduct(product);
			session.save(warranty);
			System.out.println("Warranty no :" + warranty.getProductNo());

			warranty = (Warranty) session.get(Warranty.class, 1);
			System.out.println(warranty);
			
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
				session.close();
			}

			SessionFactoryHelper.close();
		}

	}
}
