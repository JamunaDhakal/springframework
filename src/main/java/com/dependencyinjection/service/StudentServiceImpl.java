package com.dependencyinjection.service;

import com.dependencyinjection.model.Student;

public class StudentServiceImpl implements StudentService {
	private Student student;
	
	// Constructor Injection
//	public StudentServiceImpl(Student student) {
//		this.student =student;
//		
//	}
	
	public StudentServiceImpl(Student student) {
		this.student =student;
		
	}

	// Setter Injection
    public void setStudent(Student student) {
        this.student = student;
    }

	@Override
	public void displayStudentInfo() {
		System.out.println("Student Info: " + student);
		
	}

}
