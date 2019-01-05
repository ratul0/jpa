package com.infancy.jpa.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

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

	public User find(long id) {
		return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found"));
	}

	public User update(long id, User user) {
		userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found"));
		user.setId(id);
		return userRepository.save(user);
	}

	public void delete(long id) {
		User user = userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found"));
		userRepository.delete(user);
	}
}
