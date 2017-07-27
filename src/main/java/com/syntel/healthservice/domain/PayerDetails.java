package com.syntel.healthservice.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PayerDetails {
	@Id
	private String payerName;
	private String payerDetails;
	
	public String getPayerName() {
		return payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	public String getPayerDetails() {
		return payerDetails;
	}
	public void setPayerDetails(String payerDetails) {
		this.payerDetails = payerDetails;
	}
	
	
	

}
