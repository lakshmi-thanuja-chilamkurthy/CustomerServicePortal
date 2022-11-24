package com.customerservice.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.customerservice.customer.entity.CustomerEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity ,Integer>{

	@Query("select a.password from CustomerEntity a where a.customername=:username")
	public String findByName(String username);

//	@Query("select a")
//	public String findByCustomerName(String registration);
	
	
	

}
