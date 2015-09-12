package com.ajoshi.epi.binaryTrees;
import org.junit.Assert;
import org.junit.Test;

public class CheckSymmetryTest {

    @Test
    public void testCheckSymmetry() throws Exception {
        System.out.println("\n\ntestCheckSymmetry");
        Tree root = new Tree<Integer>(314);
        root.left = new Tree<Integer>(6);
        root.left.right = new Tree<Integer>(2);
        root.left.right.right = new Tree<Integer>(3);

        root.right = new Tree<Integer>(6);
        root.right.left = new Tree<Integer>(2);
        root.right.left.left = new Tree<Integer>(3);

        root.print();

        Assert.assertTrue(CheckSymmetry.checkSymmetry(root));

    }

    @Test
    public void testCheckSymmetry2() throws Exception {
        System.out.println("\n\ntestCheckSymmetry2");
        Tree root = new Tree<Integer>(1);
        root.left = new Tree<Integer>(2);

        root.left.left = new Tree<Integer>(3);
        root.left.left.right = new Tree<Integer>(9);

        root.left.right = new Tree<Integer>(4);
        root.left.right.right = new Tree<Integer>(11);
        root.left.right.left = new Tree<Integer>(7);
        root.left.right.left.left = new Tree<Integer>(8);
        root.left.right.left.left.right = new Tree<Integer>(10);

        root.right = new Tree<Integer>(2);

        root.right.right = new Tree<Integer>(3);
        root.right.right.left = new Tree<Integer>(9);

        root.right.left = new Tree<Integer>(4);
        root.right.left.left = new Tree<Integer>(11);
        root.right.left.right = new Tree<Integer>(7);
        root.right.left.right.right = new Tree<Integer>(8);
        root.right.left.right.right.left = new Tree<Integer>(10);


        root.print();

        Assert.assertTrue(CheckSymmetry.checkSymmetry(root));

    }

    @Test
    public void testCheckSymmetryWithNull() throws Exception {
        System.out.println("\n\ntestCheckSymmetryWithNull");
        Assert.assertTrue(CheckSymmetry.checkSymmetry(null));

    }
}