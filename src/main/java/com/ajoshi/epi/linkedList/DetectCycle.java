package com.ajoshi.epi.linkedList;

/**
 * Created by ajoshi on 8/18/15.
 */
public class DetectCycle {

    public static LinkedListNode findCycleInList(LinkedListNode head) {
        if(head == null)
            return null;

        LinkedListNode p1 = head;
        LinkedListNode p2 = head;

        while(true) {
            if(p1 != null)
                p1 = p1.next;
            else
                return null;

            if(p2.next != null)
                p2 = p2.next.next;
            else
                return null;

            if(p1 == p2)
                break;
        }

        if(p1 == null || p2 == null)
            return null;

        p1 = head;

        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
