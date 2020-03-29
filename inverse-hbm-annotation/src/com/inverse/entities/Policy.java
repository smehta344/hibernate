package com.inverse.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "policy")
public class Policy implements Serializable {
	@Id
	@Column(name = "policy_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int policyNo;
	@Column(name = "plan_name")
	protected String planName;
	@Column(name = "policy_type")
	protected String policyType;
	@Column(name = "policy_issued_date")
	protected Date policyIssuedDate;
	@Column(name = "insured_years")
	protected int insuredYears;
	@Column(name = "sum_insured")
	protected double sumInsured;

	@ManyToOne
	@JoinColumn(name = "member_no")
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
				+ sumInsured + "]";
	}
}
