package com.example.practice.beanLifecycle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.*;


@Component
public class StudentDAO {

    //private String driver = "com.mysql.jdbc.driver";
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    Connection conn = null;
    Statement stmt = null;
    PreparedStatement pst = null;

    @PostConstruct
    public void createConnection() throws SQLException {
        //get a connection. must provide url, username and password to establish the connection
        conn = DriverManager.getConnection(url, username, password);

        //execute a query
        stmt = conn.createStatement();
    }

    public void closeConnection() throws SQLException {
        conn.close();
    }

    //to fetch all the rows from the table
    public void selectAllRows() throws SQLException {
        //returns a table
        ResultSet rs = stmt.executeQuery("SELECT * FROM rohinidb.hostelStudentInfo");

        //extract each row
        while (rs.next()) {
            int studentId = rs.getInt(1);
            String studentName = rs.getString(2);
            double hostelfee = rs.getDouble(3);
            String food_type = rs.getString(4);
            System.out.printf("%d %s %.2f %s %n", studentId, studentName, hostelfee, food_type);
        }
        closeConnection();
    }

    public void deleteStudentRecord(int studentId) throws SQLException {
        stmt.executeUpdate("DELETE FROM rohinidb.hostelStudentInfo WHERE student_id=" + studentId);
        System.out.println("record deleted");
        closeConnection();
    }

    public void addStudentRecord(int studentId, String studentName, double hostelFee, String foodType) throws SQLException {
        String command = "INSERT INTO rohinidb.hostelStudentInfo VALUES (?,?,?,?)";
        pst = conn.prepareStatement(command);
        pst.setInt(1, studentId);
        pst.setString(2, studentName);
        pst.setDouble(3, hostelFee);
        pst.setString(4, foodType);
        pst.executeUpdate();
        closeConnection();
    }

}
