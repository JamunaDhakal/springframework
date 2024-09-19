package com.factorymethod.factroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public VehicleFactory vehicleFactory() {
		return new BikeFactory();
	}
	
	@Bean
    public VehicleFactory vehicleFactory1() {
        return new CarFactory();
    }

	
	@Bean 
	public Vehicle bike() {
		return vehicleFactory().createVehicle();
	}
	@Bean 
	public Vehicle car() {
		return vehicleFactory1().createVehicle();
	}

}
