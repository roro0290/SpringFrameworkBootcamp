package com.example.practice.springBootProfile.properties;

import com.example.practice.springBootProfile.beans.Animal;
import com.example.practice.springBootProfile.beans.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationClass implements CommandLineRunner {

    @Autowired
    private Animal animal;
    public static void main(String[] args) {
        SpringApplication.run(ApplicationClass.class,args);
    }

    @Override
    public void run(String... args) throws Exception{
        System.out.println(animal);
        animal.makeSound();
    }
}
