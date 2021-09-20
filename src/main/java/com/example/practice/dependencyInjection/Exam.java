package com.example.practice.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
        /*
        Student student = new Student(); // this is stil creating an object
        student.setStudentName("Jack"); //and hard coding the value by ourselves
        student.displayStudentInfo();
        whenever spring creates a student object,
        it will inject the value that i have provided for student name
        if we want to force spring to create the objects, we must configure the beans

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        john.displayStudentInfo();
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student jack = context.getBean("Jack",Student.class);
        jack.displayStudentInfo();

        Student john = context.getBean("John",Student.class);
        john.displayStudentInfo();


    }
}
