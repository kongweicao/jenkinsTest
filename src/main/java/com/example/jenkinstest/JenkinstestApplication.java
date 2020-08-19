package com.example.jenkinstest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class JenkinstestApplication {

    public static void main(String[] args) {
        log.info("=====================jenkins-test启动===========================");
        SpringApplication.run(JenkinstestApplication.class, args);
    }

}
