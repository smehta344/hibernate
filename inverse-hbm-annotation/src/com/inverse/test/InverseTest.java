package com.inverse.test;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.inverse.entities.Member;
import com.inverse.entities.Policy;
import com.inverse.helper.SessionFactoryHelper;

public class InverseTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Member member = null;
		Policy policy1 = null;
		Policy policy2 = null;
		Set<Policy> policies = null;
		boolean flag = false;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			/*
			 * member = new Member(); member.setMemberName("Puja"); member.setAge(23);
			 * member.setGender("female"); member.setMobileNo("8479995633");
			 * member.setEmailAddress("puja@gmail.com"); member.setPolicies(policies);
			 * 
			 * policy1 = new Policy(); policy1.setPlanName("Jeevan Sathi");
			 * policy1.setPolicyType("Endowment"); policy1.setPolicyIssuedDate(new Date());
			 * policy1.setInsuredYears(32); policy1.setSumInsured(200000.00);
			 * policy1.setMember(member);
			 * 
			 * policy2 = new Policy(); policy2.setPlanName("Jeevan Chhaya");
			 * policy2.setPolicyType("Endowment"); policy2.setPolicyIssuedDate(new Date());
			 * policy2.setInsuredYears(35); policy2.setSumInsured(150000.00);
			 * policy2.setMember(member);
			 * 
			 * policies = new HashSet<>(); policies.add(policy1); policies.add(policy2);
			 * 
			 * session.save(member); session.save(policy1); session.save(policy2);
			 */
			member = (Member) session.get(Member.class, 1);
			System.out.println(member.getMemberName());

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
