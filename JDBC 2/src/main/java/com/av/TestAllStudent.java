package com.av;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class TestAllStudent {
    public static void main(String[] args){
        try {

            Driver driver = new Driver();

            DriverManager.registerDriver(driver);
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_2", "root", "root");

            Statement statement = connection.createStatement();
            statement.executeQuery("select * from student");

            while(resultSet.next()){
                System.out.println("Student Id :"+resultSet.getInt(1));
                System.out.println("Student Name :"+resultSet.getInt(2));
                System.out.println("Student Marks :"+resultSet.getInt(3));

            }
          connection.close();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
