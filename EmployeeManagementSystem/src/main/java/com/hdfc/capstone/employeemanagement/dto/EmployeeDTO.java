package com.hdfc.capstone.employeemanagement.dto;
/*
 * @author: Akshat Pareek
 * Date: 21/04/23
 * */
import java.sql.Date;

public class EmployeeDTO {
	
	private long employeeId;
	
	private String employeeName;
	
	private Date dateOfBirth;
	

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public EmployeeDTO(long employeeId, String employeeName, Date dateOfBirth) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
	}

	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}