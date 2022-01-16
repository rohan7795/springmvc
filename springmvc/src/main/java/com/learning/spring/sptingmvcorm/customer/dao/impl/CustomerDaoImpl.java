package com.learning.spring.sptingmvcorm.customer.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.learning.spring.sptingmvcorm.customer.dao.CustomerDao;
import com.learning.spring.sptingmvcorm.customer.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int create(Customer customer) {
		Integer save = (Integer) hibernateTemplate.save(customer);
		return save;
	}

	@Override
	public List<Customer> findAll() {
		return hibernateTemplate.loadAll(Customer.class);
	}

	@Override
	public Customer findCustomer(Integer id) {
		Customer customer = hibernateTemplate.get(Customer.class, id);
		return customer;
	}

}
