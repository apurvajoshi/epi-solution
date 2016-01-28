package com.ajoshi.epi.practice;

/**
 * Created by ajoshi on 11/9/15.
 */
public class RemoveDuplicate {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode deleteDuplicates(ListNode list) {
        ListNode head = list;

        if(list == null)
            return head;

        ListNode ptr1 = head;
        ListNode ptr2= head.next;

        while(ptr2 != null) {
            if(ptr2.val != ptr1.val) {
                ptr1.next = ptr2;
                ptr1 = ptr2;
            }
            ptr2 = ptr2.next;
        }
        ptr1.next = null;
        return head;
    }

    public static void print(ListNode list) {
        while(list != null) {
            System.out.print(list.val + " -> ");
            list = list.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(4);
        list.next.next = new ListNode(2);
        list.next.next.next = new ListNode(2);
        list.next.next.next.next = new ListNode(2);
        list.next.next.next.next.next = new ListNode(3);

        print(list);
        print(deleteDuplicates(list));

    }

}
