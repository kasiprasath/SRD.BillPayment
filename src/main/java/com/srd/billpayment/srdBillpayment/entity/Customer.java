package com.srd.billpayment.srdBillpayment.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="customer_Id")
	private int custmoerId;
	@Column(name="Customer_Name")
	private String cName;
	@Column(name="Address")
	private String cAdress;
	@Column(name="Contact_Number")
	private long cContactNo;
	@Column(name="country")
	private String cCountry;
	@Column(name="State")
	private String cState;
	@Column(name="Mail_id")
	private String cMailId;
	@Column(name="Identification_Document")
	private String cIdentificationDocument;
	@Column(name="Document_Number")
	private long doucumentNumber;
	@Column(name="Registration_Date")
	private Date   cRegistrationDate;
	@Column(name="Vendor_Type")
	private String typeOfvender;
	@Column(name="Card_Number")
	private long cardNumber;
	
	private float balance;

	public int getCustmoerId() {
		return custmoerId;
	}

	public void setCustmoerId(int custmoerId) {
		this.custmoerId = custmoerId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAdress() {
		return cAdress;
	}

	public void setcAdress(String cAdress) {
		this.cAdress = cAdress;
	}

	public long getcContactNo() {
		return cContactNo;
	}

	public void setcContactNo(long cContactNo) {
		this.cContactNo = cContactNo;
	}

	public String getcCountry() {
		return cCountry;
	}

	public void setcCountry(String cCountry) {
		this.cCountry = cCountry;
	}

	public String getcState() {
		return cState;
	}

	public void setcState(String cState) {
		this.cState = cState;
	}

	public String getcMailId() {
		return cMailId;
	}

	public void setcMailId(String cMailId) {
		this.cMailId = cMailId;
	}

	public String getcIdentificationDocument() {
		return cIdentificationDocument;
	}

	public void setcIdentificationDocument(String cIdentificationDocument) {
		this.cIdentificationDocument = cIdentificationDocument;
	}

	public long getDoucumentNumber() {
		return doucumentNumber;
	}

	public void setDoucumentNumber(long doucumentNumber) {
		this.doucumentNumber = doucumentNumber;
	}

	public Date getcRegistrationDate() {
		return cRegistrationDate;
	}

	public void setcRegistrationDate(Date cRegistrationDate) {
		this.cRegistrationDate = cRegistrationDate;
	}

	public String getTypeOfvender() {
		return typeOfvender;
	}

	public void setTypeOfvender(String typeOfvender) {
		this.typeOfvender = typeOfvender;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	

}
