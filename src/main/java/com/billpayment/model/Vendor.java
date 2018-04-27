package com.billpayment.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendor {
	
	private String vendorName;
	@Id
	private int regNo;
	private int vendorTypeId;
	private String address;
	private String country;
	private String state;
	private String email;
	private int contactNo;
	private String website;
	private Date certIssuedDate;
	private Date certValidityDate;
	private int empCount;
	private int custCount;
	private int estYear;
	
	public Vendor() {
		
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public int getVendorTypeId() {
		return vendorTypeId;
	}
	public void setVendorTypeId(int vendorTypeId) {
		this.vendorTypeId = vendorTypeId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Date getCertIssuedDate() {
		return certIssuedDate;
	}
	public void setCertIssuedDate(Date certIssuedDate) {
		this.certIssuedDate = certIssuedDate;
	}
	public Date getCertValidityDate() {
		return certValidityDate;
	}
	public void setCertValidityDate(Date certValidityDate) {
		this.certValidityDate = certValidityDate;
	}
	public int getEmpCount() {
		return empCount;
	}
	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}
	public int getCustCount() {
		return custCount;
	}
	public void setCustCount(int custCount) {
		this.custCount = custCount;
	}
	public int getEstYear() {
		return estYear;
	}
	public void setEstYear(int estYear) {
		this.estYear = estYear;
	}
	
	

}
