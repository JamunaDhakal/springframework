package com.orm.jpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orm.jpa.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	
}
