package com.hdfc.capstone.employeemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.capstone.employeemanagement.entity.Employee;
import com.hdfc.capstone.employeemanagement.exception.EmployeeNotFoundException;
import com.hdfc.capstone.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements IEmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee getEmployeeByEmployeeId(long employeeId) throws EmployeeNotFoundException {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(()-> new EmployeeNotFoundException("Employee not found with Id: "+employeeId));
		return employee;
	}

}