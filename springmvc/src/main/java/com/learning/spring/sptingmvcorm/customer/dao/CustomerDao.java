package com.learning.spring.sptingmvcorm.customer.dao;

import java.util.List;

import com.learning.spring.sptingmvcorm.customer.entity.Customer;

public interface CustomerDao {

	int create(Customer customer);

	List<Customer> findAll();

	Customer findCustomer(Integer id);

}
