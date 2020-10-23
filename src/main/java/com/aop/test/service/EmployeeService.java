/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aop.test.service;

import com.aop.test.model.Employee;

import org.springframework.stereotype.Service;


/**
 *
 * @author user
 */

@Service
public class EmployeeService {
    
    public Employee createEmployee(String name, String empId) {

		Employee emp = new Employee();
		emp.setName(name);
		emp.setEmpId(empId);
		return emp;
	}

	public void deleteEmployee(String empId) {
		
	}
}
