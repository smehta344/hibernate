package com.mtml.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtml.entities.MedicalCheckup;
import com.mtml.entities.Patient;
import com.mtml.helper.SessionFactoryHelper;

public class MTMLTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		MedicalCheckup medicalCheckup1 = null;
		MedicalCheckup medicalCheckup2 = null;
		Patient patient = null;
		List<MedicalCheckup> medicalCheckups = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			medicalCheckup1 = new MedicalCheckup();
			medicalCheckup1.setMedicalCheckupName("Blood test");
			medicalCheckup1.setDescription("With Fasting");
			medicalCheckup1.setCost(260.00);
			session.save(medicalCheckup1);

			medicalCheckup2 = new MedicalCheckup();
			medicalCheckup2.setMedicalCheckupName("Thyroid test");
			medicalCheckup2.setDescription("Normal");
			medicalCheckup2.setCost(500.00);
			session.save(medicalCheckup2);

			medicalCheckups = new ArrayList<>();
			patient = new Patient();
			patient.setPatientName("Puja");
			patient.setAge(25);
			patient.setGender("female");
			patient.setMobileNo("9577856225");
			patient.setEmailAddress("puja@gmail.com");
			medicalCheckups.add(medicalCheckup2);
			medicalCheckups.add(medicalCheckup1);
			patient.setMedicalChecks(medicalCheckups);
			session.save(patient);

			patient = (Patient) session.get(Patient.class, 1);
			System.out.println(patient);

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
