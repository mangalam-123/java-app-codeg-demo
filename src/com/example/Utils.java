package com.example;

public class Utils {

    // Inefficient palindrome check using StringBuilder
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());  // Less efficient approach
    }

    // Inefficient use of loops
    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);  // Inefficient string concatenation in loop
        }
        return result;
    }
}
