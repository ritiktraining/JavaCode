package com.practice;

public class StringChractersReverse {
    public static void main(String[] args) {

        String str="abcdef";
        reverseChracters(str);
    }

    static void reverseChracters(String str){

        char[] arr=str.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }

    }

}
