package com.hdfc.capstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.capstone.entity.Employee;
import com.hdfc.capstone.exception.EmployeeNotFoundException;
import com.hdfc.capstone.service.IEmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeRestController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("/getById/{employeeId}")
	public Employee getEmployeeByEmployeeId(@PathVariable long employeeId) throws EmployeeNotFoundException{
		return employeeService.getEmployeeByEmployeeId(employeeId);
	}
}
