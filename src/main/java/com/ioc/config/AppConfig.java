package com.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import org.springframework.context.annotation.Configuration;
import com.ioc.model.User;
import com.ioc.service.UserService;
import com.ioc.service.UserServiceImp;

@Configuration
public class AppConfig {
	
	@Bean
	public User user() {
		return new User("user",30);
	}
	
	@Bean
	public UserService userService() {
		return new UserServiceImp(user());
	}

}
