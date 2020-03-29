package com.ha.entites;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Table(name = "branch")
@Entity
public class Branch implements Serializable {
	@Column(name = "branch_no")
	@Id
	protected int branchNo;
	@Column(name = "branch_name")
	protected String branchName;
	@Column(name = "connect_no")
	protected long connectNo;
	@Basic(fetch = FetchType.LAZY)
	protected String location;
	@Column(name = "persion_connect")
	protected String persionConnect;

	public int getBranchNo() {
		return branchNo;
	}

	public void setBranchNo(int branchNo) {
		this.branchNo = branchNo;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public long getConnectNo() {
		return connectNo;
	}

	public void setConnectNo(long connectNo) {
		this.connectNo = connectNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPersionConnect() {
		return persionConnect;
	}

	public void setPersionConnect(String persionConnect) {
		this.persionConnect = persionConnect;
	}

	@Override
	public String toString() {
		return "Branch [branchNo=" + branchNo + ", branchName=" + branchName + ", connectNo=" + connectNo
				+ ", location=" + location + ", persionConnect=" + persionConnect + "]";
	}
}
