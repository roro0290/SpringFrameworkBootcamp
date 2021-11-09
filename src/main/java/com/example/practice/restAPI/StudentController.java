package com.example.practice.restAPI;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    //http://localhost:8080/student/ramesh/fadatare
    //write a REST API which will bind the value of these path variables in the method
    //URI template path variable
    //@PathVariable annotation to bind the request URL template path variable to the method variable
    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String first, @PathVariable("lastName") String last){
        return new Student(first,last);
    }

    //build a restAPI to handle query parameters
    //http://localhost:8080/student/query?firstName=Ramesh&lastName=fadatare
    //each and every rest api endpoint should have a unique uri
    //Use @RequestParam to bind query parameter to method argument
    @GetMapping("/student/query")
    public Student studentQueryParam(@RequestParam("firstName") String first, @RequestParam("lastName") String last){
        return new Student(first,last);
    }

}
