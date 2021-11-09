package com.example.practice.restAPI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody (so that it can return json)
@RestController
public class HelloWorldController {
    //get,post,put,delete
    //all these rest API inside controller should return a xml or json to client
    //this class can handle web request
    //this is a simple method which we turn into an API
    //url: http://localhost:8080/hello-world (this url is used to access the REST API)
    //when user enters this url, this rest API will be called and that response will be sent back
    @GetMapping("/hello-world") //this is the uri for this rest API
    public String helloWorld(){
        return "hello world!";
    } //this method/rest api will handle HTTP get request
}
