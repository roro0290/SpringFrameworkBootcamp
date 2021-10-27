package com.example.practice.beanLifecycle;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        StudentDAO studentDAO = new StudentDAO();
        //studentDAO.deleteStudentRecord(3);
        studentDAO.addStudentRecord(5,"jack",234.2,"Veg");
        studentDAO.addStudentRecord(6,"job",543.2,"Non-Veg");
        studentDAO.selectAllRows();
    }
}