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

import com.syntel.healthservice.domain.PayerDetails;
import com.syntel.healthservice.domain.Response;
import com.syntel.healthservice.repository.PayerDetailsRepository;



@RequestMapping("versatileHealth")
@RestController
public class PayerDetailsController {
	
	@Autowired
	PayerDetailsRepository payerDetailsRepository;
	
	@RequestMapping(value="/allPayerDetails", method=RequestMethod.GET)
	public ResponseEntity<Response> getAllPayerDetails(){
		 List<PayerDetails> payerDetails = new ArrayList<PayerDetails>();
		 payerDetails = payerDetailsRepository.findAll();
		 Response response = new Response();
		 response.setStatus("SUCCESS");
		 response.setResponse(payerDetails);
		 return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value="/payerDetails", method=RequestMethod.POST)
	public ResponseEntity<Response> getPayerDetails(@RequestBody PayerDetails payerDetails){
		PayerDetails payerDetailsResult = new PayerDetails();
		payerDetailsResult = payerDetailsRepository.findOne(payerDetails.getPayerName());
		 Response response = new Response();
		if(payerDetailsResult!=null){
			 response.setStatus("SUCCESS");
			 response.setResponse(payerDetailsResult);
			 return new ResponseEntity<Response>(response,HttpStatus.OK);
		}
		 response.setStatus("SUCCESS");
		 response.setResponse("No records found");
		 return new ResponseEntity<Response>(response,HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value="/savePayerDetails", method=RequestMethod.POST)
	public ResponseEntity<Response> savePayerDetails(@RequestBody PayerDetails payerDetails){
		payerDetailsRepository.save(payerDetails);
		 Response response = new Response();
		 response.setStatus("SUCCESS");
		 response.setResponse(payerDetails);
		 return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
}	