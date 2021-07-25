package com.company;

import java.util.Scanner;

public class Functions {
    int x = 5;

    public static void main(String[] args) {
        //declarari si inializari
        int a = 0, b = 0;
        Functions functions = new Functions();
        System.out.println(functions.x);
        Scanner sc = new Scanner(System.in);

        //citim primul numar
        System.out.println("Primul numar:");
        a = sc.nextInt();

        //citim al doilea numar
        System.out.println("Al doilea numar:");
        b = sc.nextInt();

        System.out.println("Suma numerelor: " + a + " si " + b + " este:" + addition(a, b));
        System.out.println("Diferenta numerelor: " + a + " si " + b + " este:" + difference(a, b));
        System.out.println("Produsul numerelor: " + a + " si " + b + " este:" + multiplication(a, b));
        System.out.println("Impartirea numerelor: " + a + " si " + b + " este:" + divide(a, b));
    }

    public static int addition(int x, int y) { return x + y; }
    public static int difference(int x, int y) { return x - y; }
    public static int multiplication(int x, int y) { return x * y; }
    public static int divide(int x, int y) { return x / y; }
}

