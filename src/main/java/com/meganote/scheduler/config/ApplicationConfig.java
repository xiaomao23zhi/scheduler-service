package com.meganote.scheduler.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "bean")
@Data
public class ApplicationConfig {

    private String message = "Application default message";
}
