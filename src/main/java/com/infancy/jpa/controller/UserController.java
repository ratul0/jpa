package com.infancy.jpa.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infancy.jpa.entity.User;
import com.infancy.jpa.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List<User> users(){
		return userService.users();
	}
	
}
