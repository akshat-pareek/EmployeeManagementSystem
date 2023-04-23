package com.hdfc.capstone.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.hdfc.capstone.client.entity.Employee;
import com.hdfc.capstone.client.exception.EmployeeNotFoundException;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/Rest/Employee")
public class RestController {
	
	@Autowired
	private RestTemplate template;
	
	String baseUrl = "https://localhost:8181/employee/";
	
	@GetMapping("/{employeeID}")
    public Employee getEmployeeById(@PathVariable int employeeID) throws EmployeeNotFoundException {
        Employee employee = template.getForObject(baseUrl +employeeID, Employee.class);
        if (employee == null) {
            throw new EmployeeNotFoundException("Employee not found with ID: " + employeeID);
        }
        return employee;
    }
}
