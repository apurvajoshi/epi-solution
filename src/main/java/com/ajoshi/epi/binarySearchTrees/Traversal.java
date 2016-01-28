package com.ajoshi.epi.binarySearchTrees;

import com.ajoshi.epi.binaryTrees.Tree;

import java.util.ArrayList;

/**
 * Created by ajoshi on 10/4/15.
 */
public class Traversal {

    public static ArrayList<Integer> inorderTraversal(Tree<Integer> root) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        if(root == null)
            return null;


        ArrayList<Integer> subResults = inorderTraversal(root.left);
        if(subResults != null)
            results.addAll(subResults);

        results.add(root.data);

        subResults = inorderTraversal(root.right);

        if(subResults != null)
            results.addAll(subResults);
        return results;
    }


    public static void inorderTraversal2(Tree<Integer> root, ArrayList<Integer> results) {
        if(root == null)
            return;
        inorderTraversal2(root.left, results);
        results.add(root.data);
        inorderTraversal2(root.right, results);
    }
}
