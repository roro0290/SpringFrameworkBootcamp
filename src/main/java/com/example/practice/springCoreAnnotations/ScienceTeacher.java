package com.example.practice.springCoreAnnotations;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println("hi i am your science teacher");
        System.out.println("my name is john");
    }
}
