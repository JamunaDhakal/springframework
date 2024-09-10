package com.ioc.service;

import com.ioc.model.User;

public class UserServiceImp implements UserService{
	private User user;
	
	public UserServiceImp(User user) {
		this.user = user;
	}
	
	@Override
	public void UserServiceDetails() {
		System.out.println("User Name: " + user.getName());
        System.out.println("User Age: " + user.getAge());
		
	}

}
