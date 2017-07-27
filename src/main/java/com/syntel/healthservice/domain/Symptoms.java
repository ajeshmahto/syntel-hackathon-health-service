package com.syntel.healthservice.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Symptoms {
	@Id
	private String symptomName;
	private String symptomType;
	private String sympotmDetails;
	
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
	public String getSympotmDetails() {
		return sympotmDetails;
	}
	public void setSympotmDetails(String sympotmDetails) {
		this.sympotmDetails = sympotmDetails;
	}
	
	
	

}
