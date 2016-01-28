package com.ajoshi.epi.practice;

import java.util.ArrayList;


/**
 *
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 *
 */

public class KthSmallest {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int kthSmallest(TreeNode root, int k) {
        int[] a = convertIntoArray(root);
        return findKthSmallest(a, k, 0, a.length-1);
    }

    public int[] convertIntoArray(TreeNode root) {
        ArrayList<Integer> valueList = new ArrayList<Integer>();
        inorderTraversal(root, valueList);
        int[] values = new int[valueList.size()];
        for(int i = 0; i < valueList.size(); i++)
            values[i] = valueList.get(i);
        return values;
    }

    public void inorderTraversal(TreeNode root, ArrayList<Integer> values) {
        if(root != null) {
            inorderTraversal(root.left, values);
            values.add(root.val);
            inorderTraversal(root.right, values);
        }
    }

    public int findKthSmallest(int[] a, int k, int low, int high) {
        if(k <=0 || k > a.length)
            return 0;

        int pIndex = partition(a, low, high);

        if(pIndex == k-1)
            return a[pIndex];
        else if (pIndex > k-1)
            return findKthSmallest(a, k, low, pIndex-1);
        else
            return findKthSmallest(a, k, pIndex+1, high);
    }

    public int partition(int[] a, int low, int high) {
        int firstHigh = low + 1;

        for(int i = low+1; i <= high; i++) {
            if(a[low] > a[i]) {
                swap(a, i, firstHigh);
                firstHigh++;
            }
        }

        swap(a, low, firstHigh-1);
        return firstHigh - 1;
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }



}