package com.componentannotation.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.componentannotation.config.AppConfig;
import com.componentannotation.model.Employee;

public class MainApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 // Load Spring context from XML configuration
//        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring\\applicationContext.xml");
//        Employee employee = (Employee) context.getBean("employee",Employee.class);
//        System.out.println(employee);
        
       // Load Spring context from JavaBased configuration
        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee1 = context1.getBean(Employee.class);
        employee1.setName("yuna");
        employee1.showDetails();
	}

}
