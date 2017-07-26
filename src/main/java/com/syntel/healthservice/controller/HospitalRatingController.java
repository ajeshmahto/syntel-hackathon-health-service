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
import com.syntel.healthservice.domain.Hospital;
import com.syntel.healthservice.domain.Response;
import com.syntel.healthservice.repository.HospitalRatingRepository;

@RequestMapping("versatileHealth")
@RestController
public class HospitalRatingController {
	
	@Autowired
	HospitalRatingRepository hospitalRatingRepository;
	
	@RequestMapping(value="/hospitalRatings", method=RequestMethod.GET)
	public ResponseEntity<Response> getHospitals(){
		 List<Hospital> hospitals = new ArrayList<Hospital>();
		 hospitals = hospitalRatingRepository.findAll();
		 Response response = new Response();
		 response.setStatus("SUCCESS");
		 response.setResponse(hospitals);
		 return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/saveHospitalRating", method=RequestMethod.POST)
	public ResponseEntity<Response> saveHospitalRating(@RequestBody Hospital hospital){
		 hospitalRatingRepository.save(hospital);
		 Response response = new Response();
		 response.setStatus("SUCCESS");
		 response.setResponse(hospital);
		 return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	

}