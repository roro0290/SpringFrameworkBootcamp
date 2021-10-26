package com.example.practice.springCoreAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


//@Component("collegeBean")
@Component //default name is college
public class College {

    //college has a dependency on principal
    @Autowired
    private Principal principal;
    @Autowired
    private Teacher teacher;

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    public College(){
        System.out.println("college no principal");
    }

    //create a simple constructor for dependency inection
    public College(Principal principal) {
        this.principal = principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void test(){
        principal.principalInfo();
        teacher.teach();
        System.out.println("testing methods");
    }
}
