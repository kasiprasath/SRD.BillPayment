package com.billpayment.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	private int customerId;
	private String cName;
	private String cAdress;
	private long cContactNo;
	private String cCountry;
	private String cState;
	private String cMailId;
	private String cIdentificationDocument;
	private long doucumentNumber;
	private Date   cRegistrationDate;
	private String typeOfvender;
	private long cardNumber;
	private float balance;

	

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
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
	public float getBalence() {
		return balence;
	}
	public void setBalence(float balence) {
		this.balence = balence;
	}
	
}
