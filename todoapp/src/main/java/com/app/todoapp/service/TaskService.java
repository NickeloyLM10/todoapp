package com.app.todoapp.service;

import com.app.todoapp.model.Task;
import com.app.todoapp.repository.TaskRespository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRespository taskRespository;

    public TaskService(TaskRespository taskRespository) {
        this.taskRespository = taskRespository;
    }
    public List<Task> getAllTasks() {
        return taskRespository.findAll();
    }
    public void createTask(String title){
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRespository.save(task);
    }

    public void deleteTask(Long id) {
        taskRespository.deleteById(id);
    }

    public void toggleTask(Long id) {
        Task task = taskRespository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Task id"));
        task.setCompleted(!task.isCompleted());
        taskRespository.save(task);
    }
}
