package com.example.practice.IOC;

public class Airtel implements Sim {

    //this constructor will be called when IOC create object
    public Airtel(){
        System.out.println("airtel constructor called");
    }

    @Override
    public void calling() {
        System.out.println("calling using airtel sim");
    }

    @Override
    public void data() {
        System.out.println("browsing internet using airtel sim");
    }
}
