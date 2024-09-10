package com.dependencyinjection.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.dependencyinjection.config.AppConfig;
import com.dependencyinjection.service.StudentService;

public class MainApp {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("dp\\applicationContext.xml");
		StudentService student = (StudentService) context.getBean("studentservices", StudentService.class);
		student.displayStudentInfo();
		
		@SuppressWarnings("resource")
		ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentService student1 = (StudentService) context.getBean(StudentService.class);
		student1.displayStudentInfo();
	}

}
