package com.learning.spring.sptingmvcorm.customer.service;

import java.util.List;

import com.learning.spring.sptingmvcorm.customer.entity.Customer;

public interface CustomerService {
	
	int create(Customer customer);
	
	List<Customer> getCustomers();

	Customer getCustomer (Integer id);
	
}
