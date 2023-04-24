package com.hdfc.capstone.employeemanagement.service;

import com.hdfc.capstone.employeemanagement.vo.EmployeeVO;

public interface IEmployeeService {
	
	public EmployeeVO getEmployeeByEmployeeId(long employeeId) throws Exception;
}
