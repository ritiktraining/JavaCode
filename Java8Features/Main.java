package com.Java8Features;

import com.MethodRefrences.Demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//        List.of(5,6,7,8,9,10).stream().filter(i-> i%2==0).map(n->Math.pow(n,2)).forEach(System.out::println);

        List<Integer> integers = Arrays.asList(1, 2, 3);
//        List<Integer> integers1 = List.of(1, 2, 3);

//        integers.stream();


        List<Integer> finalList = Stream.of(Arrays.asList(4, 5, 6, 10, 11), List.of(3, 8, 9), List.of(1, 2, 7)).flatMap(List::stream).sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
        Stream.of(Arrays.asList(4, 5, 6, 10, 11), List.of(3, 8, 9), List.of(1, 2, 7)).flatMap(List::stream).sorted(Integer::compareTo).forEach(System.out::println);

//        System.out.println(finalList);

        List.of("Ritik","Ankit","Shubham").stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
