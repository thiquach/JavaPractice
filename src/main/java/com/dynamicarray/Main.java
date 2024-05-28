package com.dynamicarray;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Build a custom dynamic array");
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.print();
        numbers.removeAt(1);
        System.out.println("Remove indexAt 1");
        numbers.print();
        System.out.println("IndexOf 30? " + numbers.indexOf(30));
        numbers.print();

        System.out.println("Java dynamic array - ArrayList");
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

    }
}