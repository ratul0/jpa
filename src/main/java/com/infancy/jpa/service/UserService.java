package com.infancy.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infancy.jpa.entity.User;
import com.infancy.jpa.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> users() {
		return userRepository.findAll();
	}

	public User create(User user) {
		return userRepository.save(user);
	}
}
