package com.example.practice.springCoreAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
        System.out.println("beans.xml file loaded");
        College c = context.getBean("collegeBean",College.class);
        c.getName();
    }
}
