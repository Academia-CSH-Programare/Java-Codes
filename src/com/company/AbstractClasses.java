package com.company;

abstract class Main {
    public String name = "Luca";
    public int age = 16;
    public abstract void study();
}

public class AbstractClasses extends Main {
    public int graduationYear = 2022;
    public void study() {
        System.out.println("Studying...");
    }
}
