package com.mtml.entities;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class Patient implements Serializable {
	protected int patientNo;
	protected String patientName;
	protected int age;
	protected String gender;
	protected String mobileNo;
	protected String emailAddress;
	protected List<MedicalCheckup> medicalChecks;

	public int getPatientNo() {
		return patientNo;
	}

	public void setPatientNo(int patientNo) {
		this.patientNo = patientNo;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public List<MedicalCheckup> getMedicalChecks() {
		return medicalChecks;
	}

	public void setMedicalChecks(List<MedicalCheckup> medicalChecks) {
		this.medicalChecks = medicalChecks;
	}

	@Override
	public String toString() {
		return "Patient [patientNo=" + patientNo + ", patientName=" + patientName + ", age=" + age + ", gender="
				+ gender + ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + ", medicalChecks="
				+ medicalChecks + "]";
	}
}
