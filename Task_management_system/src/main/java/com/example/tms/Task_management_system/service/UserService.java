package com.example.tms.Task_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tms.Task_management_system.entity.User;
import com.example.tms.Task_management_system.repository.UserRepository;

@Service
public class UserService 
{
	@Autowired
	private UserRepository userRepository;
	
	public User register(User user)
	{
		return userRepository.save(user);
	}
	
	public User login(String email)
	{
		return userRepository.findByEmail(email)
				.orElseThrow(() -> new RuntimeException("User not found"));
	}
}
