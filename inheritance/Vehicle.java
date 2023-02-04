package com.inheritance;

public class Vehicle extends Car{

     int tyres=super.tyres;

    void tyre(){
        super.tyre();
        System.out.println(tyres);
    }





    public static void main(String[] args) {
         Vehicle vehicle=new Vehicle();
        System.out.println(vehicle.tyres);
    }

}
