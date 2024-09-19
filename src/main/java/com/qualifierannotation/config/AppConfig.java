package com.qualifierannotation.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.qualifierannotation.model.Address;
import com.qualifierannotation.model.Employee;

@Configuration
@ComponentScan(basePackages = "com.componentannotation.model")
public class AppConfig {
	
	@Bean
	@Qualifier("homeAddress")
	public Address homeAddress() {
        return new Address("123 Main St", "Springfield");
    }
	
	@Bean
    @Qualifier("workAddress")
    public Address workAddress() {
        return new Address("456 Business Rd", "Metropolis");
    }

    @Bean
    public Employee employee(@Qualifier("workAddress") Address address) {
        return new Employee(address); // Constructor injection with qualifier
    }
    
 

}
