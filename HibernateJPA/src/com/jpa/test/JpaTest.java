package com.jpa.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jpa.entites.Ticket;

public class JpaTest {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Persistence persistence = null;
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		Ticket ticket = null;
		boolean flag = false;
		try {
			entityManagerFactory = persistence.createEntityManagerFactory("ticket-support");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			ticket = new Ticket();
			ticket.setTicketNo(5633);
			ticket.setSource("Hyderabad");
			ticket.setDestination("Kolkata");
			ticket.setJourneyDate(new Date());
			ticket.setPassengerName("Sanjeev");
			ticket.setAge(25);
			ticket.setGender("Male");
			ticket.setAmount(562.2f);
			entityManager.persist(ticket);
			flag = true;
		} finally {
		}
		if (entityTransaction != null) {
			if (flag) {
				entityTransaction.commit();
			} else {
				entityTransaction.rollback();
			}
			entityManager.close();
		}
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
	}
}
