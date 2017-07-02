package com.turreta.jsf.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EmployeeListFormBean {
	
	private List<EmployeeDTO> employeeList = new ArrayList<>();
	
	public EmployeeListFormBean() {
		
		// Simulates loading of data from some data store, e.g., database
		
		employeeList.add(new EmployeeDTO("Monroe", "Marilyn", "Human Resource"));
		employeeList.add(new EmployeeDTO("Lincoln", "Abraham", "Human Resource"));
		employeeList.add(new EmployeeDTO("Mandela", "Nelson", "Marketing"));
		employeeList.add(new EmployeeDTO("Orwell", "George", "IT"));
		
	}

	public List<EmployeeDTO> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<EmployeeDTO> employeeList) {
		this.employeeList = employeeList;
	}
}
