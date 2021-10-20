package com.example.practice.loadFromPropertiesFile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
    @Value("${student.name}") //by using annotation here, setter method is not needed
    private String name;
    @Value("${student.interestedCourse}")
    private String interestedCourse;
    @Value("${student.hobby}")
    private String hobby;

    public String getName() {
        return name;
    }

    public String getInterestedCourse() {
        return interestedCourse;
    }

    public String getHobby() {
        return hobby;
    }

    public void displayStudentInfo(){
        System.out.println("Student name "+ name);
        System.out.println("Student interested course "+ interestedCourse);
        System.out.println("Student hobby "+ hobby);
    }
}
