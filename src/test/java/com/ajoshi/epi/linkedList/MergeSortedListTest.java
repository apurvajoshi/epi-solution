package com.ajoshi.epi.linkedList;
import org.junit.Test;

public class MergeSortedListTest {

    @Test
    public void testMerge() throws Exception {
        LinkedListNode<Integer> L = new LinkedListNode<Integer>(2);
        L.next = new LinkedListNode<Integer>(5);
        L.next.next = new LinkedListNode<Integer>(7);
        L.print();

        LinkedListNode<Integer> F = new LinkedListNode<Integer>(3);
        F.next = new LinkedListNode<Integer>(11);
        F.print();

        LinkedListNode p = MergeSortedList.merge(L, F);
        p.print();

    }

    @Test
    public void testMergeWithNull() throws Exception {
        LinkedListNode<Integer> L = new LinkedListNode<Integer>(2);
        L.next = new LinkedListNode<Integer>(5);
        L.next.next = new LinkedListNode<Integer>(7);
        L.print();
        LinkedListNode<Integer> F = null;
        LinkedListNode p = MergeSortedList.merge(L, F);
        p.print();

        LinkedListNode<Integer> L1 = null;

        LinkedListNode<Integer> F1 = new LinkedListNode<Integer>(3);
        F1.next = new LinkedListNode<Integer>(11);
        F1.print();

        p = MergeSortedList.merge(L1, F1);
        p.print();

    }

    @Test
    public void testMergeWithBiggerList() throws Exception {
        LinkedListNode<Integer> L = new LinkedListNode<Integer>(2);
        L.next = new LinkedListNode<Integer>(5);
        L.next.next = new LinkedListNode<Integer>(7);
        LinkedListNode<Integer> F = new LinkedListNode<Integer>(10);
        F.next = new LinkedListNode<Integer>(15);
        F.next.next = new LinkedListNode<Integer>(18);
        L.next.next.next = F;
        L.print();


        LinkedListNode<Integer> L1 = new LinkedListNode<Integer>(6);
        L1.next = new LinkedListNode<Integer>(8);
        L1.next.next = new LinkedListNode<Integer>(9);
        LinkedListNode<Integer> F1 = new LinkedListNode<Integer>(12);
        F1.next = new LinkedListNode<Integer>(16);
        F1.next.next = new LinkedListNode<Integer>(40);
        L1.next.next.next = F1;
        L1.print();

        LinkedListNode p = MergeSortedList.merge(L, L1);
        p.print();

    }

    @Test
    public void testMergeWithDuplicates() throws Exception {
        System.out.println("Test with duplicates");
        LinkedListNode<Integer> L = new LinkedListNode<Integer>(2);
        L.next = new LinkedListNode<Integer>(5);
        L.next.next = new LinkedListNode<Integer>(7);
        L.print();

        LinkedListNode<Integer> F = new LinkedListNode<Integer>(2);
        F.next = new LinkedListNode<Integer>(5);
        F.next.next = new LinkedListNode<Integer>(7);
        F.print();

        LinkedListNode p = MergeSortedList.merge(L, F);
        p.print();
    }
}