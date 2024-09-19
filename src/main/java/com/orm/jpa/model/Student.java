package com.orm.jpa.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String Email;
	
	@ManyToMany(fetch = FetchType.EAGER)
//	@JoinTable(name = "student_course",joinColumns = @JoinColumns(name = "student_id"),inverseJoinColumns = @JoinColumn(name = "course_id"))
	@JoinTable(
		    name = "student_course",
		    joinColumns = @JoinColumn(name = "student_id"),
		    inverseJoinColumns = @JoinColumn(name = "course_id")
		)
	private Set<Course> courses;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Set<Course> getCourse() {
		return courses;
	}

	public void setCourse(Set<Course> courses) {
		this.courses = courses;
	}
	
	
	

}
