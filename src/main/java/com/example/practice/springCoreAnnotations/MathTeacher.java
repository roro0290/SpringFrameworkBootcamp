package com.example.practice.springCoreAnnotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println("hi i am your math teacher");
        System.out.println("my name is jack");
    }
}
