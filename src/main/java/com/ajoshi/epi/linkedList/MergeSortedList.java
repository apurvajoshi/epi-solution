package com.ajoshi.epi.linkedList;

/**
 * Created by ajoshi on 8/17/15.
 */
public class MergeSortedList {

    public static LinkedListNode<Integer> merge(LinkedListNode<Integer> L, LinkedListNode<Integer> F) {
        LinkedListNode result = null;

        if(L == null)
            return F;
        if(F == null)
            return L;

        if(L.data <= F.data) {
            result = L;
            L = L.next;
        }
        else {
            result = F;
            F = F.next;
        }

        result.next = merge(L,F);
        return result;

    }
}
