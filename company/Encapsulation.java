package com.company;

public class Encapsulation {
    public static void main(String[] args) {
        Encap e=new Encap();
        e.setName("Ritik");
        e.setRollNo(1);
        e.setAge(22);

        System.out.println("Name is : "+ e.getName());
        System.out.println("Roll no. is : "+e.getRollNo());
        System.out.println("Age is : "+e.getAge());

    }
}

class Encap {
    private String name;
    private int rollNo;
    private int age;

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public void setRollNo(int rollNo) {
        this.rollNo=rollNo;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


