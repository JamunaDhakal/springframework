package com.orm.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orm.jpa.model.Course;
import com.orm.jpa.model.Student;
import com.orm.jpa.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	@Transactional
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	@Transactional
	public Student findById(Long id) {
		Optional<Student> student = studentRepository.findById(id);
		return student.orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }
	
	public List<Student> findAll(){
		List<Student> student = studentRepository.findAll();
		return student;
	}
	
	@Transactional
	public void delete(Long id) {
		Student student = findById(id);
        if (student != null) {
        	studentRepository.delete(student);
        }
	}
	
	@Transactional
	public void delete(Student s) {
		studentRepository.delete(s);       
	}
	

}
