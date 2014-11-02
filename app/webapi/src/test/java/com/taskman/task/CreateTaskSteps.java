package com.taskman.task;

import com.taskman.task.model.Task;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CreateTaskSteps {
    private TaskRepository service;

    @Given("a task repository")
    public void aTaskService() {
        service = new TaskRepositoryStub();
    }

    @When("user adds new task with name $name for user $user")
    public void theTaskIsAdded(String name, String user) {
        service.newTask(new Task(name, user));
    }

    @Then("I can find this task by name $name for user $user")
    public void iCanGetTradeWithNameAndUserEqualsTo(String name, String user) {
        Task task = service.findTaskByName(name);
        assertThat(task.getName(), is(name));
        assertThat(task.getUser(), is(user));
    }
}
