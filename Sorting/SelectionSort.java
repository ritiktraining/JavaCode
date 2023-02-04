package com.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 7, 2, 3};

        System.out.println(Arrays.toString(arr));


        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
//                    swap(arr, i, j);
                    min=j;
                }
            }
            swap(arr,min,i);
        }

    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
