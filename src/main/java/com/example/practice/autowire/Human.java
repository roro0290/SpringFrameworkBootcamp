package com.example.practice.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
    private Heart heart;

    @Autowired
    public void setHeart(Heart heart) {
        System.out.println("setter method is called");
        this.heart = heart;
    }

    public void startPumping(){
        if(heart!=null){
            heart.pump();
        }else{
            System.out.println("you are dead");
        }
    }

    public Human(){}

    //@Autowired
    public Human(Heart heart) {
        this.heart = heart;
        System.out.println("human constructor is called");
    }
}
