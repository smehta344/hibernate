package com.hql.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "workorder")
public class Workorder implements Serializable {
	@Id
	@Column(name = "work_order_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int workorderNo;
	@Column(name = "work_order_type")
	protected String workorderType;
	@Column(name = "work_order_created_dt")
	protected Date workorderCreatedDate;
	@Column(name = "work_order_start_dt")
	protected Date workorderStartDate;
	@Column(name = "work_order_end_dt")
	protected Date workorderEndDate;
	protected String status;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "technician_no", nullable = false)
	protected Technician technician;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "complaint_no", nullable = false, unique = true)
	protected Complaint complaint;

	public int getWorkorderNo() {
		return workorderNo;
	}

	public void setWorkorderNo(int workorderNo) {
		this.workorderNo = workorderNo;
	}

	public String getWorkorderType() {
		return workorderType;
	}

	public void setWorkorderType(String workorderType) {
		this.workorderType = workorderType;
	}

	public Date getWorkorderCreatedDate() {
		return workorderCreatedDate;
	}

	public void setWorkorderCreatedDate(Date workorderCreatedDate) {
		this.workorderCreatedDate = workorderCreatedDate;
	}

	public Date getWorkorderStartDate() {
		return workorderStartDate;
	}

	public void setWorkorderStartDate(Date workorderStartDate) {
		this.workorderStartDate = workorderStartDate;
	}

	public Date getWorkorderEndDate() {
		return workorderEndDate;
	}

	public void setWorkorderEndDate(Date workorderEndDate) {
		this.workorderEndDate = workorderEndDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Technician getTechnician() {
		return technician;
	}

	public void setTechnician(Technician technician) {
		this.technician = technician;
	}

	public Complaint getComplaint() {
		return complaint;
	}

	public void setComplaint(Complaint complaint) {
		this.complaint = complaint;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((workorderCreatedDate == null) ? 0 : workorderCreatedDate.hashCode());
		result = prime * result + ((workorderEndDate == null) ? 0 : workorderEndDate.hashCode());
		result = prime * result + workorderNo;
		result = prime * result + ((workorderStartDate == null) ? 0 : workorderStartDate.hashCode());
		result = prime * result + ((workorderType == null) ? 0 : workorderType.hashCode());
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
		Workorder other = (Workorder) obj;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (workorderCreatedDate == null) {
			if (other.workorderCreatedDate != null)
				return false;
		} else if (!workorderCreatedDate.equals(other.workorderCreatedDate))
			return false;
		if (workorderEndDate == null) {
			if (other.workorderEndDate != null)
				return false;
		} else if (!workorderEndDate.equals(other.workorderEndDate))
			return false;
		if (workorderNo != other.workorderNo)
			return false;
		if (workorderStartDate == null) {
			if (other.workorderStartDate != null)
				return false;
		} else if (!workorderStartDate.equals(other.workorderStartDate))
			return false;
		if (workorderType == null) {
			if (other.workorderType != null)
				return false;
		} else if (!workorderType.equals(other.workorderType))
			return false;
		return true;
	}
}
