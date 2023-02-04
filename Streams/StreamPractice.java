package com.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {

        ArrayList<Object> objectsList = new ArrayList<>();
//        ArrayList<Object> list = List.of("ABC",5,7.0d,"Ritik");

        objectsList.add("ABC");
        objectsList.add(6);
        objectsList.add(6);
        objectsList.add(4.55);
        objectsList.add(true);
        objectsList.add('A');

        List<String> names = List.of("Ritik", "Ankit", "Shubham", "Jc", "Raman");

        List<Integer> numbers = List.of(5, 6, 8, 9, 10, 12, 15);

//        System.out.println(objectsList);

//        names.stream().filter()

        Optional<Object> a = objectsList.stream().filter(i -> i.toString().startsWith("B")).findAny();

//        System.out.println(a.get());

        boolean allMatch = objectsList.stream().allMatch(i -> i.toString().startsWith("A"));
//        System.out.println(allMatch);

//        objectsList.stream().skip(6);
//        System.out.println(objectsList);

//        objectsList.stream().distinct().forEach(System.out::println);

//        objectsList.stream().mapToDouble(x->x.toString()).collect(Collectors.toList());

        Stream<List<Integer>> listStream = Stream.of(numbers);

//        listStream.forEach(System.out::println);

//        Stream<String> sorted = names.stream().sorted();
//        sorted.forEach(System.out::println);

        List<String> strings = names.stream().sorted((x, y) -> x.compareTo(y)).collect(Collectors.toList());
//        System.out.println(strings);

        String s = names.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(s);

    }
}
