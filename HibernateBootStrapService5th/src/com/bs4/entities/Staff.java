package com.bs4.entities;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Staff implements Serializable {
	protected int staffNo;
	protected String staffFirstName;
	protected String staffLastName;
	protected String gender;
	protected int age;
	protected String designation;
	protected float experience;

	public int getStaffNo() {
		return staffNo;
	}

	public void setStaffNo(int staffNo) {
		this.staffNo = staffNo;
	}

	public String getStaffFirstName() {
		return staffFirstName;
	}

	public void setStaffFirstName(String staffFirstName) {
		this.staffFirstName = staffFirstName;
	}

	public String getStaffLastName() {
		return staffLastName;
	}

	public void setStaffLastName(String staffLastName) {
		this.staffLastName = staffLastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Staff [staffNo=" + staffNo + ", staffFirstName=" + staffFirstName + ", staffLastName=" + staffLastName
				+ ", gender=" + gender + ", age=" + age + ", designation=" + designation + ", experience=" + experience
				+ "]";
	}
}
