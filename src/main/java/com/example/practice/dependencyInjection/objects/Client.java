package com.example.practice.dependencyInjection.objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        MathCheat cheat = new MathCheat();
        s.setMathCheat(cheat); //inject the mathcheat object
        /*
        This is not good
        We are creating 2 objects and setting it by ourselves
        NO. Spring will do it
        We should not be creating objects and setting the object using setter should be done by Spring
         */
        s.cheating();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("beans.xml file loaded");
        Student student1 = context.getBean("student1",Student.class);
        student1.cheating();
        Student student2 = context.getBean("student2",Student.class);
        student2.cheating();
        Student student3 = context.getBean("student3",Student.class);
        student3.cheating();

    }
}
