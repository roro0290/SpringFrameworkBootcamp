package com.example.practice.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
    @Autowired
    @Qualifier("humanHeart")
    private Heart heart;

    //@Autowired
    //@Qualifier("humanHeart")
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
