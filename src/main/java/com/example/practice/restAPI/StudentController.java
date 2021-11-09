package com.example.practice.restAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    //http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("ro","ro");
    }
}
