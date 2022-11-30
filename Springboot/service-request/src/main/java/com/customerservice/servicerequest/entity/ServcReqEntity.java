package com.customerservice.servicerequest.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ServcReqEntity {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reqId;
	private String reqName;
	private String reqdescription;
	private String serviceType;
	private String assignedTo;
	private String reqStatus;
	private Date date;
	private String customerName;
	private int customerId;
	public ServcReqEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getReqId() {
		return reqId;
	}
	public void setReqId(int reqId) {
		this.reqId = reqId;
	}
	public String getReqName() {
		return reqName;
	}
	public void setReqName(String reqName) {
		this.reqName = reqName;
	}
	public String getReqdescription() {
		return reqdescription;
	}
	public void setReqdescription(String reqdescription) {
		this.reqdescription = reqdescription;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getReqStatus() {
		return reqStatus;
	}
	public void setReqStatus(String reqStatus) {
		this.reqStatus = reqStatus;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "ServcReqEntity [reqId=" + reqId + ", reqName=" + reqName + ", reqdescription=" + reqdescription
				+ ", serviceType=" + serviceType + ", assignedTo=" + assignedTo + ", reqStatus=" + reqStatus + ", date="
				+ date + ", customerName=" + customerName + ", customerId=" + customerId + "]";
	}
	
	

}
