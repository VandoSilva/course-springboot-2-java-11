package com.studyvando.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studyvando.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
