package com.collection.model;

public class Course {
    private String courseName;

    // Constructors
    public Course() {}

    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Getter and Setter
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
    
}