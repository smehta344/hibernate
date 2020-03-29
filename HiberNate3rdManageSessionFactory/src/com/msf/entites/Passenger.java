package com.msf.entites;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Passenger implements Serializable {
	protected int passengerNo;
	protected String passengerFirstName;
	protected String passengerLastName;
	protected int age;
	protected String gender;
	protected String mobileNo;
	protected String emailAddress;

	public int getPassengerNo() {
		return passengerNo;
	}

	public void setPassengerNo(int passengerNo) {
		this.passengerNo = passengerNo;
	}

	public String getPassengerFirstName() {
		return passengerFirstName;
	}

	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}

	public String getPassengerLastName() {
		return passengerLastName;
	}

	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Passenger [passengerNo=" + passengerNo + ", passengerFirstName=" + passengerFirstName
				+ ", passengerLastName=" + passengerLastName + ", age=" + age + ", gender=" + gender + ", mobileNo="
				+ mobileNo + ", emailAddress=" + emailAddress + "]";
	}

}
