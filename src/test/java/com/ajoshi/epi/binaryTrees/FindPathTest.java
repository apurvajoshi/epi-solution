package com.ajoshi.epi.binaryTrees;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FindPathTest {

    @Test
    public void testCheckIfPathExist() throws Exception {
        Tree<Integer> root = new Tree<>(2);
        root.left = new Tree<>(-3);
        root.left.left = new Tree<>(1);
        root.left.right = new Tree<>(4);

        root.right = new Tree<>(0);
        root.right.right = new Tree<>(5);
        root.right.left = new Tree<>(1);

        assertTrue(FindPath.checkIfPathExist(root, 0));
        assertTrue(FindPath.checkIfPathExist(root, 3));
        assertTrue(FindPath.checkIfPathExist(root, 7));
        assertFalse(FindPath.checkIfPathExist(root, 10));


        Tree<Integer> root1 = new Tree<>(314);

        root1.left = new Tree<>(6);
        root1.left.left = new Tree<>(271);
        root1.left.right = new Tree<>(561);

        root1.left.left.left = new Tree<>(28);
        root1.left.left.right = new Tree<>(0);

        root1.left.right.right = new Tree<>(3);
        root1.left.right.right.left = new Tree<>(17);

        root1.right = new Tree<>(6);
        root1.right.left = new Tree<>(2);
        root1.right.right = new Tree<>(271);
        root1.right.right.right = new Tree<>(28);

        root1.right.left.right = new Tree<>(1);
        root1.right.left.right.right = new Tree<>(257);
        root1.right.left.right.left = new Tree<>(401);
        root1.right.left.right.left.right = new Tree<>(641);
        root1.print();
        assertTrue(FindPath.checkIfPathExist(root1, 591));


    }

    @Test
    public void testReturnAllPathEqualToTarget() throws Exception {
        Tree<Integer> root = new Tree<>(2);
        root.left = new Tree<>(-3);
        root.left.left = new Tree<>(1);
        root.left.right = new Tree<>(4);
        root.right = new Tree<>(0);
        root.right.right = new Tree<>(5);
        root.right.left = new Tree<>(1);
        root.print();
        ArrayList<ArrayList<Integer>> results = FindPath.returnAllPathEqualToTarget(root,3);
        for(ArrayList<Integer> result : results)
            System.out.println(result);
        assertEquals(results.size(), 2);


        Tree<Integer> root1 = new Tree<>(314);
        root1.left = new Tree<>(6);
        root1.left.left = new Tree<>(271);
        root1.left.right = new Tree<>(561);

        root1.left.left.left = new Tree<>(28);
        root1.left.left.right = new Tree<>(0);
        root1.left.right.right = new Tree<>(3);
        root1.left.right.right.left = new Tree<>(17);

        root1.right = new Tree<>(6);
        root1.right.left = new Tree<>(2);
        root1.right.right = new Tree<>(271);
        root1.right.right.right = new Tree<>(28);

        root1.right.left.right = new Tree<>(1);
        root1.right.left.right.right = new Tree<>(257);
        root1.right.left.right.left = new Tree<>(401);
        root1.right.left.right.left.right = new Tree<>(641);
        root1.print();


        results = FindPath.returnAllPathEqualToTarget(root1,619);
        for(ArrayList<Integer> result : results)
            System.out.println(result);
        assertEquals(results.size(), 2);

    }
}