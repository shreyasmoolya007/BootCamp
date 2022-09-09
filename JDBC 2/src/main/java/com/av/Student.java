package com.av;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Student {
    public static void main(String[] args) {
        //first step ->Load or register driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Establishing Connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_2","root","root");

            //Establishing Statement
            PreparedStatement preparedStatement = connection.prepareStatement("insert into student values(?,?,?)");
            preparedStatement.setInt(1,2);
            preparedStatement.setString(2,"Kid");
            preparedStatement.setDouble(3,95);

            //Execute Query
            int res = preparedStatement.executeUpdate();

            //Close Connection
            connection.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}