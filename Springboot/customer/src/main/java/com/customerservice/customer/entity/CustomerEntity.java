package com.customerservice.customer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CustomerEntity {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public String customername;
	public String password;
	public String address;
	public String state;
	public String country;
	public String emailId;
	public String pan;
	public long contactNo;
	public String dob;
	public String contactPreference;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContactPreference() {
		return contactPreference;
	}
	public void setContactPreference(String contactPreference) {
		this.contactPreference = contactPreference;
	}
	
	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", customername=" + customername + ", password=" + password + ", address="
				+ address + ", state=" + state + ", country=" + country + ", emailId=" + emailId + ", pan=" + pan
				+ ", contactNo=" + contactNo + ", dob=" + dob + ", contactPreference=" + contactPreference + "]";
	}
	public CustomerEntity(String customername, String password, String address, String state, String country,
			String emailId, String pan, long contactNo, String dob, String contactPreference) {
		super();
		this.customername = customername;
		this.password = password;
		this.address = address;
		this.state = state;
		this.country = country;
		this.emailId = emailId;
		this.pan = pan;
		this.contactNo = contactNo;
		this.dob = dob;
		this.contactPreference = contactPreference;
	}
	
		

}
