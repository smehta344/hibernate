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
@Table(name = "complaint")
public class Complaint implements Serializable {
	@Id
	@Column(name = "complaint_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int complaintNo;
	@Column(name = "complaint_title")
	protected String complaintTitle;
	protected String description;
	@Column(name = "reported_dt")
	protected Date reportedDate;
	protected String status;
	@Column(name = "estimated_completion_date")
	protected Date estimatedCompletionDate;
	@Column(name = "estimated_cost")
	protected double estimatedCost;
	protected int priority;
	@OneToMany(mappedBy = "complaint", fetch = FetchType.EAGER)
	protected Set<Workorder> workorders;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "service_center_no", nullable = true)
	protected ServiceCenter serviceCenter;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_no", nullable = false)
	protected Product product;

	public int getComplaintNo() {
		return complaintNo;
	}

	public void setComplaintNo(int complaintNo) {
		this.complaintNo = complaintNo;
	}

	public String getComplaintTitle() {
		return complaintTitle;
	}

	public void setComplaintTitle(String complaintTitle) {
		this.complaintTitle = complaintTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getReportedDate() {
		return reportedDate;
	}

	public void setReportedDate(Date reportedDate) {
		this.reportedDate = reportedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getEstimatedCompletionDate() {
		return estimatedCompletionDate;
	}

	public void setEstimatedCompletionDate(Date estimatedCompletionDate) {
		this.estimatedCompletionDate = estimatedCompletionDate;
	}

	public double getEstimatedCost() {
		return estimatedCost;
	}

	public void setEstimatedCost(double estimatedCost) {
		this.estimatedCost = estimatedCost;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + complaintNo;
		result = prime * result + ((complaintTitle == null) ? 0 : complaintTitle.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((estimatedCompletionDate == null) ? 0 : estimatedCompletionDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(estimatedCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + priority;
		result = prime * result + ((reportedDate == null) ? 0 : reportedDate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Complaint other = (Complaint) obj;
		if (complaintNo != other.complaintNo)
			return false;
		if (complaintTitle == null) {
			if (other.complaintTitle != null)
				return false;
		} else if (!complaintTitle.equals(other.complaintTitle))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (estimatedCompletionDate == null) {
			if (other.estimatedCompletionDate != null)
				return false;
		} else if (!estimatedCompletionDate.equals(other.estimatedCompletionDate))
			return false;
		if (Double.doubleToLongBits(estimatedCost) != Double.doubleToLongBits(other.estimatedCost))
			return false;
		if (priority != other.priority)
			return false;
		if (reportedDate == null) {
			if (other.reportedDate != null)
				return false;
		} else if (!reportedDate.equals(other.reportedDate))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
}
