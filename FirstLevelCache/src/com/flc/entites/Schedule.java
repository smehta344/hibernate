package com.flc.entites;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Schedule implements Serializable {
	protected int stationNo;
	protected String source;
	protected String destination;
	protected Date departureDate;
	protected Date arrivalTime;

	public int getStationNo() {
		return stationNo;
	}

	public void setStationNo(int stationNo) {
		this.stationNo = stationNo;
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

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	@Override
	public String toString() {
		return "Schedule [stationNo=" + stationNo + ", source=" + source + ", destination=" + destination
				+ ", departureDate=" + departureDate + ", arrivalTime=" + arrivalTime + "]";
	}
}
