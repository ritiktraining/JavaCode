package com.Optional;

import java.util.Optional;

public class Main {


    public static void main(String[] args) {

        String name = "RITIK";

        // Empty Optional Object
        Optional<Object> empty = Optional.empty();
//        System.out.println(empty);

        // Optional witn non-null value
        Optional<Integer> integer = Optional.of(5);
//        System.out.println(integer);

        Optional<Integer> i = Optional.ofNullable(10);
//        System.out.println(i.isPresent());


        // if present()
//        i.ifPresent(x-> System.out.println(x));

        // filter()
        Integer integer1 = i.filter(x -> x % 2 == 0).get();
//        System.out.println(integer1);

        // map() function
        Integer i2 = i.map(x -> x * x).get();
//        System.out.println(i2);

        // Optional.of Nullable
        Optional<String> str = Optional.ofNullable(name);

//        str.ifPresent(System.out::println);
//        System.out.println(str.get());
//        System.out.println(name.toLowerCase());

//        Optional<Object> empty1 = Optional.empty();
//        System.out.println(empty1);

        // filter
        Optional<String> str1 = Optional.of(name);

//        String str3 = str1.filter(s -> s.equals("RITIK")).get();
//        System.out.println(str3);
//        System.out.println(str1.filter(s -> s.equals("RITIK")));

//        System.out.println(str1.orElse("Not present"));
//        System.out.println(empty.orElse("Not Avialable"));


        // hashcode
        System.out.println(str1.hashCode());
        System.out.println(empty.hashCode());

        // ifpresent()
//        empty.ifPresent(System.out::println);
//        str1.ifPresent(System.out::println);


    }
}
