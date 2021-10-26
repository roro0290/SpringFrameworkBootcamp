package com.example.practice.springCoreAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


//@Component("collegeBean")
public class College {

    //college has a dependency on principal
    private Principal principal;

    /*public College(){
        System.out.println("college no principal");
    }*/

    //create a simple constructor for dependency inection
    public College(Principal principal) {
        this.principal = principal;
    }

    public void test(){
        principal.principalInfo();
        System.out.println("testing methods");
    }
}
