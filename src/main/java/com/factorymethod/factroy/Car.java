package com.factorymethod.factroy;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a car");
    }
}