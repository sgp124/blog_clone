package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blog.service.UserService;

import ch.qos.logback.core.util.TimeUtil;
//import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/rest")

public class UserController {

	@Autowired
	UserService userService;
	
	//@ApiOperation(value = "Adding user")
	@PostMapping(value = "/user" )
	public ResponseEntity<String> addUser(@RequestParam(name="username") String username,
			@RequestParam(name="password") String password,
			@RequestParam(name="email") String email) {
		userService.addUser(username, password, email);
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	
}
