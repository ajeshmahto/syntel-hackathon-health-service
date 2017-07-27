package com.syntel.healthservice.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "CostEstimator.costEstimate", query = "SELECT c FROM CostEstimator c WHERE c.treatmentName = ?1 and c.hospitalName=?2")
public class CostEstimator {
	@Id
	private String treatmentName;
	private String hospitalName;
	private String estimatedCost;
	
	public String getTreatmentName() {
		return treatmentName;
	}
	public void setTreatmentName(String treatmentName) {
		this.treatmentName = treatmentName;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getEstimatedCost() {
		return estimatedCost;
	}
	public void setEstimatedCost(String estimatedCost) {
		this.estimatedCost = estimatedCost;
	}
	
	

}
