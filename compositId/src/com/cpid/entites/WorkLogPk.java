package com.cpid.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
//@Entity
//@Table(name = "work_log_pk")
public class WorkLogPk implements Serializable {
	@Column(name = "job_sheet_no")
	protected String jobSheetNo;
	@Column(name = "staff_no")
	protected int staffNo;

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

	@Override
	public String toString() {
		return "WorkLogpk [jobSheetNo=" + jobSheetNo + ", staffNo=" + staffNo + "]";
	}
}
