package com.hbs.entites;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Provider implements Serializable {

	protected int providerNo;
	protected String providerName;
	protected Date establishDate;
	protected int contactNumber;
	protected String emailAddress;

	public int getProviderNo() {
		return providerNo;
	}

	public void setProviderNo(int providerNo) {
		this.providerNo = providerNo;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public Date getEstablishDate() {
		return establishDate;
	}

	public void setEstablishDate(Date establishDate) {
		this.establishDate = establishDate;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Provider [providerNo=" + providerNo + ", providerName=" + providerName + ", establishDate="
				+ establishDate + ", contactNumber=" + contactNumber + ", emailAddress=" + emailAddress + "]";
	}

}
