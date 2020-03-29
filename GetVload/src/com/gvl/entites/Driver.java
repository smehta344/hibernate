package com.gvl.entites;

import java.io.Serializable;

@SuppressWarnings("serial")
public final class Driver implements IDriver, Serializable {
	protected int driverNo;
	protected String driverName;
	protected String gender;
	protected int age;
	protected long mobileNo;
	protected float exprience;
	protected double salary;

	public int getDriverNo() {
		return driverNo;
	}

	public void setDriverNo(int driverNo) {
		this.driverNo = driverNo;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
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

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public float getExprience() {
		return exprience;
	}

	public void setExprience(float exprience) {
		this.exprience = exprience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Driver [driverNo=" + driverNo + ", driverName=" + driverName + ", gender=" + gender + ", age=" + age
				+ ", mobileNo=" + mobileNo + ", exprience=" + exprience + ", salary=" + salary + "]";
	}
}
