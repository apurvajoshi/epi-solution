package com.ajoshi.epi.binaryTrees;

/**
 * Created by ajoshi on 8/26/15.
 */
public class CheckSymmetry {
    public static boolean checkSymmetry(Tree root) {
        if(root == null)
            return true;
        return compareSymmetry(root.left, root.right);
    }

    private static boolean compareSymmetry(Tree t1, Tree t2) {
        if(t1 == null && t2 == null)
            return true;

        if(t1 == null || t2 == null)
            return false;

        if(t1.data == t2.data)
            return compareSymmetry(t1.left, t2.right) && compareSymmetry(t1.right, t2.left);

        return false;
    }

}
