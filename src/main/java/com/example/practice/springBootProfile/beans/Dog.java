package com.example.practice.springBootProfile.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("woof");
    }
}
