package com.example.jenkinstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈功能概述〉<br>
 *
 * @author: Mike
 * @date: 2020/8/18 10:36
 * @DESCRIPTION:
 */
@RestController
public class StatusController {
    @GetMapping("Status")
    public String getStatus(){
        return "jenkins build success!";
    }
}