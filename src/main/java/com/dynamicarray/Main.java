package com.dynamicarray;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array ");
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

        System.out.println("LinkedLists ");
        LinkedLists singleList = new LinkedLists();
        singleList.addLast(30);
        singleList.addLast(40);
        singleList.addLast(50);
        singleList.addFirst(15);
        singleList.addFirst(2);
        singleList.deleteFirst();
        singleList.deleteLast();
        System.out.println("  indexOf 40 " + singleList.indexOf(40));
        singleList.printLinkedLists();

        System.out.println("LinkedList examples");
        LinkedListExamples linkedList = new LinkedListExamples<>();
        linkedList.addLastNode(10);
        linkedList.addLastNode(20);
        linkedList.addLastNode(30);
        linkedList.addFirstNode(5);
        linkedList.printLinkedList();
    }
}