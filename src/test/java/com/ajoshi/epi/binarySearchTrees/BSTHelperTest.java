package com.ajoshi.epi.binarySearchTrees;

import com.ajoshi.epi.binaryTrees.Tree;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSTHelperTest {

    @Test
    public void testInsert() throws Exception {
        BSTHelper<Integer> mgr = new BSTHelper<>();
        Tree<Integer> root = null;
        root = mgr.insert(root, 10);
        root.print();
        mgr.insert(root, 7);
        root.print();
        mgr.insert(root, 15);
        root.print();
        mgr.insert(root, 12);
        root.print();
        mgr.insert(root, 25);
        root.print();
        mgr.insert(root, 3);
        root.print();
        mgr.insert(root, 9);
        root.print();
        mgr.insert(root, 8);
        root.print();
    }

    @Test
    public void testDelete() throws Exception {
        BSTHelper<Integer> mgr = new BSTHelper<>();
        Tree<Integer> root = null;
        root = mgr.insert(root, 10);
        mgr.insert(root, 5);
        mgr.insert(root, 15);
        mgr.insert(root, 12);
        mgr.insert(root, 25);
        mgr.insert(root, 3);
        mgr.insert(root, 8);
        mgr.insert(root, 6);
        mgr.insert(root, 7);
        root.print();

        root = mgr.delete(root, 10);
        if(root != null)
            root.print();

        root = mgr.delete(root, 15);
        root.print();
        root = mgr.delete(root, 6);
        root.print();
        root = mgr.delete(root, 3);
        root.print();
        root = mgr.delete(root, 8);
        root.print();
        root = mgr.delete(root, 12);
        root.print();
        root = mgr.delete(root, 25);
        root.print();

    }
}