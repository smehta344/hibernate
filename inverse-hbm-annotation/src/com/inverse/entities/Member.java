package com.inverse.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "member")
public class Member implements Serializable {
	@Id
	@Column(name = "member_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int memberNo;
	@Column(name = "member_name")
	protected String memberName;
	protected int age;
	protected String gender;
	@Column(name = "mobile_no")
	protected String mobileNo;
	@Column(name = "email_address")
	protected String emailAddress;

	@OneToMany // (mappedBy = "member")
	@JoinColumn(name = "member_no", insertable = false, updatable = false)
	protected Set<Policy> policies;

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
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

	public Set<Policy> getPolicies() {
		return policies;
	}

	public void setPolicies(Set<Policy> policies) {
		this.policies = policies;
	}

	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberName=" + memberName + ", age=" + age + ", gender=" + gender
				+ ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + ", policies=" + policies + "]";
	}
}
