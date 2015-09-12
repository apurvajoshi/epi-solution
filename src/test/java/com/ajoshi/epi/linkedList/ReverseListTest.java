package com.ajoshi.epi.linkedList;


import org.junit.Assert;
import org.junit.Test;

public class ReverseListTest{

    @Test
    public void testReverseLinkedList() throws Exception {
        System.out.println("\n testReverseLinkedList \n");
        LinkedListNode<Integer> L = new LinkedListNode<Integer>(0);
        L.next = new LinkedListNode<Integer>(1);
        L.next.next = new LinkedListNode<Integer>(2);
        LinkedListNode<Integer> F = new LinkedListNode<Integer>(3);
        F.next = new LinkedListNode<Integer>(4);
        F.next.next = new LinkedListNode<Integer>(5);
        F.next.next.next = new LinkedListNode<Integer>(6);
        L.next.next.next = F;
        L.print();
        L = ReverseList.reverseLinkedList(L);
        L.print();
    }

    @Test
    public void testReverseLinkedListWithNull() throws Exception {
        System.out.println("\n testReverseLinkedListWithNull \n");
        LinkedListNode<Integer> L = null;
        Assert.assertEquals(ReverseList.reverseLinkedList(L), L);
    }

    @Test
    public void testReverseLinkedListWithOneLink() throws Exception {
        System.out.println("\n testReverseLinkedListWithOneLink \n");
        LinkedListNode<Integer> L = new LinkedListNode<Integer>(0);
        Assert.assertEquals(ReverseList.reverseLinkedList(L), L);
    }

    @Test
    public void testReverseLinkedListRecursively() throws Exception {
        System.out.println("\n testReverseLinkedListRecursively \n");
        LinkedListNode<Integer> L = new LinkedListNode<Integer>(0);
        L.next = new LinkedListNode<Integer>(1);
        L.next.next = new LinkedListNode<Integer>(2);
        LinkedListNode<Integer> F = new LinkedListNode<Integer>(3);
        F.next = new LinkedListNode<Integer>(4);
        F.next.next = new LinkedListNode<Integer>(5);
        F.next.next.next = new LinkedListNode<Integer>(6);
        L.next.next.next = F;
        L.print();
        L = ReverseList.reverseLinkedListRecursively(L);
        L.print();
    }

    @Test
    public void testReverseLinkedListRecursivelyWithNull() throws Exception {
        System.out.println("\n testReverseLinkedListRecursivelyWithNull \n");
        LinkedListNode<Integer> L = null;
        Assert.assertEquals(ReverseList.reverseLinkedListRecursively(L), L);
    }

    @Test
    public void testReverseLinkedListRecursivelyWithOneLink() throws Exception {
        System.out.println("\n testReverseLinkedListRecursivelyWithOneLink \n");
        LinkedListNode<Integer> L = new LinkedListNode<Integer>(0);
        Assert.assertEquals(ReverseList.reverseLinkedListRecursively(L), L);
    }
}