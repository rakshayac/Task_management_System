package com.example.tms.Task_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tms.Task_management_system.entity.Task;
import com.example.tms.Task_management_system.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController 
{
	@Autowired
	private TaskService taskService;
	
	@PostMapping
	public Task createTask(@RequestBody Task task)
	{
		return taskService.createTask(task);
	}
	@GetMapping("/user/{iserId}")
	public List<Task> getTaskByUser(@PathVariable Long userId)
	{
		return taskService.getTaskByUser(userId);
	}
	
	@GetMapping("/{id}")
	public Task getTaskById(@PathVariable Long id)
	{
		return taskService.getTaskById(id);
	}
	
	@PutMapping
	public Task updateTask(@RequestBody Task task)
	{
		return taskService.UpdateTask(task);
	}
	
	@DeleteMapping("/{id}")
	public String deleteTask(@PathVariable Long id)
	{
		taskService.deleteTask(id);
		return "Task deleted successfully";
	}
}
