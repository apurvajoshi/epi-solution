package com.ajoshi.epi.stackAndQueue;

/**
 *
 * Stack Implementation using Linked list.
 * Stack supports max API.
 *
 * Created by ajoshi on 11/2/15.
 */
public class Stack<T extends Comparable> {

    private class LinkedList {
        T value;
        LinkedList next;

        LinkedList(T value) {
            this.value = value;
            this.next = null;
        }
    }

    private LinkedList head = null;

    private java.util.Stack<T> max = null;

    public Stack() {
        max = new java.util.Stack<T>();
    }

    public void push(T element) {
        LinkedList node = new LinkedList(element);
        node.next = head;
        head = node;

        // Update max
        if(!max.isEmpty() && max.peek().compareTo(element) > 0)
            max.push(max.peek());
        else
            max.push(element);
    }

    public T pop() {
        if(isEmpty())
            return null;

        T value = head.value;
        head = head.next;
        max.pop();
        return value;
    }

    public T peek() {
        if(isEmpty())
            return null;
        return head.value;
    }

    public boolean isEmpty() {
        if(head == null)
            return true;
        return false;
    }

    public T max() {
        if(isEmpty())
            return null;
        return max.peek();
    }

    public void print() {
        LinkedList ptr = head;
        while (ptr != null) {
            System.out.print(ptr.value + " -> ");
            ptr = ptr.next;
        }

        System.out.println();
    }
}
