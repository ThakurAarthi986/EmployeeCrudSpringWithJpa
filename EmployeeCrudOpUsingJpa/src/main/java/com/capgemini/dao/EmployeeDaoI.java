package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bean.Employee;

public interface EmployeeDaoI extends JpaRepository<Employee,Integer>
		{
	
}

	