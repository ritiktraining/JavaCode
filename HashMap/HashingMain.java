package com.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashingMain {
    public static void main(String[] args) {
        HashMap<String,Integer> map= new HashMap<>();

        map.put("India",130);
        map.put("China",160);
        map.put("USA",70);

        System.out.println(map);

        System.out.println(map.get("India"));

        System.out.println(map.containsKey("Hello"));

        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> set=map.keySet();

        for(String s:set){
            System.out.println(s);
        }

        map.remove("China");
        System.out.println(map);
    }
}
