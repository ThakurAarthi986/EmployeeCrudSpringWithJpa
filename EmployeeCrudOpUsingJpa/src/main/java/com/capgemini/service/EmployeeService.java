package com.capgemini.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bean.Employee;
import com.capgemini.dao.EmployeeDaoI;

@Service
@Transactional
public class EmployeeService implements EmployeeServiceI {

	@Autowired
	private EmployeeDaoI dao;
	
	@Override
	public List<Employee> getEmployeeDetails(int id) {
		return dao.findAll();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return dao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		boolean bool = dao.exists(employee.getEmpid());
		if(bool == true) {
			dao.save(employee);
			return employee;
		}
		else {
			dao.save(employee);
			return employee;
		}
	}

	@Override
	public void deleteEmployee(int id) {
		dao.delete(id);
	}

	@Override
	public List<Employee> fetchAllEmployees() {
		return dao.findAll();
	}
}