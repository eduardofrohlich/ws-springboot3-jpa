package com.eduardofrohlich.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardofrohlich.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
	