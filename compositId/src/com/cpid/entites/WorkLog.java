package com.cpid.entites;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "work_log")
public class WorkLog implements Serializable {

	protected String jobSheetNo;
	protected int staffNo;

	@EmbeddedId
	protected WorkLogPk pk;
	protected String description;
	protected String comments;

	public WorkLogPk getPk() {
		return pk;
	}

	public void setPk(WorkLogPk pk) {
		this.pk = pk;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "WorkLog [pk=" + pk + ", description=" + description + ", comments=" + comments + "]";
	}

	public String getJobSheetNo() {
		return jobSheetNo;
	}

	public void setJobSheetNo(String jobSheetNo) {
		this.jobSheetNo = jobSheetNo;
	}

	public int getStaffNo() {
		return staffNo;
	}

	public void setStaffNo(int staffNo) {
		this.staffNo = staffNo;
	}

}
