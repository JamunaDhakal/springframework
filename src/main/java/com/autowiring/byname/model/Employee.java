package com.autowiring.byname.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
    private Department department;
    
    public Employee() {}
    
    public Employee(Department department) {
    	this.department = department;
    }
    
    
    public Department getDepartment() {
        return department;
    }
 
    @Autowired
    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{department=" + department + "}";
    }
}
