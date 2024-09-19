package com.collection.map.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.collection.map.config.AppConfig;
import com.collection.map.model.Inventory;
public class MainApp {
	  @SuppressWarnings("resource")
	public static void main(String[] args) {
		  
	        // Load Spring context from Java configuration
	        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	        Inventory inventory = (Inventory) context.getBean(Inventory.class);
	        System.out.println(inventory);
	        
	     // Load Spring context from XML configuration
            ApplicationContext context1 = new ClassPathXmlApplicationContext("mapcollection\\applicationContext.xml");
            Inventory inventory1 = (Inventory) context1.getBean("inventory",Inventory.class);
            System.out.println(inventory1);
	        
	 
	            
	        
	    }
}
