package com.example.practice.dependencyInjection.objects;

public class Student {
    /*
        Note the dependency: Student class DEPENDS on MathCheat
        We are adding this dependency using the setter method
         */
    private int id;
    private MathCheat mathCheat;
    public void cheating(){
        mathCheat.mathCheat(id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }
    public Student(){}

    public Student(int id, MathCheat mathCheat){
        this.id=id;
        this.mathCheat=mathCheat;
    }
}
