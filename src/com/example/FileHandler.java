package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

    // Hardcoded file path (vulnerable to path traversal)
    public void readFile() {
        String filePath = "/etc/passwd";  // Arbitrary file, insecure
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
