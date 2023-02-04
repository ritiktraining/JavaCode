package com.Arrays;

public class MaximumSumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {5, -10, 15, 10, -20, -30, 5};
        System.out.println(sum(arr));
    }

    static int sum(int[] arr) {

        int curr = 0;
        int max = Integer.MIN_VALUE;

        for (int val : arr) {
            curr += val;

            if (curr > max) {
                max = curr;
            }

            if (curr < 0) {
                curr = 0;
            }
        }

        return max;
    }
}
