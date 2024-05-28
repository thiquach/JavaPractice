package com.dynamicarray;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExamples<T> {
    private ArrayList<T> list;

    public ArrayListExamples() {
        this.list = new ArrayList<>();
    }

    public void addElement(T element) {
        list.add(element);
    }

    public T getElement(int index) {
        return list.get(index);
    }

    public void printElements() {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
