package com.dynamicarray;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExamples <T> {
    private LinkedList<T> linkedList;

    public LinkedListExamples() {
        this.linkedList = new LinkedList<>();
    }

    public void addFirstNode(T node) {
        this.linkedList.addFirst(node);
    }

    public void addLastNode(T node) {
        this.linkedList.addLast(node);
    }

    public void printLinkedList() {
        Iterator<T> it = this.linkedList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}