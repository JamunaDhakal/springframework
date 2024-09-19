package com.jdbc.dao;

import java.util.List;

import com.jdbc.model.Student;

public interface StudentDao {
	public  int insert(Student student) ;

	public Student getStudentById(int studentId);

	public List<Student> getAllStudent();

	public int change(Student student);

	public int delete(int id);
	
    public void printStudentEmail(int id);

	
	
	

}
