package com.hdfc.capstone.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hdfc.capstone.entity.Employee;
import com.hdfc.capstone.exception.EmployeeNotFoundException;
import com.hdfc.capstone.repository.EmployeeRepository;

public class EmployeeServiceImplementation implements IEmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee getByEmployeeId(long employeeId) throws EmployeeNotFoundException {
		Employee employee = employeeRepository.findById(employeeId)
							.orElseThrow(()-> new EmployeeNotFoundException("Employee not found with Id: "+employeeId));
		
		return employee;
	}

}
