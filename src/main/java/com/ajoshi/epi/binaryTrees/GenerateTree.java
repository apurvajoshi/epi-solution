package com.ajoshi.epi.binaryTrees;

/**
 * Created by ajoshi on 8/25/15.
 *
 * Problem 9.7: Given an inorder traversal order, and one of a preorder or a postorder
 * traversal order of a binary tree, write a function to reconstruct the tree.
 *
 */

public class GenerateTree {

    public static Tree generateTree(int[] inorder, int[] preorder) {
        return generateTreeHelper(inorder, 0, inorder.length - 1,
                preorder, 0, preorder.length-1);
    }

    private static Tree generateTreeHelper(int[] inorder, int low1, int high1,
                                           int[] preorder, int low2, int high2) {
        if(low1 > high1 || low2 > high2)
            return null;

        Tree root = new Tree(preorder[low2]);

        int index = getIndex(inorder, low1, high1, preorder[low2]);

        if(index == -1) {
            System.out.println("ERROR! - Both arrays contain different elements");
            return null;
        }

        root.left = generateTreeHelper(inorder, low1, index-1,
                preorder, low2+1, low2+index-low1);
        root.right = generateTreeHelper(inorder, index+1, high1,
                preorder, low2+index-low1+1, high2);

        return root;
    }

    private static int getIndex(int[] inorder, int low1, int high1, int key) {
        for(int i = low1; i <= high1; i++) {
            if(inorder[i] == key)
                return i;
        }
        return -1;
    }

}
