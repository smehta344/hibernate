package com.hql.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "technician")
public class Technician implements Serializable {
	@Id
	@Column(name = "tecnician_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int technicianNo;
	@Column(name = "tecnician_nm")
	protected String technicianName;
	protected int experience;
	@Column(name = "mobile_no")
	protected String mobileNo;
	@Column(name = "email_address")
	protected String emailAddress;
	protected String designation;
	@Column(name = "joining_dt")
	protected Date joiningDate;
	protected String skills;
	@OneToMany(mappedBy = "technician", fetch = FetchType.EAGER)
	protected Set<Workorder> workorders;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "service_center_no", nullable = false)
	protected ServiceCenter serviceCenter;

	public int getTechnicianNo() {
		return technicianNo;
	}

	public void setTechnicianNo(int technicianNo) {
		this.technicianNo = technicianNo;
	}

	public String getTechnicianName() {
		return technicianName;
	}

	public void setTechnicianName(String technicianName) {
		this.technicianName = technicianName;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public Set<Workorder> getWorkorders() {
		return workorders;
	}

	public void setWorkorders(Set<Workorder> workorders) {
		this.workorders = workorders;
	}

	public ServiceCenter getServiceCenter() {
		return serviceCenter;
	}

	public void setServiceCenter(ServiceCenter serviceCenter) {
		this.serviceCenter = serviceCenter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + experience;
		result = prime * result + ((joiningDate == null) ? 0 : joiningDate.hashCode());
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
		result = prime * result + ((technicianName == null) ? 0 : technicianName.hashCode());
		result = prime * result + technicianNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Technician other = (Technician) obj;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (experience != other.experience)
			return false;
		if (joiningDate == null) {
			if (other.joiningDate != null)
				return false;
		} else if (!joiningDate.equals(other.joiningDate))
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
			return false;
		if (technicianName == null) {
			if (other.technicianName != null)
				return false;
		} else if (!technicianName.equals(other.technicianName))
			return false;
		if (technicianNo != other.technicianNo)
			return false;
		return true;
	}
}
