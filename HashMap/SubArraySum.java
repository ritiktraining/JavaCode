package com.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubArraySum {

    public static void main(String[] args) {
        int[] arr = {10, 15, -5, 15, -10, 5};
        int sum = 5;
        subArray(arr, sum);
    }

    static void subArray(int[] arr, int sum) {

        int start = 0;
        int cur = 0;
        int end = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            cur += arr[i];

            if (cur - sum == 0) {
                start = 0;
                end = i;
                break;
            }

            if (map.containsKey(cur - sum)) {

                start = map.get(cur - sum) + 1;
                end = i;
                break;
            }

            map.put(cur, i);
        }

        if (end == -1) {
            System.out.println("Not found");
        } else {
            int[] ans = new int[2];
            ans[0] = start;
            ans[1] = end;
            System.out.println(Arrays.toString(ans));
//            System.out.println(start + " " + end);
        }

    }
}
