package com.orm.jpa.model;

import java.util.Set;

import jakarta.persistence.Column;
//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

//	    @Column(name = "name")
//	    private String name;
	    @Column(name="title")
	    private String title;
	    
	    @ManyToMany(mappedBy="courses")
	    
	    private Set<Student> students;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

//		public String getName() {
//			return name;
//		}

//		public void setName(String name) {
//			this.name = name;
//		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Set<Student> getStudents() {
			return students;
		}

		public void setStudents(Set<Student> students) {
			this.students = students;
		}
	    
	    
	    

}
