///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.pa.tvkabel;
//
///**
// *
// * @author Lenovo
// */
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class PATVKABEL {
//    private Connection connection;
//
//    public PATVKABEL(Connection connection) {
//        this.connection = connection;
//    }
//
//    public boolean registerUser(String username, String password) {
//        String insertUserSQL = "INSERT INTO pelanggan (username, password) VALUES (?, ?)";
//
//        try (PreparedStatement preparedStatement = connection.prepareStatement(insertUserSQL)) {
//            preparedStatement.setString(1, username);
//            preparedStatement.setString(2, password);
//
//            int rowsAffected = preparedStatement.executeUpdate();
//
//            return rowsAffected > 0;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
//    public boolean loginUser(String username, String password) {
//    String loginSQL = "SELECT * FROM pelanggan WHERE username = ? AND password = ?";
//    try (PreparedStatement preparedStatement = connection.prepareStatement(loginSQL)) {
//        preparedStatement.setString(1, username);
//        preparedStatement.setString(2, password);
//        ResultSet resultSet = preparedStatement.executeQuery();
//
//        return resultSet.next();
//    } catch (SQLException e) {
//        e.printStackTrace();
//        return false;
//    }
//}
//
//}