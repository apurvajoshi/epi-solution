package com.ajoshi.epi.linkedList;

/**
 * Created by ajoshi on 8/19/15.
 */
public class EvenOddMerge {

    public static LinkedListNode getEvenOddMerge(LinkedListNode head) {

        if(head == null)
            return null;

        LinkedListNode even = head;
        LinkedListNode odd = head.next;

        LinkedListNode p1 = even;
        LinkedListNode p2 = odd;
        LinkedListNode evenEnd = even;

        while(p1 != null && p2 != null) {
            evenEnd = p1;
            p1.next = p2.next;
            p1 = p1.next;
            if(p1 != null) {
                p2.next = p1.next;
                p2 = p2.next;
            }
        }

        if(p1 == null)
            evenEnd.next = odd;
        else
            p1.next = odd;
        return head;
    }
}
