package com.studyvando.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studyvando.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
