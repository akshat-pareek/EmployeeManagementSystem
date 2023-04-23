package com.hdfc.capstone.employeemanagement.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="employee_id")
	private long employeeId;
	
	@NotNull(message="employee name should not be null")
	@Column(name="employee_name")
	private String employeeName;
	
	@NotNull(message = "date of birth should not be null")
	@Column(name="date_of_birth")
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

	public Employee(long employeeId, @NotNull(message = "employee name should not be null") String employeeName,
			@NotNull(message = "date of birth should not be null") Date dateOfBirth) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
}
