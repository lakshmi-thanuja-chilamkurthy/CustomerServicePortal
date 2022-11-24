package com.customerservice.customer.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customerservice.customer.entity.CustomerEntity;
import com.customerservice.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/register")
	public List<String> registerUser(@RequestBody CustomerEntity signUp) {
		
		
		CustomerEntity customer = new CustomerEntity();
		String registration = signUp.getCustomername();
		String status = customerService.findByCustomer(registration);
		if(status==null) {
		customer.setCustomername(registration);
		customer.setPassword(signUp.getPassword());
		customer.setAddress(signUp.getAddress());
		customer.setState(signUp.getState());
		customer.setCountry(signUp.getCountry());
		customer.setEmailId(signUp.getEmailId());
		customer.setPan(signUp.getPan());
		customer.setContactNo(signUp.getContactNo());
		customer.setDob(signUp.getDob());
		customer.setContactPreference(signUp.getContactPreference());
		
		customerService.save(customer);
		List<String> list = new ArrayList<String>();
		list.add("User registered successfully");
		return list;
		}
		else {
			List<String> list = new ArrayList<String>();
			list.add("User already registered, please login ");
			return list;
		}
		
		
	}
	
	@PostMapping("/login")
	public List<String> Login(@RequestBody CustomerEntity login) {
		String username = login.getCustomername();
		String password = login.getPassword();
		String pwd = customerService.authenticateuser(username, password);
		// return pwd;
		List<String> list = new ArrayList<String>();
//		if(pwd.equalsIgnoreCase("success"))
//        {
//			list.add("Login Success");   
//        }
//        else if(pwd.equalsIgnoreCase("failure"))
//        {
//        	list.add("Password is invalid, please enter correct password");
//        }
//        else
//        {
//        	list.add( "User is not available");
//        	
//        }
//		return list;
//	}
		
		if (pwd != null) {
			if (pwd.equals(password)) {
				list.add("User logged in successfully");
				return list;

			} else {
				list.add("failed to login");
				return list;
			}
		} else {
			list.add("Username not exists");
			return list;
		}

	}
	
	@GetMapping("/getCustomers")
	public List<CustomerEntity> getCustomers() {
		return customerService.getAllCustomers();
	}
	
	@GetMapping("/getCustomerId/{id}")
	public Optional<CustomerEntity> getCustomerByID(@PathVariable int id) {
		return customerService.getCustomerById(id);
	}
	
	@PutMapping("/updateCustomerDetails/{id}")
	public CustomerEntity updatereq(@PathVariable int id,@RequestBody CustomerEntity customer) {
		CustomerEntity customerDetails =customerService.updateCustomerDetails(id, customer);
		return customerDetails;
	}

}
