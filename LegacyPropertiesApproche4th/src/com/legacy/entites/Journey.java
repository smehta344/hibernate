package com.legacy.entites;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Journey implements Serializable {
	protected int journeyNo;
	protected String source;
	protected String destination;
	protected Date journeyDate;
	protected float estimatedHours;
	protected int distanceInKm;
	protected double price;

	public int getJourneyNo() {
		return journeyNo;
	}

	public void setJourneyNo(int journeyNo) {
		this.journeyNo = journeyNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public float getEstimatedHours() {
		return estimatedHours;
	}

	public void setEstimatedHours(float estimatedHours) {
		this.estimatedHours = estimatedHours;
	}

	public int getDistanceInKm() {
		return distanceInKm;
	}

	public void setDistanceInKm(int distanceInKm) {
		this.distanceInKm = distanceInKm;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Journey [journeyNo=" + journeyNo + ", source=" + source + ", destination=" + destination
				+ ", journeyDate=" + journeyDate + ", estimatedHours=" + estimatedHours + ", distanceInKm="
				+ distanceInKm + ", price=" + price + "]";
	}

}
