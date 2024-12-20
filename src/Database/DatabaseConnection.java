/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.*;

/**
 *
 * @author armed
 */
public class DatabaseConnection {
    static final String URL ="jdbc:mysql://localhost:3306/dbchefeasy";
    static final String USER ="root";
    static final String PASSWORD ="";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
