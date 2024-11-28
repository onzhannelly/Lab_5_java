package service;

import model.Task;

import java.util.List;
import java.util.Optional;

public class TaskService {
    public Task saveTask(Task task) {
        return task;
    }

    public List<Task> getAllTasks() {
        return null;
    }

    public Optional<Task> getTaskById(Long id) {
        return null;
    }

    public Optional<Task> updateTask(Long id, Task taskDetails) {
        return null;
    }

    public boolean deleteTask(Long id) {
        return false;
    }
}