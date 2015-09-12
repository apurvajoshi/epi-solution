package com.ajoshi.epi.binaryTrees;

/**
 * Created by ajoshi on 8/22/15.
 */
public class TraverseTree {

    public static void inorderTraversal(Tree root) {
        if(root == null)
            return;
        inorderTraversal(root.left);
        System.out.print (root.data + " ");
        inorderTraversal(root.right);
    }

    public static void iterativeInorderTraversal(Tree root) {
        Tree curr = root;
        Tree prev = null;
        Tree next;

        while(curr != null) {
            if(prev == null || prev.left == curr || prev.right == curr) {
                if(curr.left != null) {
                    next = curr.left;
                } else {
                    System.out.print(curr.data + " ");
                    next = curr.right != null ? curr.right : curr.parent;
                }
            } else if (curr.left == prev) {
                System.out.print(curr.data + " ");
                next = curr.right != null ? curr.right : curr.parent;
            } else {
                next = curr.parent;
            }
            prev = curr;
            curr = next;
        }

    }

}
