package com.taskman.task;

import com.taskman.task.model.Task;

public interface TaskRepository {
    void newTask(Task task);

    Task findTaskByName(String name);
}
