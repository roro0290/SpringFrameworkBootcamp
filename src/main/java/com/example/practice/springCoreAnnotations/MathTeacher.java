package com.example.practice.springCoreAnnotations;

public class MathTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println("hi i am your math teacher");
        System.out.println("my name is jack");
    }
}
