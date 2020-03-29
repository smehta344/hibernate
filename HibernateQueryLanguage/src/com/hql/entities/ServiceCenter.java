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
@Table(name = "service_center")
public class ServiceCenter implements Serializable {
	@Id
	@Column(name = "service_center_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int serviceCenterNo;
	@Column(name = "service_center_nm")
	protected String serviceCenterName;
	@Column(name = "primary_contact_no")
	protected String primaryContactNo;
	@Column(name = "secondry_contact_no")
	protected String secondryContactNo;
	@Column(name = "email_address")
	protected String emailAddress;
	protected int ratings;
	protected String timings;
	@Column(name = "registration_no")
	protected String registrationNo;
	@Column(name = "established_dt")
	protected Date establishedDate;
	@Column(name = "working_days")
	protected String workingDays;
	@Column(name = "services_offered")
	protected String servicesOffered;
	@OneToMany(mappedBy = "serviceCenter", fetch = FetchType.LAZY)
	protected Set<Technician> technicians;
	@OneToMany(mappedBy = "serviceCenter", fetch = FetchType.LAZY)
	protected Set<Complaint> complaints;
	@ManyToOne
	@JoinColumn(name = "company_no", nullable = false)
	protected Company company;

	public int getServiceCenterNo() {
		return serviceCenterNo;
	}

	public void setServiceCenterNo(int serviceCenterNo) {
		this.serviceCenterNo = serviceCenterNo;
	}

	public String getServiceCenterName() {
		return serviceCenterName;
	}

	public void setServiceCenterName(String serviceCenterName) {
		this.serviceCenterName = serviceCenterName;
	}

	public String getPrimaryContactNo() {
		return primaryContactNo;
	}

	public void setPrimaryContactNo(String primaryContactNo) {
		this.primaryContactNo = primaryContactNo;
	}

	public String getSecondryContactNo() {
		return secondryContactNo;
	}

	public void setSecondryContactNo(String secondryContactNo) {
		this.secondryContactNo = secondryContactNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public Date getEstablishedDate() {
		return establishedDate;
	}

	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}

	public String getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(String workingDays) {
		this.workingDays = workingDays;
	}

	public String getServicesOffered() {
		return servicesOffered;
	}

	public void setServicesOffered(String servicesOffered) {
		this.servicesOffered = servicesOffered;
	}

	public Set<Technician> getTechnicians() {
		return technicians;
	}

	public void setTechnicians(Set<Technician> technicians) {
		this.technicians = technicians;
	}

	public Set<Complaint> getComplaints() {
		return complaints;
	}

	public void setComplaints(Set<Complaint> complaints) {
		this.complaints = complaints;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + ((establishedDate == null) ? 0 : establishedDate.hashCode());
		result = prime * result + ((primaryContactNo == null) ? 0 : primaryContactNo.hashCode());
		result = prime * result + ratings;
		result = prime * result + ((registrationNo == null) ? 0 : registrationNo.hashCode());
		result = prime * result + ((secondryContactNo == null) ? 0 : secondryContactNo.hashCode());
		result = prime * result + ((serviceCenterName == null) ? 0 : serviceCenterName.hashCode());
		result = prime * result + serviceCenterNo;
		result = prime * result + ((servicesOffered == null) ? 0 : servicesOffered.hashCode());
		result = prime * result + ((timings == null) ? 0 : timings.hashCode());
		result = prime * result + ((workingDays == null) ? 0 : workingDays.hashCode());
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
		ServiceCenter other = (ServiceCenter) obj;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (establishedDate == null) {
			if (other.establishedDate != null)
				return false;
		} else if (!establishedDate.equals(other.establishedDate))
			return false;
		if (primaryContactNo == null) {
			if (other.primaryContactNo != null)
				return false;
		} else if (!primaryContactNo.equals(other.primaryContactNo))
			return false;
		if (ratings != other.ratings)
			return false;
		if (registrationNo == null) {
			if (other.registrationNo != null)
				return false;
		} else if (!registrationNo.equals(other.registrationNo))
			return false;
		if (secondryContactNo == null) {
			if (other.secondryContactNo != null)
				return false;
		} else if (!secondryContactNo.equals(other.secondryContactNo))
			return false;
		if (serviceCenterName == null) {
			if (other.serviceCenterName != null)
				return false;
		} else if (!serviceCenterName.equals(other.serviceCenterName))
			return false;
		if (serviceCenterNo != other.serviceCenterNo)
			return false;
		if (servicesOffered == null) {
			if (other.servicesOffered != null)
				return false;
		} else if (!servicesOffered.equals(other.servicesOffered))
			return false;
		if (timings == null) {
			if (other.timings != null)
				return false;
		} else if (!timings.equals(other.timings))
			return false;
		if (workingDays == null) {
			if (other.workingDays != null)
				return false;
		} else if (!workingDays.equals(other.workingDays))
			return false;
		return true;
	}
}
