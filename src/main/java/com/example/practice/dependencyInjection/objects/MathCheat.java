package com.example.practice.dependencyInjection.objects;

public class MathCheat implements Cheat {

    @Override
    public void cheatingStart(int id) {
        System.out.println("Student "+id+" is math cheating");
    }
}
