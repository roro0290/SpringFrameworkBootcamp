package com.example.practice.beanLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentDAOConfig.class);
        StudentDAO studentDAO = context.getBean("studentDAO",StudentDAO.class);
        //studentDAO.deleteStudentRecord(3);
        //studentDAO.addStudentRecord(5,"jack",234.2,"Veg");
        //studentDAO.addStudentRecord(6,"job",543.2,"Non-Veg");
        studentDAO.selectAllRows();
        context.close();
    }
}