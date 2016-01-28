package com.ajoshi.epi.binarySearchTrees;

import com.ajoshi.epi.binaryTrees.Tree;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class LCATest {

    private static Tree root = null;

    @BeforeClass
    public static void oneTimeSetUp() {
        // one-time initialization code
        System.out.println("@BeforeClass - oneTimeSetUp");
        root = new Tree<Integer>(10);
        root.left = new Tree<Integer>(5);
        root.left.right = new Tree<Integer>(7);
        root.left.left = new Tree<Integer>(3);
        root.left.right.right = new Tree<Integer>(9);

        root.right = new Tree<Integer>(20);
        root.right.left = new Tree<Integer>(15);
        root.right.right = new Tree<Integer>(28);
        root.right.left.left = new Tree<Integer>(13);
        root.right.left.right = new Tree<Integer>(17);
        root.right.right.right = new Tree<Integer>(30);
        root.print();
    }

    @Test
    public void testFindLowestCommonAncestor() throws Exception {
        System.out.println("\n\ntestFindLowestCommonAncestor");
        Tree lca = LCA.findLowestCommonAncestor(root, new Tree<Integer>(15), new Tree<Integer>(30));
        System.out.println("LCA is " + lca.data);
        assertEquals(lca.data, 20);
    }

    @Test
    public void testFindLowestCommonAncestorWithOneNodeAsAncestor() throws Exception {
        System.out.println("\n\ntestFindLowestCommonAncestorWithOneNodeAsAncestor");
        Tree lca = LCA.findLowestCommonAncestor(root, new Tree<Integer>(7), new Tree<Integer>(9));
        System.out.println("LCA is " + lca.data);
        assertEquals(lca.data, 7);
    }

    @Test
    public void testFindLowestCommonAncestorWithSameNode() throws Exception {
        System.out.println("\n\ntestFindLowestCommonAncestorWithSameNode");
        Tree lca = LCA.findLowestCommonAncestor(root, new Tree<Integer>(30), new Tree<Integer>(30));
        System.out.println("LCA is " + lca.data);
        assertEquals(lca.data, 30);
    }
}