package com.ajoshi.epi.binaryTrees;


import org.junit.Test;

public class TraverseTreeTest {

    @Test
    public void testInorderTraversal() throws Exception {
        System.out.println("\n\n Inorder traversal recursive ");
        Tree root = new Tree<Integer>(1);
        root.left = new Tree<Integer>(2);
        root.right = new Tree<Integer>(3);
        root.left.left = new Tree<Integer>(4);
        root.left.right = new Tree<Integer>(5);
        root.right.right = new Tree<Integer>(6);
        root.left.right.left = new Tree<Integer>(7);
        root.left.right.left.right = new Tree<Integer>(8);
        //root.print();
        TraverseTree.inorderTraversal(root);
    }

    @Test
    public void testIterativeInorderTraversal() throws Exception {
        System.out.println("\n\n Inorder traversal iterative ");
        Tree root = new Tree<Integer>(1);
        root.parent = null;

        root.left = new Tree<Integer>(2);
        root.left.parent = root;

        root.right = new Tree<Integer>(3);
        root.right.parent = root;

        root.left.left = new Tree<Integer>(4);
        root.left.left.parent = root.left;

        root.left.right = new Tree<Integer>(5);
        root.left.right.parent = root.left;

        root.right.right = new Tree<Integer>(6);
        root.right.right.parent = root.right;

        root.left.right.left = new Tree<Integer>(7);
        root.left.right.left.parent = root.left.right;

        root.left.right.left.right = new Tree<Integer>(8);
        root.left.right.left.right.parent = root.left.right.left;

        //root.print();
        TraverseTree.iterativeInorderTraversal(root);
    }
}