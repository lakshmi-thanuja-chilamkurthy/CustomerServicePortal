package com.customerservice.servicerequest.client;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.customerservice.servicerequest.entity.Customer;



@FeignClient("CUSTOMER-SERVICE")
public interface ServcReqClient {
	
	@GetMapping("/customer/getCustomerId/{id}")
	Optional<Customer> getCustomerByID(@PathVariable int id);
	

}
