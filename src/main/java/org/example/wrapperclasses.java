package org.example;

import java.util.ArrayList;
import java.util.List;

public class wrapperclasses {
    public static void main(String[] args) {
        Integer num = 10;//auto boxing by java
        int n = num; // unboxing integer to primitive we need to covert manually

// wrappers in collection
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        System.out.print(li.get(0));
    }
}
