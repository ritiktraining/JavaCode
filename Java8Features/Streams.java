package com.Java8Features;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 7, 8, 9, 5, 2, 36, 4, 78, 222, 24, 9);

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("The sum is : " + sum);

        double average = list.stream().mapToDouble(a -> a).average().getAsDouble();
        System.out.println("The Average is : " + average);

        double finalAverage = list.stream().map(n -> n * n).filter(n -> n > 100).mapToDouble(n -> n).average().getAsDouble();
        System.out.println(finalAverage);


        list.stream().filter(n->n.toString().startsWith("2")).forEach(System.out::println);

        OptionalInt max = list.stream().mapToInt(a -> a).max();
        System.out.println(max.getAsInt());
        OptionalInt min = list.stream().mapToInt(a -> a).min();
        System.out.println(min.getAsInt());


        int sum1 = list.stream().skip(5).mapToInt(Integer::intValue).sum();
        System.out.println(sum1);

//        list.stream().distinct().forEach(System.out::print);

        // Find duplicate Elements

        List<Integer> integers = list.stream().map(i -> i).collect(Collectors.toList());
        Set<Integer> s=new HashSet<>();
        List<Integer> collect = integers.stream().filter(i -> !s.add(i)).collect(Collectors.toList());
//        Integer i = Integer.valueOf(s1);
        System.out.println(collect);
//        System.out.println(s);


//        list.stream().collect(Collectors.groupingBy();

        Set<Integer> collect1 = list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
        System.out.println(collect1);


        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<Integer> collect2 = map.entrySet().stream().filter(m -> m.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());

        System.out.println(collect2);



        list.stream().forEach(i-> {
            if(i%2==0) {
                System.out.println(i + " is divisble by 2");
            }
            if(i % 3==0)
                System.out.println(i + " is divisble by 3");
            if(i % 5==0)
                System.out.println(i + " is divisble by 5");
        });

    }
}
