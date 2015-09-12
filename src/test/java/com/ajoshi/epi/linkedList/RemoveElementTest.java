package com.ajoshi.epi.linkedList;
import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {

    @Test
    public void testRemoveKthLastElement() throws Exception {
        System.out.println("\n testRemoveKthLastElement \n");
        LinkedListNode L = new LinkedListNode<Integer>(1);
        L.next = new LinkedListNode<Integer>(2);
        L.next.next = new LinkedListNode<Integer>(3);
        LinkedListNode F = new LinkedListNode<Integer>(4);
        F.next = new LinkedListNode<Integer>(5);
        F.next.next = new LinkedListNode<Integer>(6);
        F.next.next.next = new LinkedListNode<Integer>(7);
        L.next.next.next = F;
        L.print();
        L = RemoveElement.removeKthLastElement(L, 6);
        L.print();

    }

    @Test
    public void testRemoveKthLastElementWithNull() throws Exception {
        System.out.println("\n testRemoveKthLastElementWithNull \n");
        LinkedListNode L = null;
        Assert.assertEquals(RemoveElement.removeKthLastElement(L, 0), null);
    }
}