package com.ajoshi.epi.binaryTrees;


import org.junit.Assert;
import org.junit.Test;

public class CheckBalancedTreeTest {

    @Test
    public void testIsBalanced() throws Exception {
        Tree root = new Tree<Integer>(1);
        root.left = new Tree<Integer>(2);
        root.right = new Tree<Integer>(3);
        root.left.left = new Tree<Integer>(4);
        root.left.right = new Tree<Integer>(5);
        root.right.right = new Tree<Integer>(6);
        root.left.right.left = new Tree<Integer>(7);
        root.left.right.left.right = new Tree<Integer>(8);
        root.print();
        Assert.assertEquals(CheckBalancedTree.isBalanced(root), false);
    }

    @Test
    public void testIsBalancedWithNull() throws Exception {
        Tree root = new Tree();
        root.print();
        Assert.assertEquals(CheckBalancedTree.isBalanced(null),true);
    }
}