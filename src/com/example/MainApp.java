package com.example;

public class MainApp {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Insecure user input (potential SQL Injection in UserService)
        String username = "admin'; DROP TABLE users; --";
        String password = "password";

        // Exception handling is not ideal; should be more specific
        try {
            boolean isAuthenticated = userService.authenticate(username, password);
            if (isAuthenticated) {
                System.out.println("User authenticated successfully.");
            } else {
                System.out.println("Invalid credentials.");
            }
        } catch (Exception e) {
            System.err.println("An unexpected error occurred.");
        }
    }
}
