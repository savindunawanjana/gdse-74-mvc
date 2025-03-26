/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author savindu
 */
public class DbConnection {
    
     private static DbConnection dbConnection;

    private Connection connection;

    private DbConnection() throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket", "savindu", "gsavindu");

    }

    public static DbConnection getInstance() throws ClassNotFoundException, SQLException{
        
        if(dbConnection == null){
            dbConnection = new DbConnection();
        }
        return dbConnection;
    }

    public Connection getConnection(){
        return connection;
    }

    
    
    
    
}
