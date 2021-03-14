package com.studyvando.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studyvando.course.entities.User;
import com.studyvando.course.repositories.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> finAll() {
		return repository.findAll();
	}

	public User finById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
