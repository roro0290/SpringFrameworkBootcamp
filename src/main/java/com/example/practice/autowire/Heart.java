package com.example.practice.autowire;

public class Heart {
    private String nameOfAnimal;
    private int noOfHeart;

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public int getNoOfHeart() {
        return noOfHeart;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public void setNoOfHeart(int noOfHeart) {
        this.noOfHeart = noOfHeart;
    }

    public void pump(){
        System.out.println("your heart is pumping");
        System.out.println("Alive");
        System.out.println("Number of heart present: "+this.getNoOfHeart());
        System.out.println("I am a "+this.getNameOfAnimal());
    }
}
