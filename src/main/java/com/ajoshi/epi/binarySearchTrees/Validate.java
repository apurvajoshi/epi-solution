package com.ajoshi.epi.binarySearchTrees;

import com.ajoshi.epi.binaryTrees.Tree;

/**
 * Created by ajoshi on 10/1/15.
 */
public class Validate {

    /**
     * Uninstantiable class
     */
    private Validate() {
        throw new AssertionError();
    }

    public static boolean validateBST(Tree<Integer> n) {
        return validateHelper(Integer.MIN_VALUE, n, Integer.MAX_VALUE);
    }

    private static boolean validateHelper(int minValue, Tree<Integer> n, int maxValue) {
        if(n == null)
            return true;

        if(n.data < minValue || n.data > maxValue )
            return false;

        return validateHelper(minValue, n.left, n.data) && validateHelper(n.data, n.right, maxValue);
    }
}
