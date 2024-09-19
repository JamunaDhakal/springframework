package com.orm.jpa.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.orm.jpa.config.AppConfig;
import com.orm.jpa.model.Course;
import com.orm.jpa.model.Student;
import com.orm.jpa.service.CourseService;
import com.orm.jpa.service.StudentService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		StudentService studentService = context.getBean(StudentService.class);
		CourseService courseService = context.getBean(CourseService.class);
//		
//		Course course1 = new Course();
//		course1.setTitle("Mathematics");
//		
		Course course = new Course();
//		course.setTitle("Science");
//		
		Student student = new Student();
//		student.setName("joy");
//		student.setEmail("joy123@gmail.com");
//		
//		Set<Course> courses = new HashSet<>();
//		courses.add(course);
//		courses.add(course1);
//		student.setCourse(courses);
//		
//		
//		courseService.save(course);
//		courseService.save(course1);
//		
//		studentService.saveStudent(student);
//		System.out.print("Student data Saved.");
//		
//		Student studentById = studentService.findById(8L);
//		Course courseById = courseService.findById(1L);
//		System.out.println("Retieved Student :" + studentById.getName());
//		System.out.print("Retieved Student :" + studentById.getCourse());
//		System.out.println("Retieved Student1 :" + courseById.getTitle());
//		Student student1 = studentDao.getStudentById(1221);
//	    System.out.print(student1.getEmail());
//	    studentDao.printStudentEmail(12);
		
//		List<Student> studentAll= studentService.findAll();
//		List<Course> courseAll = courseService.findAll();
//		System.out.println("Retieved Student :" + studentAll);
//		System.out.println("Retieved Student :" + courseAll);
		
//		studentService.delete(8l);
		courseService.delete(1l);
		System.out.println("deleted successfully");
	   
		
	}

}
