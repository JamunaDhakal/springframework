package com.componentannotation.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String name;
    private Address address;

    @Autowired
    public Employee(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Address: " + address);
    }
}