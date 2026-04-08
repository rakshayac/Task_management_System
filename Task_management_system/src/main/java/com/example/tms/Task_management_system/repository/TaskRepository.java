package com.example.tms.Task_management_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tms.Task_management_system.entity.Task;

public interface TaskRepository extends JpaRepository< Task , Long>
{
	List<Task> findByUserId(Long userId);

}
