package com.example.practice.dependencyInjection.objects;

public class Student {
    /*
        Note the dependency: Student class DEPENDS on MathCheat
        We are adding this dependency using the setter method
         */
    private int id;
    private Cheat cheat;

    public void cheating(){
        cheat.cheatingStart(id);
    }

    public Student(int id, Cheat cheat){
        this.id=id;
        this.cheat=cheat;
    }
}
