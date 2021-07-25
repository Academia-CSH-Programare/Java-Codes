package com.company;

//sublclass - cea care primeste
//superclass(parent) - cea care da atribute, metode

public class Vehicle {
    protected String brand = "Tesla";
    public void drive() {
        System.out.println("Driving...");
    }
}

class Car extends Vehicle {
    private String modelName = "Model X";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}


