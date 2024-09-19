package com.orm.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orm.jpa.model.Course;
import com.orm.jpa.model.Student;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {


	
	
}
