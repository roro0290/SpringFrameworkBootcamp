package com.example.practice.restAPI;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //a method which returns a java bean/object to client
    //http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("ro","ro");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("ro","ro"));
        students.add(new Student("foo","moo"));
        students.add(new Student("hello","world"));
        students.add(new Student("jack","jill"));
        return students;
    }
}
