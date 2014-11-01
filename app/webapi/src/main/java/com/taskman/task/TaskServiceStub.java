package com.taskman.task;

import java.util.HashMap;
import java.util.Map;

public class TaskServiceStub implements TaskService {
    private Map<String, Task> tasks = new HashMap<>();

    @Override
    public void addTask(Task task) {
        tasks.put(task.getName(), task);
    }

    @Override
    public Task getTask(String name) {
        return tasks.get(name);
    }
}
