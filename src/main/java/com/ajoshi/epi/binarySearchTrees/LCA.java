package com.ajoshi.epi.binarySearchTrees;

import com.ajoshi.epi.binaryTrees.Tree;

import javax.swing.tree.TreeNode;

/**
 * Created by ajoshi on 10/7/15.
 */
public class LCA {

    /**
     *
     * Time Complexity - O(log n)
     *
     * @param root
     * @param node1
     * @param node2
     * @return
     */
    public static Tree<Integer> findLowestCommonAncestor(Tree<Integer> root,
                                                Tree<Integer> node1, Tree<Integer> node2) {

        if(root == null || node1 == null || node2 == null)
            return null;

        Tree<Integer> itr = root;
        while(itr != null) {
            if(itr.data > node1.data && itr.data > node2.data)
                itr = itr.left;
            if(itr.data < node1.data && itr.data < node2.data)
                itr = itr.right;
            else if(itr.data >= node1.data && itr.data <= node2.data)
                return itr;
            else if(itr.data <= node1.data && itr.data >= node2.data)
                return itr;
        }
        return null;
    }
}
