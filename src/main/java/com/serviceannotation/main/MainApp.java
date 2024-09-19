package com.serviceannotation.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.serviceannotation.config.AppConfig;
import com.serviceannotation.model.Employee;
import com.serviceannotation.service.EmployeeService;


public class MainApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
	    Employee employee = employeeService.addEmployee("J1ohn Doe");
	    
	    // Add a new employee
	    Employee employee1 = employeeService.addEmployee("John Doe");
        System.out.println("Added Employee: " + employee1);
        
        // Retrieve employee by ID
        Employee retrievedEmployee = employeeService.getEmployeeById(employee.getId())
                .orElseThrow(() -> new RuntimeException("Employee not found"));
        System.out.println("Retrieved Employee: " + retrievedEmployee);
        
	
	}

}
