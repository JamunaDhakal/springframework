package com.collection.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.collection.config.AppConfig;
import com.collection.model.Student;

public class MainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 // Load Spring context from Java configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve and print Student bean
        Student student = context.getBean(Student.class);
        System.out.println(student);
        // Load Spring context from Xml configuration
		ApplicationContext context1 = new ClassPathXmlApplicationContext("dependencyinjectioncollections\\applicationContext.xml");
		Student student1 = (Student) context1.getBean("students", Student.class);
		System.out.println(student1);
	}
}
