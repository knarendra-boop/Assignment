package org.example;

public class Calculator {

    public int add(int a, int b) {
        return a+b;
    }

    public int add(int a, int b, int c) {
        return  a+b+c;
    }

    public int sub(int a, int b) {
        return a-b;
    }
    public double sub(double a, double b) {
        System.out.println(a-b);
        return a-b;
    }
}

class CalcularApp {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(10,20));
        System.out.println(c.add(10,20,30));
        System.out.println(c.sub(10.24, 5.23));
    }
}