/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aop.test.aspect;

import com.aop.test.model.Employee;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */

@Aspect
@Component
public class EmployeeServiceAspect {
    
        @Before(value = "execution(* com.aop.test.service.EmployeeService.*(..)) and args(emp)")
	public void beforeAdvice(JoinPoint joinPoint, Employee emp) {
		System.out.println("Before method:" + joinPoint.getSignature());
		System.out.println("Creating Employee with name - " + emp.getName() + " and id - " + emp.getEmpId());
	}

	@After(value = "execution(* com.aop.test.service.EmployeeService.*(..)) and args(emp)")
	public void afterAdvice(JoinPoint joinPoint, Employee emp) {
		System.out.println("After method:" + joinPoint.getSignature());
		System.out.println("Successfully created Employee with name - " + emp.getName() + " and id - " + emp.getEmpId());
	}
    
}
