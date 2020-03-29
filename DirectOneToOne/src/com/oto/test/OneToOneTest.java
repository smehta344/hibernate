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
			product.setProductName("Laptop");
			product.setMenufecturerName("HP");
			product.setDescription("HP");
			product.setPrice(30000.23f);
			session.saveOrUpdate(product);
			System.out.println("Product no product table :" + product.getProductNo());

			warranty = new Warranty();
			warranty.setPurchaseDate(new Date());
			warranty.setWarrantyYears(1);
			warranty.setProduct(product);
			session.saveOrUpdate(warranty);
			System.out.println("Product no warranty table :" + warranty.getProductNo());
			
			
			warranty = (Warranty) session.get(Warranty.class, 2);
			System.out.println(warranty);
			
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			session.close();
		}
		SessionFactoryHelper.close();
	}
}
