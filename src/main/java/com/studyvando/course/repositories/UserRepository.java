package com.studyvando.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studyvando.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
