package com.example.practice.loadFromPropertiesFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
        System.out.println("beans.xml is loaded");
        Student s1 = context.getBean("student",Student.class);
        s1.displayStudentInfo();
    }
}
