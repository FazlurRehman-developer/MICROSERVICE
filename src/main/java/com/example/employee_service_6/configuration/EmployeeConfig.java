package com.example.employee_service_6.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EmployeeConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();

    }
}
