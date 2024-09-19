package com.factorymethod.factroy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MainApp {
	 public static void main(String[] args) {
	        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	        // Get and use vehicles from the first factory
	        Vehicle car = (Vehicle) context.getBean("car",Vehicle.class);
	        car.drive();  // Outputs: Driving a car

	        Vehicle bike = (Vehicle) context.getBean("bike",Vehicle.class);
	        bike.drive();  

	     
	    }
	

}
