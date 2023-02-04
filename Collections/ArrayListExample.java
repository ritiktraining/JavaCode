package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        Employee e1 = new Employee(1, "Ritik", "SDE");
        Employee e2 = new Employee(3, "Ankit", "QA");
        Employee e3 = new Employee(2, "Sanjay", "JFS");

        list.add(e1);
        list.add(e2);
        list.add(e3);

        Iterator<Employee> itr = list.iterator();

        while(itr.hasNext()){
            Employee e = itr.next();
            System.out.println(e.getId() + " " + e.getName() + " " + e.getDepartment());
        }
    }
}
