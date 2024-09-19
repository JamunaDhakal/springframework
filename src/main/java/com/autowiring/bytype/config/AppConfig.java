package com.autowiring.bytype.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.autowiring.bytype.model.Department;
import com.autowiring.bytype.model.Employee;

//import com.autowiring.byname.model.Department;
//import com.autowiring.byname.model.Employee;


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
