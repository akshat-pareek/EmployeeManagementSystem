package com.hdfc.capstone.employeemanagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.capstone.employeemanagement.entity.Employee;
import com.hdfc.capstone.employeemanagement.exception.EmployeeNotFoundException;
import com.hdfc.capstone.employeemanagement.service.IEmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeRestController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeRestController.class);
	
	@GetMapping("/getById/{employeeId}")
	public Employee getEmployeeByEmployeeId(@PathVariable long employeeId) throws EmployeeNotFoundException{
		logger.info("EmployeeId ("+employeeId+") is called");
		return employeeService.getEmployeeByEmployeeId(employeeId);
	}
}
