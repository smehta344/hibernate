package com.jpa.entites;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Ticket implements Serializable {
	protected int ticketNo;
	protected String source;
	protected String destination;
	protected Date journeyDate;
	protected String passengerName;
	protected int age;
	protected String gender;
	protected float amount;

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
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

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Ticket [ticketNo=" + ticketNo + ", source=" + source + ", destination=" + destination + ", journeyDate="
				+ journeyDate + ", passengerName=" + passengerName + ", age=" + age + ", gender=" + gender + ", amount="
				+ amount + "]";
	}
}
