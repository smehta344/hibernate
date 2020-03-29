package com.hql.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hql.bo.ComplaintStatus;
import com.hql.entities.Complaint;
import com.hql.entities.Customer;
import com.hql.entities.Product;
import com.hql.entities.Technician;
import com.hql.helper.SessionFactoryHelper;

//N+1 problem in hibernate(Solved by fetch=sub-select) or wrinting join fetch query in jpa(is doesnot support sub-select)
public class HqlQueryTest {

	public static void showNoOfCustomer(Session session) {
		Query query = null;
		// List<Customer> customers=null;
		long count;
		query = session.createQuery("select count(c) from Customer c");
		count = (Long) query.uniqueResult();
		System.out.println(count);
	}

	@SuppressWarnings("unchecked")
	public static void showCustomerByGender(Session session, String gender) {
		Query query;
		List<Customer> customers = null;
		query = session.createQuery("select c from Customer c where c.gender=?");
		query.setParameter(0, gender);
		customers = query.list();
		for (Customer c : customers) {
			System.out.println("List of customers :" + c.getCustomerName());
		}
	}

	@SuppressWarnings("unchecked")
	public static void showCustomerByDob(Session session, int dob) {
		Query query = null;
		List<Customer> customers;
		query = session.createQuery("select c from Customer c where year(c.dob)>=?");
		query.setParameter(0, dob);
		customers = query.list();
		for (Customer customer : customers) {
			System.out.println("List :" + customer.getCustomerName());
		}
	}

	@SuppressWarnings("unchecked")
	public static void showCustomerByDobAndGender(Session session, int dob, String gender) {
		Query query = null;
		List<Customer> customers = null;
		query = session.createQuery("select c from Customer c where year(c.dob)>=? and c.gender=?");
		query.setParameter(0, dob);
		query.setParameter(1, gender);
		customers = query.list();
		for (Customer c : customers) {
			System.out.println("Customer name=" + c.getCustomerName() + "    DOB :" + c.getDob());
		}
	}

	@SuppressWarnings("unchecked")
	public static void showCustomerByDobName(Session session, String name, String gender) {
		// If the full name don't know
		Query query = null;
		List<Customer> customers = null;
		query = session.createQuery("select c from Customer c where c.customerName like ? and c.gender=?");
		query.setParameter(0, name);
		query.setParameter(1, gender);
		customers = query.list();
		for (Customer c : customers) {
			System.out.println("Customer name :  " + c.getCustomerName());
		}
	}

	@SuppressWarnings("unchecked")
	public static void showTechnicianByExperienceAndDesignation(Session session, int experience, String designation) {
		Query query = null;
		List<Technician> technicians = null;
		query = session.createQuery("select t from Technician t where t.experience>=? and t.designation=?");
		query.setParameter(0, experience);
		query.setParameter(1, designation);
		technicians = query.list();
		for (Technician t : technicians) {
			System.out.println("technician names  :" + t.getTechnicianName());
		}
	}

	// complete
	@SuppressWarnings({ "unchecked", "unused" })
	private static void showTechnicianByExperience(Session session) {
		Query query = null;
		List<Object[]> records = null;
		query = session.createQuery("select t.experience, count(t) from Technician t group by t.experience");
		records = query.list();
		for (Object[] row : records) {
			System.out.println("Experience :" + row[0] + "Total no :" + row[1]);
		}

	}

	// Customer who bought tv
	@SuppressWarnings("unchecked")
	public static void getCustomerByProductName(Session session, String productName) {
		Query query = null;
		List<Customer> customers = null;
		// SELECT c.* FROM customer c INNER JOIN product p ON
		// c.customer_no=p.customer_no WHERE p.product_nm='TV'; SQL Query
		// query=session.createQuery("select c from Customer c inner join Product p on
		// c.customerNo=p.customerNo where p.productName=?");
		query = session.createQuery("select c from Customer c inner join  c.products p where p.productName=?");
		query.setParameter(0, productName);
		customers = query.list();
		for (Customer c : customers) {
			System.out.println("Customer having TV : " + c.getCustomerName());
		}
	}

	@SuppressWarnings({ "unchecked", "unused" })
	private static void showCustomerAndProductByDate(Session session, int productDate) { // long productDate not correct
		Query query = null;
		List<Object[]> rows = null;

		// SQL SELECT c.* FROM customer c INNER JOIN product p ON
		// c.customer_no=p.customer_no WHERE p.purchase_dt>2016;
		// query=session.createQuery("select c.customerName,p.productName from Customer
		// c inner join c.products p where year(p.purchaseDate)>?"); //products is the
		// attribute defibed in the Customer class
		query = session.createQuery(
				"select c.customerName,p.productName from Customer c inner join c.products p where year(p.purchaseDate)>?"); // products
		query.setParameter(0, productDate);
		rows = query.list();
		for (Object[] record : rows) {
			System.out.println("Customer name: " + record[0] + "  Product :" + record[1]);
		}
	}

	// Incomplete
	@SuppressWarnings({ "unused", "unchecked" })
	private static void showServiceCenterByComplaint(Session session) {
		Query query = null;
		List<Object[]> rows = null;

		// SQL SELECT c.* FROM customer c INNER JOIN product p ON
		// c.customer_no=p.customer_no WHERE p.purchase_dt>2016;
		query = session.createQuery(
				"select sc.serviceCenterName,count(c.complaintNo) from ServiceCenter sc inner join sc.complaints c group by sc.serviceCenterNo");
		// query=session.createQuery("select sc.serviceCenterName,count(sc.complaints)
		// from ServiceCenter sc group by sc.serviceCentereNo ") ; check

		rows = query.list();
		for (Object[] record : rows) {
			System.out.println("ServiceCenter name: " + record[0] + "  Product :" + record[1]);
		}
	}

	// Inner+left outer join ****
	@SuppressWarnings({ "unused", "unchecked" })
	private static void showPendingComplaint(Session session) {
		Query query = null;
		ComplaintStatus complaintStatus = null;
		List<ComplaintStatus> complaints = null;
		List<Object[]> records = null;
		query = session.createQuery(
				"select c.complaintNo,c.complaintTitle,c.product.productName sc.serviceCenterName,w.workorderNo,w.status from Complaint c left outer join c.serviceCenter left outer join c.workorders ");
		records = query.list();
		for (Object[] row : records) {
			complaints = new ArrayList<>();
			complaintStatus = new ComplaintStatus((Integer) row[0], (String) row[1], (String) row[2], (String) row[3],
					(String) row[4], (String) row[5]); // Typecast from object
			System.out.println(complaintStatus);
		}
	}

	@SuppressWarnings({ "unused", "unchecked" })
	private static void showTechnicianWithPendingComplaints(Session session, String status) {
		Query query = null;
		List<Object[]> records = null;
		query = session.createQuery(
				"select t.technicianName,c.complaintNo,c.complaintTitle from Technician t inner join t.workorders w inner join w.complaint c where w.status=?"); // workorders
																																									// is
																																									// a
																																									// set
																																									// attribute
		query.setParameter(0, status);
		records = query.list();
		for (Object[] row : records) {
			System.out.println("Technician Name :" + row[0] + "ComplaintNo:" + row[1] + "ComplaintTitle:" + row[2]);
		}
	}

	@SuppressWarnings({ "unchecked", "unused" })
	private static void nPlus1Problem(Session session) {
		Query query = null;
		List<Product> products = null;
		query = session.createQuery("from Product p"); // One Query
		products = query.list();
		for (Product p : products) {
			// System.out.println(p.getProductName());
			Set<Complaint> complaints = null;
			complaints = p.getComplaints(); // Again one query will run tht means n queries and 1more for each
			for (Complaint c : complaints) {
				System.out.println(c.getComplaintTitle());
			}

		}

	}

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;

		boolean flag = false;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			// showNoOfCustomer(session);
			// showCustomerByGender(session, "female");
			// showCustomerByDob(session, 1995);
			// showCustomerByDobAndGender(session, 2005, "female");
			// showCustomerByDobName(session, "%a%", "male");
			// showTechnicianByExperienceAndDesignation(session, 2, "technical engineer");
			// //for promotion
			// getCustomerByProductName(session, "TV");
			// showCustomerAndProductByDate(session, 2015);
			// showTechnicianByExperience(session);
			showServiceCenterByComplaint(session);
			// showPendingComplaint(session);
			// showTechnicianWithPendingComplaints(session, "pending");
			// nPlus1Problem(session);

			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			SessionFactoryHelper.close();
		}

	}
}
