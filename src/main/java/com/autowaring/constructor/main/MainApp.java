package com.autowaring.constructor.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowiring.constructor.config.AppConfig;
import com.autowiring.constructor.model.Employee;



public class MainApp {
	public static void main(String[] args) {
		 // Load Spring context from XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor-autowiring\\applicationContext.xml");
        Employee employee = (Employee) context.getBean("employee",Employee.class);
        System.out.println(employee);
        
       // Load Spring context from JavaBased configuration
        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee1 = context1.getBean(Employee.class);
        System.out.println(employee1);
	}

}
