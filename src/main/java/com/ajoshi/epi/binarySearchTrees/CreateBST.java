package com.ajoshi.epi.binarySearchTrees;

import com.ajoshi.epi.binaryTrees.Tree;

/**
 * Created by ajoshi on 10/11/15.
 */
public class CreateBST {

    public static Tree<Integer> createBSTFromPreOrderSequence(int[] a, int low, int high ) {
        if(low > high)
            return null;
        // First element will be the root element.
        Tree<Integer> root = new Tree<Integer>();
        root.data = a[low];
        int i = low+1;
        // Find the last element less than root
        while(i <= high && a[i] < a[low])
            i++;
        root.left = createBSTFromPreOrderSequence(a, low+1, i-1);
        root.right = createBSTFromPreOrderSequence(a, i, high);
        return root;

    }

    /**
     *
     * Returns a BST with a minimum height that can be generated
     * out of sorted array
     *
     * @param a - Sorted array
     * @param low - low index in the array
     * @param high - high index in the array
     * @return Binary Search Tree with min height
     */
    public static Tree<Integer> createBSTWithMinHeight(int[] a, int low, int high) {
        if(low > high)
            return null;

        int middle = (low + high)/2;
        Tree<Integer> root = new Tree<Integer>(a[middle]);
        root.left = createBSTWithMinHeight(a, low, middle - 1);
        root.right = createBSTWithMinHeight(a, middle + 1, high);
        return root;
    }
}
