package com.dynamicarray;

public class Array {
    private int[] items;
    private int[] newItems;
    private int count = 0;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (count == items.length) {
            newItems = new int[items.length * 2];
            for (int i=0; i<items.length; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }

        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            return;

        for (int i=index; i<count-1; i++) {
            items[i] = items[i+1];
        }
        count --;
    }

    public void print() {
        for (int i=0; i<count; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    public int indexOf(int item) {
        for (int i=0; i<count; i++) {
            if (items[i] == item)
                return i;
        }
        return -1;
    }
}