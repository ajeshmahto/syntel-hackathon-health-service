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

import com.syntel.healthservice.domain.AppointmentList;
import com.syntel.healthservice.domain.Response;
import com.syntel.healthservice.repository.AppointmentListRepository;




@RequestMapping("versatileHealth")
@RestController
public class AppointmenListController {
	
	@Autowired
	AppointmentListRepository appointmentListRepository;
	
	@RequestMapping(value="/appointmentList", method=RequestMethod.GET)
	public ResponseEntity<Response> getAppointmentList(){
		 List<AppointmentList> appointmentList = new ArrayList<AppointmentList>();
		 appointmentList = appointmentListRepository.findAll();
		 Response response = new Response();
		 response.setStatus("SUCCESS");
		 response.setResponse(appointmentList);
		 return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	
//	@RequestMapping(value="/appointmentList", method=RequestMethod.POST)
//	public ResponseEntity<Response> getCostEstimation(){
//		AppointmentList appointmentList = new CostEstimator();
//		appointmentList = appointmentListRepository.findOne()
//		 Response response = new Response();
//		if(costEstimateResult!=null){
//			 response.setStatus("SUCCESS");
//			 response.setResponse(costEstimateResult);
//			 return new ResponseEntity<Response>(response,HttpStatus.OK);
//		}
//		 response.setStatus("SUCCESS");
//		 response.setResponse("No records found");
//		 return new ResponseEntity<Response>(response,HttpStatus.OK);
//		
//	}
	
	
	@RequestMapping(value="/saveAppointmentList", method=RequestMethod.POST)
	public ResponseEntity<Response> saveAppointmentList(@RequestBody AppointmentList apointmentList){
		appointmentListRepository.save(apointmentList);
		 Response response = new Response();
		 response.setStatus("SUCCESS");
		 response.setResponse(apointmentList);
		 return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	

}
