package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserService {

    // Vulnerable to SQL Injection (no parameterized queries)
    public boolean authenticate(String username, String password) {
        String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
             Statement stmt = conn.createStatement()) {
            stmt.executeQuery(query); // Potential SQL Injection risk
            return true;
        } catch (Exception e) {
            System.err.println("Error authenticating user.");
            return false;
        }
    }
}
