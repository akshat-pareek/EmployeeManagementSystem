package com.hdfc.capstone.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdfc.capstone.entity.Employee;
import com.hdfc.capstone.exception.EmployeeNotFoundException;

@SpringBootTest
class EmployeeServiceTest {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@Test
	void testGetEmployeeByEmployeeId() throws EmployeeNotFoundException{
		Employee employee = employeeService.getEmployeeByEmployeeId(103);
		assertNotNull(employee);
	}

}
