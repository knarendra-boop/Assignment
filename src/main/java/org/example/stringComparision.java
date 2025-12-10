package org.example;

public class stringComparision {
    public static void main(String[] args) {
        String s1 = "narendra";
        String s2 = "manish";
        if(s1==s2) {
            System.out.println("references are equal");
        }else {
            System.out.println("references are not equal");
        }
        if(s1.equals(s2)) {
            System.out.println("Values are equal");
        }else {
            System.out.println("values are not equal");
        }

        String str1 = "tom";
        String str2 = "tom";
        if(str1==str2) {
            System.out.println("references are equal");
        }else {
            System.out.println("references are not equal");
        }
        if(str1.equals(str2)) {
            System.out.println("Values are equal");
        }else {
            System.out.println("values are not equal");
        }
    }
}
