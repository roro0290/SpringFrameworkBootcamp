package com.example.practice.springCoreAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.example.practice.springCoreAnnotations")
public class CollegeConfig {

    @Bean
    public Principal principalObj(){
        return new Principal();
    } //pass this method in collegeBean

    @Bean(name = "colBean")
    //method name will be by default the bean id
    //unless you specify
    public College collegeBean(){
        //this method will return a college object
        return new College(principalObj());
    }

}
