package com.example.practice.springBootProfile.properties;

import com.example.practice.springBootProfile.beans.MyDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("myDatasource.properties")
public class MyDataSourceConfiguration {

    //We want to pass username & passwords by fetching it from properties file
    //It needs to know what value to pass through
    @Bean
    public MyDataSource myDataSource(@Value("${myDatasource.username}") String username,
                                     @Value("${myDatasource.password}") String password){

        MyDataSource myDataSource = new MyDataSource();
        myDataSource.setUsername(username);
        myDataSource.setPassword(password);
        System.out.println("myDataSource: "+myDataSource.getPassword());
        return myDataSource;
    }
}
