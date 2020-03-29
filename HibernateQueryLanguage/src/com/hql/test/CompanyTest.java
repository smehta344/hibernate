package com.hql.test;

import java.util.Date;

import com.hql.dao.CompanyDao;
import com.hql.entities.Company;
import com.hql.helper.SessionFactoryHelper;

public class CompanyTest {
	public static void main(String[] args) {
		CompanyDao companyDao = null;
		Company company = null;
		companyDao = new CompanyDao();
		company = new Company();
		company.setCompanyName("Dell");
		company.setEstablishedDate(new Date(1998 - 01 - 25));
		company.setLicenseNo("DELL4562");
		company.setRegisteredBusinessName("Dell Marcket");

		int companyNo = companyDao.saveCompany(company);
		System.out.println(companyNo);
		SessionFactoryHelper.close();
	}
}
