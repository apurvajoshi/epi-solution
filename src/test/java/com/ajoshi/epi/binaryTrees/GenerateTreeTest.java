package com.ajoshi.epi.binaryTrees;
import org.junit.Test;

public class GenerateTreeTest{

    @Test
    public void testGenerateTree() throws Exception {
        int[] inorder = {4,2,6,7,5,1,8,3,9,10};
        int[] preorder = {1,2,4,5,6,7,3,8,9,10};

        Tree root = GenerateTree.generateTree(inorder, preorder);
        root.print();

    }
}