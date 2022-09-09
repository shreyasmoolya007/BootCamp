package com.av;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentUpdate {
    public static void main(String[] args) {
        //first step ->Load or register driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Establishing Connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_2","root","root");

            //Establishing Statement
            PreparedStatement preparedStatement = connection.prepareStatement("update student set name=? where id=?");
            preparedStatement.setString(1,"Shinichi");
            preparedStatement.setInt(2,1);

            //Execute Query
            preparedStatement.executeUpdate();

            //Close Connection
            preparedStatement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
