package com.pcf.deployment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	
	@GetMapping("/details")
	public List<Employee> getEmployeeDetails() {
	
		return getEmployees();
	}

	public static List<Employee> getEmployees(){
	 List<Employee> list = new ArrayList<>();
	 list.add(new Employee(new Long(1), "Pankaj Singh"));
	 list.add(new Employee(new Long(2), "Pankaj Singh"));
	 list.add(new Employee(new Long(3), "Pankaj Singh"));
	 list.add(new Employee(new Long(4), "Pankaj Singh"));
	 return list;	
	}
	
}
