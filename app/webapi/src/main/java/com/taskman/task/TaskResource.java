package com.taskman.task;
import com.taskman.task.model.Task;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/tasks")
public class TaskResource {

    @GET
    @Path("{taskName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTask(@PathParam("taskName")String taskName) {

        return Response.ok().entity(new Task("Name", "User")).build();
    }
}
