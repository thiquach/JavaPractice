package com.dynamicarray;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array examples");
        Array numbers = new Array(3);  // custom dynamic array
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.print();

        System.out.println("ArrayList examples");
        ArrayListExamples<Integer> integerList = new ArrayListExamples<>();
        integerList.addElement(11);
        integerList.addElement(22);
        integerList.addElement(33);
        integerList.printElements();
        System.out.println(integerList.getElement(1) + " at index 1");
    }
}