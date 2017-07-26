package com.syntel.healthservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.syntel.healthservice.domain.Doctor;
import com.syntel.healthservice.domain.Response;
import com.syntel.healthservice.repository.DoctorRatingRepository;

@RequestMapping("versatileHealth")
@RestController
public class DoctorRatingController {
	
	@Autowired
	DoctorRatingRepository doctorRatingRepository;
	
	@RequestMapping(value="/doctorRatings", method=RequestMethod.GET)
	public ResponseEntity<Response> getDoctors(){
		List<Doctor> doctors = new ArrayList<Doctor>();
		 doctors = doctorRatingRepository.findAll();
		 Response response = new Response();
		 response.setStatus("SUCCESS");
		 response.setResponse(doctors);
		 return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/saveDoctorRating", method=RequestMethod.POST)
	public ResponseEntity<Response> saveDoctorRating(@RequestBody Doctor doctor){
	     doctorRatingRepository.save(doctor);
		 Response response = new Response();
		 response.setStatus("SUCCESS");
		 response.setResponse(doctor);
		 return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	

}
