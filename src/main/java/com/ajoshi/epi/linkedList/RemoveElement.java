package com.ajoshi.epi.linkedList;

/**
 * Created by ajoshi on 8/20/15.
 */
public class RemoveElement {
    public static LinkedListNode removeKthLastElement(LinkedListNode l, int k) {
        LinkedListNode p1 = l;
        LinkedListNode p2 = l;

        if(k == 0)
            return l;

        while(p2 != null && k != 0) {
            p2 = p2.next;
            k--;
        }

        /**
         * Kth Last element couldnt be found.
         */
        if(k!=0)
            return l;

        /**
         * Removing head
         * */
        if(p2 == null && k==0)
            return l.next;

        while(p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        LinkedListNode deleteNode = p1.next;
        p1.next = p1.next.next;
        deleteNode.next = null;
        return l;
    }
}
