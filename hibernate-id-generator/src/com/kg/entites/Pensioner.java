package com.kg.entites;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Pensioner implements Serializable {
	protected int pensionerNo;
	protected String firstName;
	protected String lastName;
	protected Date dob;
	protected String gender;
	protected long mobileNumber;
	protected String emailAddress;
	protected String addressLine1;
	protected String addressLine2;
	protected String state;
	protected int zip;
	protected String country;

	public int getPensionerNo() {
		return pensionerNo;
	}

	public void setPensionerNo(int pensionerNo) {
		this.pensionerNo = pensionerNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Pensioner [pensionerNo=" + pensionerNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + ", gender=" + gender + ", mobileNumber=" + mobileNumber + ", emailAddress="
				+ emailAddress + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", state="
				+ state + ", zip=" + zip + ", country=" + country + "]";
	}

}
