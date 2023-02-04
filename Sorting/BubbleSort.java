package com.Sorting;

import java.util.Arrays;


public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 1, 7, 2, 3};
        System.out.println(Arrays.toString(arr));


        sort(arr);


        System.out.println(Arrays.toString(arr));
    }

    // Bubble Sort
    static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    swap(arr, j + 1, j);
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }


}
