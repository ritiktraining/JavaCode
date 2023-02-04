package com.Arrays;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class SumOfUniqueElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 2, 4, 3, 2, 1};
        System.out.println(sum(arr));
    }

    static int sum(int[] arr) {
        int sum = 0;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],1);
        }

//        map.forEach((k,v)->{
//            sum.addAndGet(k);
//        });

        for(Integer i: map.keySet()){
            sum+=i;
        }

        return sum;
    }
}
