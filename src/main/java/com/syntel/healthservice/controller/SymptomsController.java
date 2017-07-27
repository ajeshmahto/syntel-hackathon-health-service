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
import com.syntel.healthservice.domain.Response;
import com.syntel.healthservice.domain.Symptoms;
import com.syntel.healthservice.repository.SymptomsRepository;



@RequestMapping("versatileHealth")
@RestController
public class SymptomsController {
	
	@Autowired
	SymptomsRepository symptomsRepository;
	
	@RequestMapping(value="/allSymptoms", method=RequestMethod.GET)
	public ResponseEntity<Response> getAllPayerDetails(){
		 List<Symptoms> symptoms = new ArrayList<Symptoms>();
		 symptoms = symptomsRepository.findAll();
		 Response response = new Response();
		 response.setStatus("SUCCESS");
		 response.setResponse(symptoms);
		 return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value="/sympotoms", method=RequestMethod.POST)
	public ResponseEntity<Response> getSymptoms(@RequestBody Symptoms symptoms){
		Symptoms symptomsResult = new Symptoms();
		symptomsResult = symptomsRepository.findOne(symptoms.getSymptomName());
		 Response response = new Response();
		if(symptomsResult!=null){
			 response.setStatus("SUCCESS");
			 response.setResponse(symptomsResult);
			 return new ResponseEntity<Response>(response,HttpStatus.OK);
		}
		 response.setStatus("SUCCESS");
		 response.setResponse("No records found");
		 return new ResponseEntity<Response>(response,HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value="/saveSympotoms", method=RequestMethod.POST)
	public ResponseEntity<Response> saveSymptoms(@RequestBody Symptoms symptoms){
		 symptomsRepository.save(symptoms);
		 Response response = new Response();
		 response.setStatus("SUCCESS");
		 response.setResponse(symptoms);
		 return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
}	