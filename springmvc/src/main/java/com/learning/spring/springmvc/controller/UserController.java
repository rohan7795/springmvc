package com.learning.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learning.spring.springmvc.dto.User;

@Controller
public class UserController {
	@RequestMapping("/registrationPage")
	public ModelAndView showRegistrationPage() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("regUser");
		return modelAndView;

	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("status", "UserAdded");
		modelAndView.setViewName("regUser");
		return modelAndView;
	}

	@RequestMapping(value = "/showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam(value = "salary", required = false, defaultValue = "40") double salary) {

		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("regUser");
		return modelAndView;
	}

}
