package com.ajoshi.epi.linkedList;


import org.junit.Assert;
import org.junit.Test;

public class DetectCycleTest {

    @Test
    public void testFindCycleInList() throws Exception {
        LinkedListNode<Integer> head = new LinkedListNode<Integer>(2);
        head.next = new LinkedListNode<Integer>(4);
        LinkedListNode<Integer> p = new LinkedListNode<Integer>(6);
        head.next.next = p;
        p.next = new LinkedListNode<Integer>(8);
        p.next.next = new LinkedListNode<Integer>(10);
        p.next.next.next = new LinkedListNode<Integer>(12);
        p.next.next.next.next = p;

        LinkedListNode point = DetectCycle.findCycleInList(head);
        Assert.assertEquals(point.data, p.data);
    }

    @Test
    public void testFindCycleInListWithNull() throws Exception {
        Assert.assertEquals(DetectCycle.findCycleInList(new LinkedListNode(2)), null);
        LinkedListNode head = null;
        Assert.assertEquals(DetectCycle.findCycleInList(head), null);
    }
}