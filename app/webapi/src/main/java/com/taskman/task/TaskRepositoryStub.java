package com.taskman.task;

import com.taskman.task.model.Task;

import java.util.HashMap;
import java.util.Map;

public class TaskRepositoryStub implements TaskRepository {
    private Map<String, Task> tasks = new HashMap<>();

    @Override
    public void newTask(Task task) {
        tasks.put(task.getName(), task);
    }

    @Override
    public Task findTaskByName(String name) {
        return tasks.get(name);
    }
}
