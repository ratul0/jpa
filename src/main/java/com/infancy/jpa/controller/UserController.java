package com.infancy.jpa.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infancy.jpa.entity.User;
import com.infancy.jpa.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@GetMapping("/users")
	public List<User> users() {
		return userService.users();
	}

	@PostMapping("/users")
	public User create(@RequestBody @Valid User user) {
		return userService.create(user);
	}

	@GetMapping("users/{userId}")
	public User find(@PathVariable("userId") long id) {
		return userService.find(id);
	}

}
