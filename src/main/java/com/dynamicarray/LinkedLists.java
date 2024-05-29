package com.dynamicarray;

public class LinkedLists {
    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int index = 0;

    public void addLast(int value) {
        Node node = new Node(value);

        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int value) {
        Node node = new Node(value);

        if (first == null) {
            first = node;
            last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public void deleteFirst() {
        if (first == null)
            return;

        if (first.next == null) {
            first = null;
            last = null;
        } else {
            Node second = first.next;
            first.next = null;
            first = second;
        }
    }

    public void deleteLast() {
        if (first == null)
            return;

        if (first.next == null) {
            first = null;
            last = null;
            return;
        }

        Node current = first;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        last = current;
    }

    public boolean contains(int value) {
        Node current = first;

        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
            index++;
        }
        index = -1;
        return false;
    }

    public int indexOf(int value) {
        this.contains(value);
        return index;
    }

    public void printLinkedLists() {
        Node current = first;
        while (current != null) {
            System.out.print(" " + current.value);
            current = current.next;
        }
        System.out.println();
    }
}
