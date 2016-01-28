package com.ajoshi.epi.binarySearchTrees;

import com.ajoshi.epi.binaryTrees.Tree;

import java.util.ArrayList;

/**
 * Created by ajoshi on 10/4/15.
 */
public class KLargest {

    public static int COUNT = 0;

    /**
     * Find K largest elements in BST is
     * equivalent to doing a reverse inorder traversal.
     *
     * @param k
     * @param results
     */
    public static void findKLargestInBST(Tree<Integer> root, int k, ArrayList<Integer> results) {
        COUNT++;
        if(root == null || results.size() >= k )
            return;
        findKLargestInBST(root.right, k, results);
        if(results.size() < k)
            results.add(root.data);
        findKLargestInBST(root.left, k, results);
    }
}
