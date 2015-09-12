package com.ajoshi.epi.linkedList;


import org.junit.Test;

public class EvenOddMergeTest {

    @Test
    public void testGetEvenOddMergeWithOddList() throws Exception {
        System.out.println("\n testGetEvenOddMergeWithOddList \n");
        LinkedListNode<Integer> L = new LinkedListNode<Integer>(0);
        L.next = new LinkedListNode<Integer>(1);
        L.next.next = new LinkedListNode<Integer>(2);
        LinkedListNode<Integer> F = new LinkedListNode<Integer>(3);
        F.next = new LinkedListNode<Integer>(4);
        F.next.next = new LinkedListNode<Integer>(5);
        F.next.next.next = new LinkedListNode<Integer>(6);
        L.next.next.next = F;
        L.print();

        L = EvenOddMerge.getEvenOddMerge(L);
        L.print();

    }

    @Test
    public void testGetEvenOddMergeWithEvenList() throws Exception {
        System.out.println("\n testGetEvenOddMergeWithEvenList \n");
        LinkedListNode<Integer> L = new LinkedListNode<Integer>(0);
        L.next = new LinkedListNode<Integer>(1);
        L.next.next = new LinkedListNode<Integer>(2);
        LinkedListNode<Integer> F = new LinkedListNode<Integer>(3);
        F.next = new LinkedListNode<Integer>(4);
        F.next.next = new LinkedListNode<Integer>(5);
        L.next.next.next = F;
        L.print();

        L = EvenOddMerge.getEvenOddMerge(L);
        L.print();

    }


    @Test
    public void testGetEvenOddMergeWithOneElement() throws Exception {
        System.out.println("\n testGetEvenOddMergeWithOneElement \n");
        LinkedListNode<Integer> L = new LinkedListNode<Integer>(0);
        L.print();
        L = EvenOddMerge.getEvenOddMerge(L);
        L.print();

    }

    @Test
    public void testGetEvenOddMergeWithTwoElement() throws Exception {
        System.out.println("\n testGetEvenOddMergeWithTwoElement \n");
        LinkedListNode<Integer> L = new LinkedListNode<Integer>(0);
        L.next = new LinkedListNode<Integer>(1);
        L.print();
        L = EvenOddMerge.getEvenOddMerge(L);
        L.print();

    }

    @Test
    public void testGetEvenOddMergeWithThreeElement() throws Exception {
        System.out.println("\n testGetEvenOddMergeWithThreeElement \n");
        LinkedListNode<Integer> L = new LinkedListNode<Integer>(0);
        L.next = new LinkedListNode<Integer>(1);
        L.next.next = new LinkedListNode<Integer>(2);
        L.print();
        L = EvenOddMerge.getEvenOddMerge(L);
        L.print();

    }
}