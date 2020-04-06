package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.Employee;

public interface EmployeeServiceI {
	List<Employee> getEmployeeDetails(int id);

	Employee createEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void deleteEmployee(int id);

	List<Employee> fetchAllEmployees();

}