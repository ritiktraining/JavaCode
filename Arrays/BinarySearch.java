package com.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 9, 10, 12, 15, 18, 20};
        int target = 10;
        System.out.println(search(arr, target));

    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
