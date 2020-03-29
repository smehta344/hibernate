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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "product")
public class Product implements Serializable {
	@Id
	@Column(name = "product_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int productNo;
	@Column(name = "product_nm")
	protected String productName;
	protected String description;
	@Column(name = "purchase_dt")
	protected Date purchaseDate;
	@Column(name = "serial_no")
	protected String serialNo;
	@Column(name = "tag_no")
	protected String tagNO;
	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
	protected Set<Complaint> complaints;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_no", nullable = true)
	protected Customer customer;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "comany_no", nullable = false)
	protected Company company;

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getTagNO() {
		return tagNO;
	}

	public void setTagNO(String tagNO) {
		this.tagNO = tagNO;
	}

	public Set<Complaint> getComplaints() {
		return complaints;
	}

	public void setComplaints(Set<Complaint> complaints) {
		this.complaints = complaints;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + productNo;
		result = prime * result + ((purchaseDate == null) ? 0 : purchaseDate.hashCode());
		result = prime * result + ((serialNo == null) ? 0 : serialNo.hashCode());
		result = prime * result + ((tagNO == null) ? 0 : tagNO.hashCode());
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
		Product other = (Product) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productNo != other.productNo)
			return false;
		if (purchaseDate == null) {
			if (other.purchaseDate != null)
				return false;
		} else if (!purchaseDate.equals(other.purchaseDate))
			return false;
		if (serialNo == null) {
			if (other.serialNo != null)
				return false;
		} else if (!serialNo.equals(other.serialNo))
			return false;
		if (tagNO == null) {
			if (other.tagNO != null)
				return false;
		} else if (!tagNO.equals(other.tagNO))
			return false;
		return true;
	}
}
