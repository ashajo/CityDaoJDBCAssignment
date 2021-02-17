package se.lexicon.Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
     private static final String URL = "jdbc:mysql://localhost:3306/world";
     private static final String USERNAME = "root";
     private static final String PASSWORD = "root";

     public static Connection getConnection(){
         Connection connection= null;
         try {
             connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             System.out.println("#### MYSQL Connection is established ####");
         } catch (SQLException e) {
             e.printStackTrace();
         }
         return connection;
     }
}
