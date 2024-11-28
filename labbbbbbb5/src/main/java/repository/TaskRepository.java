package repository;

import model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository<Task> extends JpaRepository<Task, Long> {
    List<Task> findByUserId(Long userId);
}