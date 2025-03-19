package com.javatechie.crud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class to start the Spring Boot application.
 */
@SpringBootApplication
public class SpringBootCrudExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCrudExampleApplication.class, args);
        System.out.println("🚀 Spring Boot CRUD Application is running on port 9191...");
    }
}
