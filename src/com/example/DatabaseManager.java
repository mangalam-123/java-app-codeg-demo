package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseManager {

    // Potential resource leak: Connection is not closed
    public void executeQuery(String query) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
            Statement stmt = conn.createStatement();
            stmt.execute(query);
        } catch (Exception e) {
            System.err.println("Database query execution failed.");
        }
    }
}
