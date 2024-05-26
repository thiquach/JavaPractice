package com.dynamicarray;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.print();
        numbers.removeAt(1);
        System.out.println("indexOf " + numbers.indexOf(20));
        numbers.print();
        System.out.println("hello");
    }
}