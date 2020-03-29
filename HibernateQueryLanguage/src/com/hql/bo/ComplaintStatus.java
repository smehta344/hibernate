package com.hql.bo;

//we want data in table format
public class ComplaintStatus {
	protected int complaintNo;
	protected String complaintTitle;
	protected String productName;
	protected String serviceCenterName;
	protected String workOrderNo;
	protected String status; //workorder
	
	//for easy populating data
	public ComplaintStatus(int complaintNo, String complaintTitle, String productName, String serviceCenterName,
			String workOrderNo, String status) {
		super();
		this.complaintNo = complaintNo;
		this.complaintTitle = complaintTitle;
		this.productName = productName;
		this.serviceCenterName = serviceCenterName;
		this.workOrderNo = workOrderNo;
		this.status = status;
	}
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
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getServiceCenterName() {
		return serviceCenterName;
	}
	public void setServiceCenterName(String serviceCenterName) {
		this.serviceCenterName = serviceCenterName;
	}
	public String getWorkOrderNo() {
		return workOrderNo;
	}
	public void setWorkOrderNo(String workOrderNo) {
		this.workOrderNo = workOrderNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ComplaintStatus [complaintNo=" + complaintNo + ", complaintTitle=" + complaintTitle + ", productName="
				+ productName + ", serviceCenterName=" + serviceCenterName + ", workOrderNo=" + workOrderNo
				+ ", status=" + status + "]";
	}
	

}
