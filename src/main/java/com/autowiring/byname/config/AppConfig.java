package com.autowiring.byname.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.autowiring.byname.model.Department;
import com.autowiring.byname.model.Employee;


@Configuration
public class AppConfig {
	
	@Bean(name = "department")
    public Department department() {
        return new Department("Marketing Department");
	}
	
	@Bean
	public Employee employee() {
		return new Employee(department());
    }
	
	

}
