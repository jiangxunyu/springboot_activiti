package com.xinyue.springboot_activiti.model;

/**
 * @Author: jxy
 * @DATE: 2021/1/26
 * @Description:
 **/
public class TaskRepresentation {
    private String id;
    private String name;
    public TaskRepresentation(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
