package com.cpid.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cpid.entites.WorkLog;
import com.cpid.entites.WorkLogPk;
import com.cpid.helper.SessionFactoryHelper;

public class CPITest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		WorkLog log = null;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			log = new WorkLog();

			log.setJobSheetNo("job11");
			log.setStaffNo(21);
			log.setDescription("Sw.Engineer");
			log.setComments("Good Job");

			WorkLogPk workLog = new WorkLogPk();
			workLog.setJobSheetNo("job12");
			workLog.setStaffNo(23);
			log = (WorkLog) session.get(WorkLog.class, workLog);
			session.saveOrUpdate(workLog);
			System.out.println("WORKLOGpk : " + workLog.getJobSheetNo());
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
