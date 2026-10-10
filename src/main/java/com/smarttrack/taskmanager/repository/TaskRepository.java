package com.smarttrack.taskmanager.repository;

import com.smarttrack.taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}