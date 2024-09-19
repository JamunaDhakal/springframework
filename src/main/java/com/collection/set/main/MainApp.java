package com.collection.set.main;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.collection.set.model.Inventory;


public class MainApp {
	
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        // Load Spring context from XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("setcollection\\applicationContext.xml");

        // Retrieve and print Inventory bean
        Inventory inventory = (Inventory) context.getBean("inventory", Inventory.class);
        System.out.println(inventory);
    }

	

}
