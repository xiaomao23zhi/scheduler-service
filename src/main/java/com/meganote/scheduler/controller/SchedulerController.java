package com.meganote.scheduler.controller;

import com.meganote.scheduler.config.ApplicationConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchedulerController {

    private final ApplicationConfig applicationConfig;

    public SchedulerController(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }

    @GetMapping
    public String message() {

        return String.format(applicationConfig.getMessage(), "1", "2");
    }
}
