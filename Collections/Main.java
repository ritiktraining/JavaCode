package com.Collections;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException  {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(2, "Ritik");
        hm.put(3, "Ankit");
        hm.put(1, "Sanjay");


        // for getting values
//        for(String i : hm.values()){
//            System.out.println(i);
//        }

        // for getting MapSet
//        for(Map.Entry m : hm.entrySet()){
//            System.out.println(m.getKey() + " " + m.getValue());
//        }

        Employee e1 = new Employee(1, "Ritik", "SDE");
        Employee e2 = new Employee(3, "Ankit", "QA");
        Employee e3 = new Employee(2, "Sanjay", "JFS");
        Employee e4 = new Employee(5, "Ritik", "JFS");
        Employee e5 = new Employee(4, "Sanjay", "SDE");


        HashMap<Integer, Employee> map = new HashMap<>();
        map.put(1, e1);
        map.put(3, e2);
        map.put(2, e3);

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

//        employeeList.stream().filter(e -> e.getId() == 1).map(employee ->{
//            employee.getId();
//            return employee;
//        }).forEach(System.out::println);
//        System.out.println(employees);

//        for(Employee e : map.values()){
//            System.out.println(e);
//        }

//        map.remove(3);
//        map.putIfAbsent(2,e2);
//        map.clear();
//        System.out.println(map.isEmpty());

        // return shallow copy
//        Object clone = map.clone();
//        System.out.println(clone);

//        for (Map.Entry<Integer, Employee> m : map.entrySet()) {
//            Employee e = m.getValue();
//            System.out.println(m.getKey() + " Details");
//            System.out.println(e.getId() + " " + e.getName() + " " + e.getDepartment());
//        }


//        Employee e = new Employee();
//        Employee clone = (Employee) e1.clone();
//        System.out.println(e1.getId());
//        clone.setId(5);
//        System.out.println(clone.getId());
//        System.out.println(e1.getId());

        Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        Map<String, Set<Employee>> collect2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getName,TreeMap::new, Collectors.toSet()));
        System.out.println(collect);
        System.out.println(collect2);

    }
}
