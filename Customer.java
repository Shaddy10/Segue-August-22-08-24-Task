package com.StreamSpecific;

import java.util.Date;

public class Customer {
	private int cusId;
	private String custName;
	private String city;
	private double premium;
	private Date dateOfBirth;
	
	public Customer() {
		
	}

	public Customer(int cusId, String custName, String city, double premium, Date dateOfBirth) {
		this.cusId = cusId;
		this.custName = custName;
		this.city = city;
		this.premium = premium;
		this.dateOfBirth = dateOfBirth;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", custName=" + custName + ", city=" + city + ", premium=" + premium
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	
}
