package com.turreta.jsf.bean;

public class EmployeeDTO {
	
	public EmployeeDTO(String lastName, String firstName, String deptName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.deptName = deptName;
	}

	private String lastName;
	
	private String firstName;
	
	// Department name
	private String deptName;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
