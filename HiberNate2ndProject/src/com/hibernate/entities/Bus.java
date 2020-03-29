package com.hibernate.entities;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Bus implements Serializable {
	protected int busNo;
	protected String serviceNo;
	protected String busType;
	protected int seatingCapacity;
	protected String fuleType;
	protected double price;

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getServiceNo() {
		return serviceNo;
	}

	public void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getFuleType() {
		return fuleType;
	}

	public void setFuleType(String fuleType) {
		this.fuleType = fuleType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", serviceNo=" + serviceNo + ", busType=" + busType + ", seatingCapacity="
				+ seatingCapacity + ", fuleType=" + fuleType + ", price=" + price + "]";
	}

}
