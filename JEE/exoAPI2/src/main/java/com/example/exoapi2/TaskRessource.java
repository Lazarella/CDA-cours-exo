package com.example.exoapi2;

import com.example.exoapi2.entity.Status;
import com.example.exoapi2.entity.Task;
import com.example.exoapi2.service.TaskService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/task")
public class TaskRessource {
    private final TaskService taskService;

    @Inject
    public TaskRessource(TaskService taskService) {this.taskService = taskService;}

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Task postTask(@FormParam("id")long id,@FormParam("content")String content, @FormParam("status") Status status){
      return taskService.save(id, content, status);
    }

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.APPLICATION_JSON)
    public Task postTask(Task task) {
        return task;
    }
    @DELETE
    @Path("{id}")

    public int delete(@PathParam("id") int id) {
        return id;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Task> getTasks() {
        return List.of(new Task(), new Task()) ;
    }

}
