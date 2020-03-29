package com.csr.test;

import com.csr.accessor.StaffDao;
import com.csr.entites.Staff;

public class CustomTest {
	public static void main(String[] args) {
		Staff staff = null;
		StaffDao dao = null;
		dao = new StaffDao();
		staff = dao.getStaff(1);
		System.out.println("Staff selected: " + staff);
	}
}
