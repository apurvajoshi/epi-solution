package com.ajoshi.epi.linkedList;

/**
 * Created by ajoshi on 8/17/15.
 */
public class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }

    public void print() {
        LinkedListNode p = this;
        while(p != null) {
            System.out.print(p.data + " -> ");
            p = p.next;
        }
        System.out.println();
    }

}
