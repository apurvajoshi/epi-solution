package com.ajoshi.epi.binaryTrees;

import java.util.ArrayList;

/**
 * Created by ajoshi on 8/21/15.
 */
public class Tree<T> {
    T data;
    Tree<T> left;
    Tree<T> right;
    Tree<T> parent;


    public Tree() {}
    public Tree(T data) {
        this.data = data;
    }

    public void print() {
        Tree root = this;
        ArrayList<ArrayList<Tree>> results = new ArrayList<ArrayList<Tree>>();
        ArrayList<Tree> result = new ArrayList<Tree>();
        result.add(root);
        results.add(result);

        int level = 0;

        while(results.get(level).size() > 0) {
            result = new ArrayList<Tree>();
            for(int i = 0; i < results.get(level).size(); i++) {
                System.out.print(results.get(level).get(i).data + " ");
                if(results.get(level).get(i).left != null)
                    result.add(results.get(level).get(i).left);

                if(results.get(level).get(i).right != null)
                    result.add(results.get(level).get(i).right);
            }
            System.out.println();
            results.add(result);
            level++;
        }

    }
}
