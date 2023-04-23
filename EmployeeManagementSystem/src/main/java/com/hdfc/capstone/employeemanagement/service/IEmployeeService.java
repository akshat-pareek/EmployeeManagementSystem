package com.hdfc.capstone.employeemanagement.service;

import com.hdfc.capstone.employeemanagement.entity.Employee;
import com.hdfc.capstone.employeemanagement.exception.EmployeeNotFoundException;

public interface IEmployeeService {
	
	public Employee getEmployeeByEmployeeId(long employeeId) throws EmployeeNotFoundException;
}
