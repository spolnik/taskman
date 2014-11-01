package com.taskman.task;

public interface TaskService {
    void addTask(Task task);

    Task getTask(String name);
}
