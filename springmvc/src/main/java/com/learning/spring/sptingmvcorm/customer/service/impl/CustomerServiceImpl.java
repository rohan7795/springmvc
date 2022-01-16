package com.learning.spring.sptingmvcorm.customer.service.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learning.spring.sptingmvcorm.customer.dao.CustomerDao;
import com.learning.spring.sptingmvcorm.customer.entity.Customer;
import com.learning.spring.sptingmvcorm.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	@Transactional
	public int create(Customer customer) {
		// Busines logic
		return customerDao.create(customer);
	}

	@Override
	public List<Customer> getCustomers() {
		List<Customer> findAll = customerDao.findAll();
		Collections.sort(findAll);
		return findAll;
	}

	@Override
	public Customer getCustomer(Integer id) {
		Customer customer = customerDao.findCustomer(id);
		return customer;
	}
}
