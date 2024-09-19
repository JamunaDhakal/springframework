package com.orm.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orm.jpa.model.Course;
import com.orm.jpa.model.Student;
import com.orm.jpa.repository.CourseRepository;

import jakarta.persistence.Query;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	
	@Transactional
	public  Course save(Course course) {
		return courseRepository.save(course);
		
	}
	@Transactional
	public Course findById(Long i) {
		Optional<Course> course = courseRepository.findById(i);
		return course.orElseThrow(() -> new RuntimeException("Student not found with id: " + i));
    }
	
	@Transactional
	public List<Course> findAll(){
		List<Course> course = courseRepository.findAll();
		return course;
	}
	
//	@Transactional
//	public Student updateStudent(Student studentUpdate) {
//		Student student = courseRepository).createQuery(studentUpdate);	
//		return student;
//		  Query query = entityManager.createQuery(
//	                "UPDATE Student s SET s.name = :newName WHERE s.course.id = :courseId");
//	        query.setParameter("newName", newName);
//	        query.setParameter("courseId", courseId);
//	        query.executeUpdate();
//	}
	@Transactional
	public void delete(Long id) {
        Course course = findById(id);
        if (course != null) {
        	courseRepository.delete(course);
        }
	}
	
	
//	@Transactional
//	public Course delete(Course c) {
//		courseRepository.delete(c);
//		return c;
//		Query query = entityManager.createNativeQuery("DELEte from student");
//		query.executeUpdate();
//		        
//	}
	

}
