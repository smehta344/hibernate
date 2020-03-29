package com.oto.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@SuppressWarnings("serial")
@Entity
@Table(name = "warranty")
public class Warranty implements Serializable {
	@Id
	@Column(name = "product_no")
	@GeneratedValue(generator = "foreign_generator")
	@GenericGenerator(name = "foreign_generator", strategy = "foreign", parameters = {
			@Parameter(name = "property", value = "product") })
	protected int productNo;
	@Column(name = "purches_date")
	protected Date purchesDate;
	@Column(name = "manufacturer_name")
	protected String manufacturerName;
	@Column(name = "warranty_years")
	protected int warrantyYears;

	@OneToOne
	@JoinColumn(name = "product_no")
	protected Product product;

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public Date getPurchesDate() {
		return purchesDate;
	}

	public void setPurchesDate(Date purchesDate) {
		this.purchesDate = purchesDate;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public int getWarrantyYears() {
		return warrantyYears;
	}

	public void setWarrantyYears(int warrantyYears) {
		this.warrantyYears = warrantyYears;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Warranty [productNo=" + productNo + ", purchesDate=" + purchesDate + ", manufacturerName="
				+ manufacturerName + ", warrantyYears=" + warrantyYears + "]";
	}
}
