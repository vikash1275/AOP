/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aop.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author user
 */

@Entity
public class Employee {
        @Id
	private String empId;
	private String name;

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

}
