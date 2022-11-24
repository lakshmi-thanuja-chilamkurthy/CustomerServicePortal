package com.customerservice.servicerequest.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerservice.servicerequest.client.ServcReqClient;
import com.customerservice.servicerequest.entity.Customer;
import com.customerservice.servicerequest.entity.ServcReqEntity;
import com.customerservice.servicerequest.exception.ServcReqException;
import com.customerservice.servicerequest.repository.ServcReqRepository;

@Service
public class ServcReqService {

	@Autowired
	private ServcReqRepository reqRepo;

	@Autowired
	private ServcReqClient servcReqClient;

	public ServcReqEntity createReqByCustomer(int customerId, ServcReqEntity reqdetails) throws ServcReqException {
		// TODO Auto-generated method stub

		Optional<Customer> customer = servcReqClient.getCustomerByID(customerId);

		ServcReqEntity Reqdetails = new ServcReqEntity();
		if (!customer.isEmpty()) {
			if (reqdetails.getServiceType() != null) {
				Reqdetails.setReqName(reqdetails.getReqName());
				Reqdetails.setCustomerName(customer.get().getCustomername());
				Reqdetails.setCustomerId(customer.get().getId());
				Reqdetails.setReqdescription(reqdetails.getReqdescription());
				Reqdetails.setReqStatus(reqdetails.getReqStatus());
				Reqdetails.setAssignedTo(reqdetails.getAssignedTo());
				Reqdetails.setServiceType(reqdetails.getServiceType());
				Date date = new Date();
				Reqdetails.setDate(date);
				reqRepo.save(Reqdetails);
			}
			else {
				 throw new ServcReqException("give all details");
			 }

		}
		else {
			throw new ServcReqException("invalid customerId ");
		}
		return Reqdetails;
	}

	public Optional<ServcReqEntity> findrequestbyid(int reqId) {
		// TODO Auto-generated method stub
		return reqRepo.findById(reqId);
	}

	public List<ServcReqEntity> getRequests() {
		// TODO Auto-generated method stub
		return reqRepo.findAll();
	}

	public List<ServcReqEntity> getRequestByCustomerId(int id) {
		// TODO Auto-generated method stub
		return reqRepo.findReqByCustId(id);
	}

	public List<ServcReqEntity> getRequestByStatus(int id, String status) {
		// TODO Auto-generated method stub
		return reqRepo.findReqByStatus(id,status);
	}

	public ServcReqEntity updateReqDetails(int customerId, int reqId, ServcReqEntity reqDetails) {
		// TODO Auto-generated method stub
		
		Optional<ServcReqEntity> request=reqRepo.fetchRequest(customerId,reqId);
		if (!request.isEmpty()) {
			if(reqDetails.getAssignedTo() != null){
				request.get().setAssignedTo(reqDetails.getAssignedTo());
			}
			if(reqDetails.getReqdescription()!=null) {
				request.get().setReqdescription(reqDetails.getReqdescription());
			}
			if(reqDetails.getServiceType()!=null) {
				request.get().setServiceType(reqDetails.getServiceType());
			}
			if(reqDetails.getReqName()!=null) {
				request.get().setReqName(reqDetails.getReqName());
			}
			if(reqDetails.getReqStatus()!=null) {
				request.get().setReqStatus(reqDetails.getReqStatus());
			}
			
		}
		return reqRepo.save(request.get());
	}

	public String deleteReq(int id, int reqId) {
		// TODO Auto-generated method stub
		
		Optional<ServcReqEntity> req=reqRepo.fetchRequest(id, reqId);
		if(!req.isEmpty()) {
			reqRepo.deleteById(req.get().getReqId());
			return "deleted successfully";
		}else {
			return "request id not found";
		}
		
		
	}

	

}