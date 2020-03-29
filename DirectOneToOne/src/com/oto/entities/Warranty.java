package com.oto.entities;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Warranty implements Serializable {
	protected int productNo;
	protected Date purchaseDate;
	protected int warrantyYears;
	protected Product product;

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
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
		return "Warranty [productNo=" + productNo + ", purchaseDate=" + purchaseDate + ", warrantyYears="
				+ warrantyYears + ", product=" + product + "]";
	}
}
