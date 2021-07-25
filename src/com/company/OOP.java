package com.company;

/*
    Fruit - Apple, banana, mango
    Car  - Tesla, Audi, Volvo
    DRY
 */


import com.sun.org.apache.bcel.internal.generic.MethodObserver;

public class OOP {
    int x = 5;
    int y = 3;

    public void MetodaI() {
        System.out.println("Am apelat functia cu succes");
    }
    public static void MetodaII() {
        System.out.println("Am apelat functia MetodaII cu succes");
    }

    public static void main(String[] args) {
        OOP oop = new OOP();

        System.out.println("X:" + oop.x);
        System.out.println("Y:" + oop.y);

        oop.x = 10;
        oop.y = 6;

        System.out.println("X:" + oop.x);
        System.out.println("Y:" + oop.y);

        oop.MetodaI();
        MetodaII();
    }
}
