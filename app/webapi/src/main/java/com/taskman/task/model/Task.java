package com.taskman.task.model;

public class Task {
    private String user;
    private String name;

    public Task() {
    }

    public Task(String aName, String aUser) {
        name = aName;
        user = aUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
