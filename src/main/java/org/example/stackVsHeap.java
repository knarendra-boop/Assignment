package org.example;

public class stackVsHeap {

    public static void main(String[] args) {
        int x = 10;
        Animal a1 = new Animal("cat");
        Animal a2  = new Animal("dog");
        a2 = null;
        System.out.println(a1.name);
      //  System.out.println(a2.name);


    }
}
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}
