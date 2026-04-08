package com.example.tms.Task_management_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tms.Task_management_system.entity.Task;
import com.example.tms.Task_management_system.repository.TaskRepository;

@Service
public class TaskService 
{
	@Autowired
	private TaskRepository taskRepository;
	
	public Task createTask(Task task)
	{
		return taskRepository.save(task);
	}
	
	public Task getTaskById(Long id)
	{
		return taskRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Task not found"));
	}
	public List<Task> getTaskByUser(Long userId)
	{
		return taskRepository.findByUserId(userId);
	}
	public Task UpdateTask(Task task)
	{
		return taskRepository.save(task);
	}
	
	public void deleteTask(Long id)
	{
		taskRepository.deleteById(id);
	}
}
