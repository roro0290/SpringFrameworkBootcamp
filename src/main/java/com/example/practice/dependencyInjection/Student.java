package com.example.practice.dependencyInjection;

public class Student {

    private int studentId;
    private String studentName;

    /*
    Dependency of student
    when I create an object of Student, it should have a name
     */
    public void displayStudentInfo(){
        System.out.println("Student name is "+studentName);
        System.out.println("Student id is "+studentId);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
