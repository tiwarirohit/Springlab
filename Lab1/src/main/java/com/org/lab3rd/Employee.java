package com.org.lab3rd;

import java.util.List;
public class Employee {
  
	List employeelist;

	public List getEmployeelist() {
		System.out.println("employee"+ employeelist);
		return employeelist;
	}

	public void setEmployeelist(List employeelist) {
		this.employeelist = employeelist;
	}
}
