package com.example.tms.Task_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.tms.Task_management_system.entity.User;
import com.example.tms.Task_management_system.service.UserService;


@RestController
@RequestMapping("/auth")
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public User register(@RequestBody User user)
	{
		return userService.register(user);
	}
	
	@GetMapping("/login")
	public User login(@RequestParam String email)
	{
		return userService.login(email);
	}
	

}
