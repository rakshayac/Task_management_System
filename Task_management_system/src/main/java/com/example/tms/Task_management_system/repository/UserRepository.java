package com.example.tms.Task_management_system.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tms.Task_management_system.entity.User;

public interface UserRepository extends JpaRepository<User, Long>
{
	Optional<User> findByEmail(String email);
}
