package org.example;

public class ReverseString {
    /*Question 1:
Write a function reverseString that takes a string as input and returns
the reversed string. Ensure that the reversed string maintains the
original length, with all characters except the first and last swapped.
Question 2:
When logging into a secure system, the system often hides the actual
password and shows asterisks or dots instead. Implement a function
maskPassword that takes a password as input and returns a masked version
of it, with all characters replaced by asterisks except for the last four
characters.*/
// Question 1: Reverse a string

    public static String reverseString(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            char temp = charArray[start];Mas
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
    public static void main(String[]args){

    }
}
