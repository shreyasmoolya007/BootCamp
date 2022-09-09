package com.av;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDelete {
    public static void main(String[] args) {
        //first step ->Load or register driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Establishing Connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_2","root","root");

            //Establishing Statement
            PreparedStatement preparedStatement = connection.prepareStatement("delete from student where id=?");
            preparedStatement.setInt(1,2);

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
