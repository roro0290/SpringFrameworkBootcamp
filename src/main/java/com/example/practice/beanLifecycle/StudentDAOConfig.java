package com.example.practice.beanLifecycle;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.practice.beanLifecycle")
@PropertySource({"classpath:jdbc-connection.properties"})
public class StudentDAOConfig {
}
