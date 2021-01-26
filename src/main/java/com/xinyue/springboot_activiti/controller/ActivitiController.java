package com.xinyue.springboot_activiti.controller;

import com.xinyue.springboot_activiti.model.TaskRepresentation;
import com.xinyue.springboot_activiti.service.ActivitiService;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jxy
 * @DATE: 2021/1/26
 * @Description:
 **/
@RestController
@RequestMapping(value = "/")
public class ActivitiController {

    @Autowired
    private ActivitiService service;

    @GetMapping(value = "start")
    public String start() {
        return service.start();
    }

    @GetMapping(value = "task")
    public List<TaskRepresentation> getTask(@RequestParam(value = "uid") String uid) {
        List<Task> tasks = service.getTask(uid);
        List<TaskRepresentation> dtos = new ArrayList<>();
        for (Task task : tasks) {
            dtos.add(new TaskRepresentation(task.getId(), task.getName()));
        }
        return dtos;
    }
}
