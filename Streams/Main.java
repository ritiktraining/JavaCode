package com.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = List.of(8, 5, 6, 2, 1, 3, 7, 4);

//        list.stream().sorted((x,y)->y.compareTo(x)).forEach(a-> System.out.println(a));

        List<String> names = List.of("hello", "champion", "boss", "great");

        int[] arr={4,5,6,7,2,3,4};

//        Stream.of(arr).sorted().collect(Collectors.toList());

//        Arrays.stream(arr).sorted().forEach(System.out::println);



        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();

        ArrayList<Integer> list1 = new ArrayList<>();


        // matchers
//        boolean allMatch = list.stream().allMatch(x -> x >=10);
//        boolean anyMatch= list.stream().anyMatch(x -> x %2==0);
//        System.out.println(allMatch);
//        System.out.println(anyMatch);

        // count and distinct
//        long count = list.stream().count();
//        System.out.println(count);
//
//        list.stream().distinct().forEach(x-> System.out.println(x));

        // find any and first
//        Optional<Integer> any = list.stream().findAny();
//        System.out.println(any.get());
//
//        Integer first = list.stream().findFirst().get();
//        System.out.println(first);

        // limit
//        List<Integer> collect = list.stream().limit(2).collect(Collectors.toList());
//        System.out.println(collect);

        // mapToDouble
//        list.stream().mapToDouble(x -> x*x).forEach(x-> System.out.println(x));

        //min
//        Integer min = list.stream().min((x, y) -> x.compareTo(y)).get();
//        System.out.println(min);

        

        //build
//        Stream<Object> build = Stream.builder().build();
//        build.forEach(i-> System.out.println(i));

//        Stream<Integer> integerStream = Stream.ofNullable(1);

        // Empty Stream
//        Stream<Object> empty = Stream.empty();
//        empty.forEach(i-> System.out.println(i));

        // Stream.of
        Stream<List<Integer>> listStream = Stream.of(list);
        listStream.forEach(i -> System.out.println(i));

        // Arrays.stream
//        IntStream stream = Arrays.stream(new int[]{4, 5, 6, 8, 9, 3, 1, 2});
//        stream.forEach(i-> System.out.println(i));

//        Arrays.stream(new String[]{"r", "d"}).forEach(s-> System.out.print(s + " "));

//        System.out.println();

        // Skip
//        list.stream().skip(5).forEach(i-> System.out.println(i));


        // sort and max
//        List<Integer> l1 = list.stream().sorted((x, y) -> x.compareTo(y)).collect(Collectors.toList());
//
//        System.out.println(l1);
//
//        Integer max = list.stream().max((x, y) -> x.compareTo(y)).get();
//        System.out.println(max);

        // Stream Iterating

//        Stream.iterate(1,element->element+1).filter(element->element % 2==0).limit(5).forEach(System.out::println);


    }
}
