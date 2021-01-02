package com.example.kkpolak.Jardrew.app;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

  private static DatabaseConnection instance;
  private Connection connection;
  private final String url = "jdbc:mysql://localhost:3306/jardrew?useSSL=false&useUnicode=yes&characterEncoding=UTF-8&allowPublicKeyRetrieval=true&serverTimezone=UTC";
  private final String username = "ecommerceapp";
  private final String password = "ecommerceapp";

  private DatabaseConnection() throws SQLException {
    try {
      Class.forName("org.mysql.Driver");
      this.connection = DriverManager.getConnection(url, username, password);
    } catch (ClassNotFoundException ex) {
      System.out.println("Database Connection Creation Failed : " + ex.getMessage());
    }
  }

  public Connection getConnection() {
    return connection;
  }

  public static DatabaseConnection getInstance() throws SQLException {
    if (instance == null) {
      instance = new DatabaseConnection();
    } else if (instance.getConnection().isClosed()) {
      instance = new DatabaseConnection();
    }

    return instance;
  }

}