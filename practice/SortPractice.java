package com.practice;

import java.util.Arrays;

public class SortPractice {

    public static void main(String[] args) {
        int[] arr = {7, 8, 4, 5, 2, 1, 3, 6};
        System.out.println("Before Sorting : " + Arrays.toString(arr));

//        selectionSort(arr);
        bubbleSort(arr);

        System.out.println("After Sorting : " + Arrays.toString(arr));
    }

    // Bubble Sort
    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    isSwapped = true;

                }
            }

            if (!isSwapped) {
                break;
            }
        }
    }


    // Selection Sort
    private static void selectionSort(int[] arr) {

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

    // Swap Function
    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
