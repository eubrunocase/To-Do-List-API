package com.example.To_Do_List.repository;

import com.example.To_Do_List.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
