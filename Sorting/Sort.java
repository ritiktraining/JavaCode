package com.Sorting;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 7, 2, 3};
//        System.out.println(arr.length);

//        selectionSort(arr);
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    // Selection Sort
    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            swap(arr, min, i);
        }

    }


    // bubble sort
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
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
