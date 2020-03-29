package com.mtml.entities;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MedicalCheckup implements Serializable {
	protected int medicalCheckupNo;
	protected String medicalCheckupName;
	protected String description;
	protected double cost;

	public int getMedicalCheckupNo() {
		return medicalCheckupNo;
	}

	public void setMedicalCheckupNo(int medicalCheckupNo) {
		this.medicalCheckupNo = medicalCheckupNo;
	}

	public String getMedicalCheckupName() {
		return medicalCheckupName;
	}

	public void setMedicalCheckupName(String medicalCheckupName) {
		this.medicalCheckupName = medicalCheckupName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "MedicalCheckup [medicalCheckupNo=" + medicalCheckupNo + ", medicalCheckupName=" + medicalCheckupName
				+ ", description=" + description + ", cost=" + cost + "]";
	}
}
