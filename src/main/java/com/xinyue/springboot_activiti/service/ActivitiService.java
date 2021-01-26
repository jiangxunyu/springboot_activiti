package com.xinyue.springboot_activiti.service;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: jxy
 * @DATE: 2021/1/26
 * @Description:
 **/
@Service
public class ActivitiService {
    @Resource
    private RuntimeService runtimeService;
    @Resource
    private TaskService taskService;
    /**
     * start activiti process
     *
     * @return instance id
     */
    public String start() {
        ProcessInstance instance = runtimeService.startProcessInstanceByKey("SimpleProcess");
        return instance.getId();
    }
    /**
     * get user task list
     *
     * @param uid
     * @return user task list
     */
    public List<Task> getTask(String uid) {
        List<Task> tasks = taskService.createTaskQuery().taskAssignee(uid).list();
        return tasks;
    }
}
