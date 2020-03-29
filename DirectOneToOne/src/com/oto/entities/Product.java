package com.oto.entities;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Product implements Serializable {
	protected int productNo;
	protected String productName;
	protected String menufecturerName;
	protected String description;
	protected float price;

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

	public String getMenufecturerName() {
		return menufecturerName;
	}

	public void setMenufecturerName(String menufecturerName) {
		this.menufecturerName = menufecturerName;
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

	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", menufecturerName="
				+ menufecturerName + ", description=" + description + ", price=" + price + "]";
	}
}
