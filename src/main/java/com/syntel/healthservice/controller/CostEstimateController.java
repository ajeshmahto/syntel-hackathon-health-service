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

import com.syntel.healthservice.domain.CostEstimator;
import com.syntel.healthservice.domain.Response;
import com.syntel.healthservice.repository.CostEstimateRepository;


@RequestMapping("versatileHealth")
@RestController
public class CostEstimateController {
	
	@Autowired
	CostEstimateRepository costEstimateRepository;
	
	@RequestMapping(value="/costEstimates", method=RequestMethod.GET)
	public ResponseEntity<Response> getCostEstimations(){
		 List<CostEstimator> costEstimators = new ArrayList<CostEstimator>();
		 costEstimators = costEstimateRepository.findAll();
		 Response response = new Response();
		 response.setStatus("SUCCESS");
		 response.setResponse(costEstimators);
		 return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value="/costEstimate", method=RequestMethod.POST)
	public ResponseEntity<Response> getCostEstimation(@RequestBody CostEstimator costEstimator){
		CostEstimator costEstimateResult = new CostEstimator();
		costEstimateResult = costEstimateRepository.costEstimate(costEstimator.getTreatmentName(), costEstimator.getHospitalName());
		 Response response = new Response();
		if(costEstimateResult!=null){
			 response.setStatus("SUCCESS");
			 response.setResponse(costEstimateResult);
			 return new ResponseEntity<Response>(response,HttpStatus.OK);
		}
		 response.setStatus("SUCCESS");
		 response.setResponse("No records found");
		 return new ResponseEntity<Response>(response,HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value="/saveCostEstimate", method=RequestMethod.POST)
	public ResponseEntity<Response> savecostEstimate(@RequestBody CostEstimator costEstimator){
		 costEstimateRepository.save(costEstimator);
		 Response response = new Response();
		 response.setStatus("SUCCESS");
		 response.setResponse(costEstimator);
		 return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	

}