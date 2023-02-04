package com.practice;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "naman";

        StringBuilder s = new StringBuilder(str);
        StringBuilder reverse = s.reverse();
        String s1 = reverse.toString();

        if (s1.equals(str)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
