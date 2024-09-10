package com.dependencyinjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.dependencyinjection.model.Address;
import com.dependencyinjection.model.Student;
import com.dependencyinjection.service.StudentService;
import com.dependencyinjection.service.StudentServiceImpl;

@Configuration
public class AppConfig {
	
	 @Bean
	    public Address address() {
	        return new Address("123 Elm Street", "Springfield");
	    }

	    @Bean
	    public Student student(Address address) {
	        // Constructor Injection
	        Student student = new Student("John Doe", address);
	        return student;
	    }

	    @Bean
	    public StudentService studentService() {
//	        StudentServiceImpl studentService = new StudentServiceImpl();
//	        studentService.setStudent(student(address())); // Setter Injection
//	        return studentService;
	    	return new StudentServiceImpl(student(address()));
	    }

}
