package com.hdfc.capstone.employeemanagement.service;
/**
 * 
 * @author Akshat Pareek
 * Date 21/04/23
 *
 */
import com.hdfc.capstone.employeemanagement.vo.EmployeeVO;

public interface IEmployeeService {
	
	public EmployeeVO getEmployeeByEmployeeId(long employeeId) throws Exception;
}
