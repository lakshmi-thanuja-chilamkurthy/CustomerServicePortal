package com.customerservice.servicerequest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customerservice.servicerequest.entity.ServcReqEntity;
import com.customerservice.servicerequest.exception.ServcReqException;
import com.customerservice.servicerequest.service.ServcReqService;

@RestController
@RequestMapping("/serviceRequest")
public class ServcReqController {

	@Autowired
	private ServcReqService requestService;
	
	@PostMapping("/{customerId}/createRequest")
	public ServcReqEntity createRequest(@PathVariable int customerId, @RequestBody ServcReqEntity reqdetails) throws ServcReqException {
		ServcReqEntity request = requestService.createReqByCustomer(customerId, reqdetails);
		return request;
		
	}
	@GetMapping("/findRequestByID/{reqId}")
	public Optional<ServcReqEntity> findrequests(@PathVariable int reqId) {
		Optional<ServcReqEntity> request=requestService.findrequestbyid(reqId);
		return request;
	}
	@GetMapping("/getListOfRequests")
	public List<ServcReqEntity> getListOfRequests() {
		return requestService.getRequests();
	}
	@GetMapping("/findReqByCustomerId/{id}")
	public List<ServcReqEntity> getrequestbycustomerId(@PathVariable int id) {
		return requestService.getRequestByCustomerId(id);
	}

	@GetMapping("/findReqbyStatus/{id}/{status}")
	public List<ServcReqEntity> getRequestByStatus(@PathVariable int id, @PathVariable String status) {
		return requestService.getRequestByStatus(id, status);
	}
	
	@PutMapping("/{customerId}/updateRequest/{reqId}")
	public ServcReqEntity updatereq(@PathVariable int customerId,@PathVariable int reqId,@RequestBody ServcReqEntity reqDetails) {
		ServcReqEntity req=requestService.updateReqDetails(customerId, reqId, reqDetails);
		return req;
	}
	
	@DeleteMapping("/deletereq/{id}/{reqId}")
	public String deletereq(@PathVariable int id,@PathVariable int reqId) throws ServcReqException {
		return requestService.deleteReq(id,reqId);
	}

}
