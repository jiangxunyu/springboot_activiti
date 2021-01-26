package com.xinyue.springboot_activiti;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {org.activiti.spring.boot.SecurityAutoConfiguration.class})
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringbootActivitiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootActivitiApplication.class, args);
    }

}
