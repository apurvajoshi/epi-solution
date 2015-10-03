package com.ajoshi.epi.binarySearchTrees;

import com.ajoshi.epi.binaryTrees.Tree;
import org.junit.Test;
import static org.junit.Assert.*;


public class ValidateTest {

    @Test
    public void testValidateBST() throws Exception {
        Tree root = new Tree<Integer>(16);
        root.left = new Tree<Integer>(6);
        root.left.right = new Tree<Integer>(10);
        root.left.right.right = new Tree<Integer>(15);

        root.right = new Tree<Integer>(20);
        root.right.left = new Tree<Integer>(17);
        root.right.left.left = new Tree<Integer>(16);

        root.print();

        assertEquals(Validate.validateBST(root), true);

    }
}