/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aop.test.service;

import com.aop.test.model.Employee;
import com.aop.test.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


/**
 *
 * @author user
 */

@Service
public class EmployeeService {
    
    @Autowired
    EmployeeRepository emprepo;
    
    public Employee createEmployee(Employee emp) {

		emprepo.save(emp);
		return emp;
	}

	public void deleteEmployee(String empId) {
		
	}
}
