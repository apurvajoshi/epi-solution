package com.ajoshi.epi.binarySearchTrees;

import com.ajoshi.epi.binaryTrees.Tree;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreateBSTTest {

    @Test
    public void testCreateBSTFromPreOrderSequence() throws Exception {
        System.out.println("\n\ntestCreateBSTFromPreOrderSequence");
        int[] a = {43, 23, 37, 29, 31, 41, 47, 53 };
        Tree root = CreateBST.createBSTFromPreOrderSequence(a, 0, a.length-1);
        root.print();
    }

    @Test
    public void testCreateBSTFromPreOrderSequence2() throws Exception {
        System.out.println("\n\ntestCreateBSTFromPreOrderSequence2");
        int[] a = {1,2,3};
        Tree root = CreateBST.createBSTFromPreOrderSequence(a, 0, a.length-1);
        root.print();
    }

    @Test
    public void testCreateBSTFromSortedArray() throws Exception {
        System.out.println("\n\ntestCreateBSTFromSortedArray");
        int[] a = {1,2,3,4};
        Tree root = CreateBST.createBSTWithMinHeight(a, 0, a.length-1);
        root.print();
    }
}