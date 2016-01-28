package com.ajoshi.epi.binarySearchTrees;

import com.ajoshi.epi.binaryTrees.Tree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class KLargestTest {

    @Test
    public void testFindKLargestInBST() throws Exception {
        Tree root = new Tree<Integer>(16);
        root.left = new Tree<Integer>(6);
        root.left.right = new Tree<Integer>(10);
        root.left.left = new Tree<Integer>(1);
        root.left.left.left = new Tree<Integer>(0);
        root.left.left.left.left = new Tree<Integer>(-1);
        root.left.left.left.left.left = new Tree<Integer>(-2);


        root.right = new Tree<Integer>(22);
        root.right.left = new Tree<Integer>(20);
        root.right.left.left = new Tree<Integer>(17);
//        root.right.left.left.left = new Tree<Integer>(16);
        root.right.right = new Tree<Integer>(25);

        root.print();

        Integer[] a = {25,22,20,17, 16, 10};
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(a));
        ArrayList<Integer> actual = new ArrayList<Integer>();
        KLargest.findKLargestInBST(root, 6, actual);
        System.out.println("K largest elements in BST are " + Arrays.toString(actual.toArray()));
        System.out.println("# of times in loop = " + KLargest.COUNT);
        assertEquals(results, actual);
    }

    @Test
    public void testFindKLargestInBSTWithDuplicates() throws Exception {
        Tree root = new Tree<Integer>(3);
        root.left = new Tree<Integer>(3);
        root.left.left = new Tree<Integer>(1);

        root.right = new Tree<Integer>(4);
        root.right.left = new Tree<Integer>(4);
        root.right.right = new Tree<Integer>(6);

        root.print();

        Integer[] a = {6,4,4};
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(a));
        ArrayList<Integer> actual = new ArrayList<Integer>();
        KLargest.findKLargestInBST(root, 3, actual);
        System.out.println("K largest elements in BST are " + Arrays.toString(actual.toArray()));
        assertEquals(results, actual);
    }
}