package com.hdfc.capstone.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.hdfc.capstone.client.exception.EmployeeNotFoundException;
import com.hdfc.capstone.client.vo.EmployeeVO;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/Rest/Employee")
public class RestController {
	
	@Autowired
	private RestTemplate template;
	
	String baseUrl = "https://localhost:8181/employee";
	
	@GetMapping("/{employeeID}")
    public EmployeeVO getEmployeeById(@PathVariable int employeeID) throws Exception {
        EmployeeVO employeeVo = template.getForObject(baseUrl + "/getById/" + employeeID, EmployeeVO.class);
        if (employeeVo == null) {
            throw new EmployeeNotFoundException("Employee not found with ID: " + employeeID);
        }
        employeeVo.setDateOfBirth(EmployeeVO.decrypt(employeeVo.getDateOfBirth()));
        return employeeVo;
    }
}
