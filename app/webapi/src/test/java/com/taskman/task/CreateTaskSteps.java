package com.taskman.task;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CreateTaskSteps {
    private TaskService service;

    @Given("a task service")
    public void aTaskService() {
        service = new TaskServiceStub();
    }

    @When("user adds new task with name $name for user $user")
    public void theTaskIsAdded(String name, String user) {
        service.addTask(new Task(name, user));
    }

    @Then("I can get task with name $name for user $user")
    public void iCanGetTradeWithNameAndUserEqualsTo(String name, String user) {
        Task task = service.getTask(name);
        assertThat(task.getName(), is(name));
        assertThat(task.getUser(), is(user));
    }
}
