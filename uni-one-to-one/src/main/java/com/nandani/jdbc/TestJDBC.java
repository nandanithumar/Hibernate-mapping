/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nandani.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author nandani
 */
public class TestJDBC {
    
    public static void main(String[] args) {
      String jdbcUrl = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false";
            String user = "hbstudent";
            String pass = "hbstudent";
        try {
            System.out.println("Connecting to datbase : " + jdbcUrl);
            Connection conn = DriverManager.getConnection(jdbcUrl, user, pass);
            System.out.println("Connection Successfull");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
