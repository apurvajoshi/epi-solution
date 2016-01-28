package com.ajoshi.epi.binarySearchTrees;

import com.ajoshi.epi.binaryTrees.Tree;

import java.util.Comparator;

/**
 * Created by ajoshi on 11/16/15.
 */
public class BSTHelper<T extends Comparable> {

    private static class DefaultComparator implements Comparator {

        public int compare(Object o1, Object o2) {
            return ((Comparable)o1).compareTo(o2);
        }
    }

    private Comparator<T> comp = new DefaultComparator();

    /**
     *
     * Time Complexity - O(n)
     *
     * @param root
     * @param data
     * @return
     */
    public Tree<T> insert(Tree<T> root, T data) {
        if(root == null) {
            root = new Tree<>(data);
            return  root;
        }
        if(comp.compare(root.data, data) > 0) {
            root.left = insert(root.left, data);
        }
        else {
            root.right = insert(root.right, data);
        }
        return root;
    }


    public Tree<T> delete(Tree<T> root, T data) throws Exception {

        Tree<T> element = root;
        Tree<T> parent = null;

        while(element != null) {
            if(element.data.equals(data)) {
                break;
            } else if (comp.compare(element.data, data) > 0) {
                System.out.println("Element (going left)=" + element.data);
                parent = element;
                element = element.left;
            } else {
                System.out.println("Element(going right) =" + element.data);
                parent = element;
                element = element.right;
            }
        }

        if(element == null) {
            throw new Exception("Element not found");
        }

        /**
         * Case 1 - If both children are null
         */
        if(element.left == null && element.right == null) {
            if(parent != null) {
                if(comp.compare(parent.data,element.data) > 0)
                    parent.left = null;
                else
                    parent.right = null;
            } else {
                // Child is the root element
                root = null;

            }
            return root;
        }

        /**
         * Case 2 - If one children is null
         */
        if(element.left == null || element.right == null) {
            if(parent != null) {
                if(element.left != null) {
                    if(comp.compare(parent.data, element.data) > 0)
                        parent.left = element.left;
                    else
                        parent.right = element.left;
                } else {
                    if(comp.compare(parent.data, element.data) > 0)
                        parent.left = element.right;
                    else
                        parent.right = element.right;
                }
            } else {
                if(element.left != null) {
                    root = element.left;
                } else {
                    root = element.right;
                }
            }

            return root;
        }

        /**
         * Case 3 - If both children aren't null
         */
        if(element.left != null && element.right != null) {
            Tree<T> successor = findSuccessor(element);
            element.data = successor.data;
            element.right = delete(element.right, successor.data);
            return root;
        }
        return root;
    }

    private Tree<T> findSuccessor(Tree<T> root) {
        Tree<T> p = root.right;
        while(p.left != null) {
            p = p.left;
        }
        return p;
    }
}
