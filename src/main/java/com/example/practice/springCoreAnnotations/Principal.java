package com.example.practice.springCoreAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Principal {
    public void principalInfo(){
        System.out.println("Hi i am your principal");
        System.out.println("My name is James Bond");
    }
}
