/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
public class database {
    public static Connection connection = null;
    protected Statement statement;
    protected PreparedStatement preparedStatement;
    protected ResultSet resultSet;
    private final static String dbHost = "localhost";
    private final static String dbName = "tv_kabel";
    private final static String dbUser = "root";
    private final static String dbPass = "";
    public database() {
        try {
            String url = "jdbc:mysql://" + dbHost + "/" + dbName;
            this.connection = DriverManager.getConnection(url, dbUser, dbPass);
            statement=connection.createStatement();
            System.out.println("Database Connected!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }  
    public Connection getConnection(){
        return connection;
    }
    public ResultSet select(String query) throws SQLException{
      ResultSet values=statement.executeQuery(query);
      return values;
    }
    public void update (String qq) throws SQLException{
        statement.executeUpdate(qq);
    }
    public void disconnected(){
        try {
            connection.close();
            System.out.println("Database Closed");
        }catch (SQLException ex) {
            System.out.println("Database Failed to Close");
        }
    }
}