package com.autowiring.constructor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.autowiring.constructor.model.Department;
import com.autowiring.constructor.model.Employee;



@Configuration
public class AppConfig {
	
	@Bean
    public Department department() {
        return new Department("Marketing Department");
	}
	
	@Bean
	public Employee employee() {
		return new Employee(department());
    }
	
	

}
