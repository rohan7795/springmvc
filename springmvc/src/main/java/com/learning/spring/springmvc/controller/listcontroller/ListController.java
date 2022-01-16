package com.learning.spring.springmvc.controller.listcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.learning.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/listEmp")
	public ModelAndView listEmployees() {
		ModelAndView modelAndView = new ModelAndView();

		List<Employee> employees = new ArrayList();

		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("rohan");
		emp1.setSalary(4000000);

		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("akshay");
		emp2.setSalary(3900000);

		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setName("prateek");
		emp3.setSalary(400000);

		employees.add(emp3);
		employees.add(emp2);
		employees.add(emp1);

		modelAndView.addObject("employees", employees);

		modelAndView.setViewName("showEmployees");
		return modelAndView;
	}
}
