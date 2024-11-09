package com.example.To_Do_List.controller;

import com.example.To_Do_List.model.Task;
import com.example.To_Do_List.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

       @GetMapping
       public List<Task> getAll () {
        return taskService.getAllTasks();
       }

       @GetMapping("/{id}")
       public Optional<Task> getTaskById(@PathVariable long id) {
         return taskService.findTaskById(id);
       }

       @PostMapping
       public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
       }

     @DeleteMapping("/{id}")
     public void deleteTaskById(@PathVariable long id) {
        taskService.deleteTaskById(id);
     }

     @DeleteMapping
     public void DeleteAllTasks () {
        taskService.deleteAllTasks();
     }

     @PutMapping("/{id}")
     public Task updateTask(@PathVariable long id, @RequestBody Task task) {
        task.setId(id);
        return taskService.createTask(task);
     }

}
