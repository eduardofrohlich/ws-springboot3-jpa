package com.eduardofrohlich.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardofrohlich.course.entities.OrderItem;
import com.eduardofrohlich.course.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
	