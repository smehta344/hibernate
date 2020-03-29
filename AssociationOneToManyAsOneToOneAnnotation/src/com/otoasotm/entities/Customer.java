package com.otoasotm.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@SuppressWarnings("serial")
@Entity
@Table(name = "customer")
public class Customer implements Serializable {
	@Id
	@GeneratedValue(generator = "increment_generator")
	@GenericGenerator(strategy = "increment", name = "increment_generator")
	@Column(name = "customer_no")
	protected int customerNo;
	@Column(name = "customer_name")
	protected String customerName;
	protected Date dob;
	protected String gender;
	@Column(name = "mobile_no")
	protected Long mobileNo;
	@Column(name = "email_address")
	protected String emailAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	public Customer() {
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerNo=" + customerNo + ", customerName=" + customerName + ", dob=" + dob + ", gender="
				+ gender + ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + ", address=" + address + "]";
	}

}
