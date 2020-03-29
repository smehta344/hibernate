package com.hql.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "company")
public class Company implements Serializable {
	@Id
	@Column(name = "company_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int companyNo;
	@Column(name = "company_nm")
	protected String companyName;
	@Column(name = "established_dt")
	protected Date establishedDate;
	@Column(name = "registered_business_nm")
	protected String registeredBusinessName;
	@Column(name = "license_no")
	protected String licenseNo;
	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	protected Set<ServiceCenter> serviceCenters;
	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	protected Set<Product> products;

	public int getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(int companyNo) {
		this.companyNo = companyNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getEstablishedDate() {
		return establishedDate;
	}

	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}

	public String getRegisteredBusinessName() {
		return registeredBusinessName;
	}

	public void setRegisteredBusinessName(String registeredBusinessName) {
		this.registeredBusinessName = registeredBusinessName;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public Set<ServiceCenter> getServiceCenters() {
		return serviceCenters;
	}

	public void setServiceCenters(Set<ServiceCenter> serviceCenters) {
		this.serviceCenters = serviceCenters;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + companyNo;
		result = prime * result + ((establishedDate == null) ? 0 : establishedDate.hashCode());
		result = prime * result + ((licenseNo == null) ? 0 : licenseNo.hashCode());
		result = prime * result + ((registeredBusinessName == null) ? 0 : registeredBusinessName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (companyNo != other.companyNo)
			return false;
		if (establishedDate == null) {
			if (other.establishedDate != null)
				return false;
		} else if (!establishedDate.equals(other.establishedDate))
			return false;
		if (licenseNo == null) {
			if (other.licenseNo != null)
				return false;
		} else if (!licenseNo.equals(other.licenseNo))
			return false;
		if (registeredBusinessName == null) {
			if (other.registeredBusinessName != null)
				return false;
		} else if (!registeredBusinessName.equals(other.registeredBusinessName))
			return false;
		return true;
	}
}
