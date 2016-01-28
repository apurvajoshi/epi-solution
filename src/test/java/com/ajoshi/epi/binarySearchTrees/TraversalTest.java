package com.ajoshi.epi.binarySearchTrees;

import com.ajoshi.epi.binaryTrees.Tree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TraversalTest {

    @Test
    public void testInorderTraversal() throws Exception {
        Tree root = new Tree<Integer>(16);
        root.left = new Tree<Integer>(6);
        root.left.right = new Tree<Integer>(10);
        root.left.left = new Tree<Integer>(1);


        root.right = new Tree<Integer>(20);
        root.right.left = new Tree<Integer>(17);
        root.right.right = new Tree<Integer>(25);

        root.print();
        Integer[] a = {1,6,10,16,17,20,25};
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(a));
        ArrayList<Integer> actual = Traversal.inorderTraversal(root);
        System.out.println("Inorder traversal is " + Arrays.toString(actual.toArray()));
        assertEquals(actual, results);

    }

    @Test
    public void testInorderTraversal2() throws Exception {
        Tree root = new Tree<Integer>(16);
        root.left = new Tree<Integer>(6);
        root.left.right = new Tree<Integer>(10);
        root.left.left = new Tree<Integer>(1);


        root.right = new Tree<Integer>(20);
        root.right.left = new Tree<Integer>(17);
        root.right.right = new Tree<Integer>(25);

        root.print();
        Integer[] a = {1,6,10,16,17,20,25};
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(a));
        ArrayList<Integer> actual = new ArrayList<Integer>();
        Traversal.inorderTraversal2(root,actual);
        System.out.println("Inorder traversal is " + Arrays.toString(actual.toArray()));
        assertEquals(actual, results);

    }
}