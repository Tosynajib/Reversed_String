package org.example;

public class MaskPassword {

    // Question 2: Mask the password
    public static String maskPassword(String password) {
        if (password == null || password.length() <= 4) {
            return password;
        }
        char[] charArray = password.toCharArray();
        for (int i = 0; i < password.length() - 4; i++) {
            charArray[i] = '*';
        }
        return new String(charArray);
    }
    public static void main(String[] args) {
        // Example usage for Question 1
        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);
        System.out.println("Reversed String: " + reversedString);
        // Example usage for Question 2
        String originalPassword = "secretpassword123";
        String maskedPassword = maskPassword(originalPassword);
        System.out.println("Masked Password: " + maskedPassword);
    }
}



