package com.ajoshi.epi.linkedList;

/**
 * Created by ajoshi on 8/19/15.
 */
public class ReverseList {
    public static LinkedListNode reverseLinkedList(LinkedListNode l) {
        LinkedListNode prev = null;
        LinkedListNode curr = l;
        while(curr != null ) {
            LinkedListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static LinkedListNode reverseLinkedListRecursively(LinkedListNode l) {
        if(l==null)
            return null;
        if(l.next == null)
            return l;

        LinkedListNode p = reverseLinkedListRecursively(l.next);
        l.next.next = l;
        l.next= null;
        return p;
    }
}
