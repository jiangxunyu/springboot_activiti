package com.xinyue.springboot_activiti.service;

import org.activiti.engine.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.InputStream;

/**
 * @Author: jxy
 * @DATE: 2021/1/26
 * @Description:
 **/
@Service
public class DeploymentService  {

    @Resource
    private RepositoryService repositoryService;

    public String deploy(String name, InputStream in){
        String deploymentId = repositoryService.createDeployment()
                .addInputStream(name, in)
                .name(name)
                .key(name)
                .deploy()
                .getId();
        return deploymentId;
    }
}
