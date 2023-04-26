package com.hdfc.capstone.employeemanagement.service;
/**
 * 
 * @author Akshat Pareek
 * Date 24/04/23
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.capstone.employeemanagement.entity.Employee;
import com.hdfc.capstone.employeemanagement.exception.EmployeeNotFoundException;
import com.hdfc.capstone.employeemanagement.repository.EmployeeRepository;
import com.hdfc.capstone.employeemanagement.vo.EmployeeVO;

@Service
public class EmployeeServiceImplementation implements IEmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public EmployeeVO getEmployeeByEmployeeId(long employeeId) throws Exception {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(()-> new EmployeeNotFoundException("Employee not found with Id: "+employeeId));
		EmployeeVO employeeVo=new EmployeeVO();
		employeeVo.setEmployeeId(employeeId);
		employeeVo.setEmployeeName(employee.getEmployeeName());
		String dob=employee.getDateOfBirth().toString();
		employeeVo.setDateOfBirth(EmployeeVO.encrypt(dob));
		return employeeVo;
	}

}
