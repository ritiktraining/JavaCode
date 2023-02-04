package com.practice;

public class StringLength {

    public static void main(String[] args) {
        String str = "india is a great country";
//        System.out.println(str.substring(1));
        int length = lengthOfString(str);
        System.out.println(length);

    }

    static int lengthOfString(String str) {

        if (str.equals("")) {
            return 0;
        } else {
            return 1 + lengthOfString(str.substring(1));
        }
    }
}
