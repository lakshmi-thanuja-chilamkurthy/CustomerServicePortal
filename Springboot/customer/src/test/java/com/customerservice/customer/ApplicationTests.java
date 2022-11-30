package com.customerservice.customer;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.customerservice.customer.controller.CustomerController;
import com.customerservice.customer.entity.CustomerEntity;
import com.customerservice.customer.service.CustomerService;

@SpringBootTest
class ApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
	@Mock
	CustomerService service;
	
	@InjectMocks
	CustomerController customerController;
	
	@Test
	public void registerTest() {
		CustomerEntity entity = new CustomerEntity();
		entity.setCustomername("abc");
		entity.setPassword("aadww");
		entity.setAddress("22/222-1");
		entity.setState("ap");
		entity.setCountry("ind");
		entity.setEmailId("abc@gmail.com");
		entity.setDob("2022-01-11");
		entity.setContactNo(1234567891);
		entity.setPan("erihgwe6we82");
		entity.setContactPreference("email");
		
		when(service.save(entity)).thenReturn(entity);
	}
	
	@Test
	public void getCustomersTest() {
		
		Mockito.when(service.getAllCustomers()).thenReturn(Stream.of(new CustomerEntity("abc","abvdy","22/222-1","ap",
				"ind","abc@gmail.com","erihgwe6we82",1234567891,"2022-01-11","email"
				)).collect(Collectors.toList()));
		customerController.getCustomers();
		Assertions.assertEquals(service.getAllCustomers(), customerController.getCustomers());
	}
	
//	@Test
//	public void loginTest() {
//		List<String> actual = Arrays.asList("abc@gmail.com","aadww");
//		
//		CustomerEntity entity = new CustomerEntity();
//		entity.setEmailId("abc@gmail.com");
//		entity.setPassword("aadww");
//		String username=null;
//		String password=null;
//		
//		Mockito.when(service.authenticateuser(username,password)).thenReturn("abc@gmail.com","aadww");
//		Assertions.assertEquals(actual,service.authenticateuser(username,password));
//	}

}
