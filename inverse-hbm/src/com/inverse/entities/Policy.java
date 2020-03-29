package com.inverse.entities;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Policy implements Serializable {
	protected int policyNo;
	protected String planName;
	protected String policyType;
	protected Date policyIssuedDate;
	protected int insuredYears;
	protected double sumInsured;
	protected Member member;

	public int getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public Date getPolicyIssuedDate() {
		return policyIssuedDate;
	}

	public void setPolicyIssuedDate(Date policyIssuedDate) {
		this.policyIssuedDate = policyIssuedDate;
	}

	public int getInsuredYears() {
		return insuredYears;
	}

	public void setInsuredYears(int insuredYears) {
		this.insuredYears = insuredYears;
	}

	public double getSumInsured() {
		return sumInsured;
	}

	public void setSumInsured(double sumInsured) {
		this.sumInsured = sumInsured;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "Policy [policyNo=" + policyNo + ", planName=" + planName + ", policyType=" + policyType
				+ ", policyIssuedDate=" + policyIssuedDate + ", insuredYears=" + insuredYears + ", sumInsured="
				+ sumInsured + ", member=" + member + "]";
	}
}
