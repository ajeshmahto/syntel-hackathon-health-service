package com.syntel.healthservice.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {
	@Id
	private int hospitalId;
	private String hospitalName;
	private String hospitalSpeciality;
	private String hospitalLocation;
	private String hospitalRatings;
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalSpeciality() {
		return hospitalSpeciality;
	}
	public void setHospitalSpeciality(String hospitalSpeciality) {
		this.hospitalSpeciality = hospitalSpeciality;
	}
	public String getHospitalLocation() {
		return hospitalLocation;
	}
	public void setHospitalLocation(String hospitalLocation) {
		this.hospitalLocation = hospitalLocation;
	}
	public String getHospitalRatings() {
		return hospitalRatings;
	}
	public void setHospitalRatings(String hospitalRatings) {
		this.hospitalRatings = hospitalRatings;
	}
	
	
	

}
