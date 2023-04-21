package com.hdfc.capstone.service;

import com.hdfc.capstone.entity.Employee;
import com.hdfc.capstone.exception.EmployeeNotFoundException;

public interface IEmployeeService {
	
	public Employee getEmployeeByEmployeeId(long employeeId) throws EmployeeNotFoundException;
	
}
