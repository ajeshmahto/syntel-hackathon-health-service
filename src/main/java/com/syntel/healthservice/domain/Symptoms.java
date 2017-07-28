package com.syntel.healthservice.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Symptoms {
	@Id
	private String symptomName;
	private String symptomType;
	private String symptomDetails;
	private String symptomRemedy;
	
	public String getSymptomName() {
		return symptomName;
	}
	public void setSymptomName(String symptomName) {
		this.symptomName = symptomName;
	}
	public String getSymptomType() {
		return symptomType;
	}
	public void setSymptomType(String symptomType) {
		this.symptomType = symptomType;
	}
	
	public String getSymptomDetails() {
		return symptomDetails;
	}
	public void setSymptomDetails(String symptomDetails) {
		this.symptomDetails = symptomDetails;
	}
	public String getSymptomRemedy() {
		return symptomRemedy;
	}
	public void setSymptomRemedy(String symptomRemedy) {
		this.symptomRemedy = symptomRemedy;
	}
	
	
	

}
