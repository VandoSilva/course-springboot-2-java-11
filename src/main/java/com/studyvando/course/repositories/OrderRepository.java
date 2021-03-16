package com.studyvando.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studyvando.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
