package com.company;

//private, protected, public
//final, abstract, transient, sync, volatile

/*
    final - cannot be modified
    static - belong to a class, not to an object
    abstract - inherited classes only

 */

public class Constructors {
    int x, y;
    double z;
    final int a = 3;
    final double PI = 3.14;

    public Constructors() {
        x = 1;
        y = 2;
    }


    public Constructors(double z) {
        this.z = z;
    }

    public static void main(String[] args) {
        Constructors constructors = new Constructors();
//        Constructors constructors1 = new Constructors(3.14);
//        System.out.println(constructors.x + " " + constructors.y);
//        System.out.println(constructors1.z);
//        constructors.a = 4;
//        constructors.PI = 3.15;
//        AbstractClasses abs = new AbstractClasses();
//        System.out.println("Name: " + abs.name);
//        System.out.println("Age:" + abs.age);
//        System.out.println("Graduation Year: " + abs.graduationYear);
//        abs.study();
        Person person = new Person();
        person.setName("Luca");
        System.out.println(person.getName());

    }
}
