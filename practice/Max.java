package com.practice;

public class Max {
    public static void main(String[] args) {
        int[] arr = {5,33, 7, 36, 45, 6, 2, 1};

//        max(arr);

        System.out.println(max(arr));
        System.out.println(max(arr,0,3));
    }

    private static int max(int[] arr) {

        if(arr.length==0){
            return -1;
        }

        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }

        }


        return maxVal;
    }

    private static int max(int[] arr, int start, int end) {

        if(arr.length==0){
            return -1;
        }

        if(end<start){
            return -1;
        }

        int maxVal = Integer.MIN_VALUE;

        for (int i = start; i <= end; i++) {

            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }

        }


        return maxVal;
    }
}
