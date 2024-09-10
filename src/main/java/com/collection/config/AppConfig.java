package com.collection.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;

import com.collection.model.Course;
import com.collection.model.Student;

public class AppConfig {
	
	@Bean
	public Course course1() {
		return new Course("Mathematics");
	}
	
	@Bean
	public Course course2() {
		return new Course("English");
	}
	
	@Bean
	public Course course3() {
		return new Course("Science");
	}
	
	@Bean
	public List<Course> courses(){
		return Arrays.asList(course1(),course2());
	}
	
	@Bean
	public Student student() {
		return new Student("yuna", courses());
	}

}
