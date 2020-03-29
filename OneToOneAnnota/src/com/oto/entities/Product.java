package com.oto.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@SuppressWarnings("serial")
@Entity
@Table(name = "product")
public class Product implements Serializable {
	@Id
	@Column(name = "product_no")
	@GeneratedValue(generator = "increment_generator")
	@GenericGenerator(name = "increment_generator", strategy = "increment")
	protected int productNo;
	@Column(name = "product_name")
	protected String productName;
	protected String description;
	protected float price;
	
	@OneToOne
	@JoinColumn(name="product_no")
	protected Warranty warranty;

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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Warranty getWarranty() {
		return warranty;
	}

	public void setWarranty(Warranty warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", description=" + description
				+ ", price=" + price + ", warranty=" + warranty + "]";
	}

}
