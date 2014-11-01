package com.taskman.task;

public final class Task {
    private final String user;
    private final String name;

    public Task(String aName, String aUser) {
        name = aName;
        user = aUser;
    }

    public String getName() {
        return name;
    }

    public String getUser() {
        return user;
    }
}
