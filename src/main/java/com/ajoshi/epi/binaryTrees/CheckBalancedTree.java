package com.ajoshi.epi.binaryTrees;

/**
 * Created by ajoshi on 8/21/15.
 */
public class CheckBalancedTree {

    /**
     *
     * A balanced tree is defined to be a tree such that the heights of the
     * two subtrees of any node never differ by more than one.
     *
     * Time Complexity - O(n)
     * Space Complexity - O(h) [i.e O(log n)]
     *
     * @param root
     * @return
     */
    public static boolean isHeightBalanced(Tree root) {
        if(root == null)
            return true;
        else if (checkHeight(root) != -1)
            return true;
        return false;
    }

    private static int checkHeight(Tree root) {
        if(root == null)
            return 0;

        int leftHeight = checkHeight(root.left);
        if(leftHeight == -1)
            return -1;

        int rightHeight = checkHeight(root.right);
        if(rightHeight == -1)
            return -1;


        int heightDiff = Math.abs(leftHeight - rightHeight);
        if(heightDiff <= 1)
            return Math.max(leftHeight, rightHeight) + 1;
        return -1;
    }


    /**
     *
     * A balanced tree is defined to be a tree such that no two leaf nodes
     * differ in distance from the root by more than one.
     *
     * Time Complexity - O(n)
     *
     * @param t
     * @return
     */
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
