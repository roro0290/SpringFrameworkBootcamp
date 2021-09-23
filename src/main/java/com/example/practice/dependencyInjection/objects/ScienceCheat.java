package com.example.practice.dependencyInjection.objects;

public class ScienceCheat implements Cheat{
    @Override
    public void cheatingStart(int id) {
        System.out.println("Student "+id+" is science cheating");
    }
}
