package com.employee.h2.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.h2.api.model.Employee;
import com.employee.h2.api.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	
	public void addEmployeeService(Employee employee) {
		repository.save(employee);
		
	}
	
	public Iterable<Employee> showEmployeeService(){
		return repository.findAll();
	}

}
