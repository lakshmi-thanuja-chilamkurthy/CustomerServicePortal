package com.customerservice.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerservice.customer.entity.CustomerEntity;
import com.customerservice.customer.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repo;

	public CustomerEntity save(CustomerEntity customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}

	public String authenticateuser(String username, String password) {
		// TODO Auto-generated method stub
		String pwd = repo.findByName(username);
		
		return pwd;
	}

	public List<CustomerEntity> getAllCustomers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Optional<CustomerEntity> getCustomerById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	public CustomerEntity updateCustomerDetails(int id, CustomerEntity customer) {
		// TODO Auto-generated method stub
		Optional<CustomerEntity> custDetails=repo.findById(id);
		if(!custDetails.isEmpty()) {
			if(customer.getCustomername()!=null) {
				custDetails.get().setCustomername(customer.getCustomername());
			}
			if(customer.getPassword()!=null) {
				custDetails.get().setPassword(customer.getPassword());
			}
			if(customer.getAddress()!=null) {
				custDetails.get().setAddress(customer.getAddress());
			}
			if(customer.getContactNo()!=0) {
				custDetails.get().setContactNo(customer.getContactNo());
			}
			if(customer.getEmailId()!=null) {
				custDetails.get().setEmailId(customer.getEmailId());
			}
			if(customer.getCountry()!=null) {
				custDetails.get().setCountry(customer.getCountry());
			}
			if(customer.getState()!=null) {
				custDetails.get().setState(customer.getState());
			}
			if(customer.getPan()!=null) {
				custDetails.get().setPan(customer.getPan());
			}
			if(customer.getContactPreference()!=null) {
				custDetails.get().setContactPreference(customer.getContactPreference());
			}
			if(customer.getDob()!=null) {
				custDetails.get().setDob(customer.getDob());
			}
		}
		
		return repo.save(custDetails.get());
	}

	public String findByCustomer(String registration) {
		// TODO Auto-generated method stub
		return repo.findByName(registration);
	}

	
}
