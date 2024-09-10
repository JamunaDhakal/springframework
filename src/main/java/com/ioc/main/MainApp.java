package com.ioc.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.config.AppConfig;
import com.ioc.service.UserService;
public class MainApp {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class) ;
		UserService user = context.getBean(UserService.class);
		user.UserServiceDetails();
	
			 
	
	}

}
