package com.company;

class Animal {
    public void sound() {
        System.out.println("Scot sunete....");
    }
}

class Pig extends Animal {
    public void sound() {
        System.out.println("oink oink...");
    }
}

class Dog extends Animal{
    public void sound() {
        System.out.println("ham ham....");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal(); //Animal object
        Animal Pig = new Pig(); //Pig object
        Animal Dog = new Dog(); //Dog object

        animal.sound();
        Pig.sound();
        Dog.sound();
    }
}
