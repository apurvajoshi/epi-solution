package com.ajoshi.epi.practice;

/**
 * Created by ajoshi on 11/3/15.
 *
 *
 */

public class MergeTwoList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;

        if(l2 == null)
            return l1;

        ListNode mergeListPtr = null;
        ListNode mergeListHead = l1.val < l2.val ? l1 : l2;

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                if(mergeListPtr == null)
                    mergeListPtr = l1;
                else {
                    mergeListPtr.next = l1;
                    mergeListPtr = mergeListPtr.next;
                }
                l1 = l1.next;
            } else {
                if(mergeListPtr == null)
                    mergeListPtr = l2;
                else {
                    mergeListPtr.next = l2;
                    mergeListPtr = mergeListPtr.next;
                }
                l2 = l2.next;
            }
        }

        while(l1 != null) {
            mergeListPtr.next = l1;
            l1 = l1.next;
            mergeListPtr = mergeListPtr.next;
        }

        while(l2 != null) {
            mergeListPtr.next = l2;
            l2 = l2.next;
            mergeListPtr = mergeListPtr.next;
        }

        return mergeListHead;
    }

    public static void main(String args[]) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(5);
        l1.next.next = new ListNode(9);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(6);
        l2.next.next.next = new ListNode(8);

        ListNode result = mergeTwoLists(l1, l2);
        while(result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }

    }
}
