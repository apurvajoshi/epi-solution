package com.ajoshi.epi.binaryTrees;

/**
 * Created by ajoshi on 8/21/15.
 */
public class CheckBalancedTree {
    public static boolean isBalanced(Tree t) {
        if(t == null)
            return true;

        System.out.println("Max depth = " + maxDepth(t));
        System.out.println("Min depth = " + minDepth(t));
        return  (maxDepth(t) - minDepth(t)) <= 1;
    }

    public static int maxDepth(Tree t) {
        if(t == null)
            return 0;
        return Math.max(maxDepth(t.left), maxDepth(t.right)) + 1;

    }

    public static int minDepth(Tree t) {
        if(t == null)
            return 0;
        return Math.min(minDepth(t.left), minDepth(t.right)) + 1;

    }
}
