package com.xinyue.springboot_activiti.controller;

import com.xinyue.springboot_activiti.service.DeploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Author: jxy
 * @DATE: 2021/1/26
 * @Description:
 **/
@Controller
public class DeploymentController {

    @Autowired
    private DeploymentService service;

    @PostMapping(value = "/deploy")
    public String deploy(@RequestParam("file")MultipartFile file){
        try {
            return service.deploy(file.getOriginalFilename(),file.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("upload failed");
        }
    }
}
