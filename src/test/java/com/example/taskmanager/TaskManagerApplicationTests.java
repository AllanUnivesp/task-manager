package com.example.taskmanager;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TaskManagerApplicationTests {
    @Autowired
    private TaskRepository taskRepository;

    @Test
    public void testCreateReadDelete() {
        Task task = new Task();
        task.setTitle("Test Task");
        task.setDescription("This is a test task");
        task.setCompleted(false);

        taskRepository.save(task);

        List<Task> tasks = taskRepository.findAll();
        assertThat(tasks).hasSize(1).extracting(Task::getTitle).contains("Test Task");

        taskRepository.deleteAll();
        assertThat(taskRepository.findAll()).isEmpty();
    }
}
