package com.qualifierannotation.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qualifierannotation.config.AppConfig;
import com.qualifierannotation.model.Employee;


public class MainApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	        Employee employee = context.getBean(Employee.class);
	        employee.setName("hello");
	        System.out.println(employee);
	        Employee employee1 = context.getBean(Employee.class);
	        employee1.setName("hello");
	        System.out.println(employee1);
	
	}

}
