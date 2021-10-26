package com.example.practice.springCoreAnnotations;

import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {
    public College(){
        System.out.println("college created");
    }
    public void getName(){
        System.out.println("college name");
    }
}
