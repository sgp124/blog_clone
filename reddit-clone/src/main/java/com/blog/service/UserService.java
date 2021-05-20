package com.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.User;
import com.blog.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public void addUser(String userName, String password, String email) {
		
		User user = new User();
		user.setUsername(userName);
		user.setPassword(password);
		user.setEmail(email);
		userRepository.save(user);
	}
	
	
}
