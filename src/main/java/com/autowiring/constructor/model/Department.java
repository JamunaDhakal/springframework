package com.autowiring.constructor.model;

public class Department {
    private String name;
    
    public Department() {
    }

    // Constructor
    public Department(String name) {
        this.name = name;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{name='" + name + "'}";
    }
}
