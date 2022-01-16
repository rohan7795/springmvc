package com.learning.spring.sptingmvcorm.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learning.spring.sptingmvcorm.customer.entity.Customer;
import com.learning.spring.sptingmvcorm.customer.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	@RequestMapping("/registrationPage")
	public String showRegistrationPage() {
		return "custRegistration";
	}

	@RequestMapping(value = "/registerCustomer", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") Customer customer, ModelMap model) {
		System.out.println(customer);
		int result = customerService.create(customer);
		model.addAttribute("result", "user created successfully " + result);
		return "custRegistration";
	}

	@RequestMapping("/getCustomers")
	public String getUsers(ModelMap model) {
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers", customers);
		return "displayCustomers";
		
	}
	@RequestMapping("/validateEmail")
	public @ResponseBody String validateEmail(@RequestParam("id")int id ) {
		Customer customer = customerService.getCustomer(id);
		String msg = "";
		if(customer!=null) {
			msg = id +" User alredy exists";
		}
		return msg;
		
	}

}
