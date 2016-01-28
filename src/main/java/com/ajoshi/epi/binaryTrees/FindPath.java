package com.ajoshi.epi.binaryTrees;

import java.util.ArrayList;

/**
 * Created by ajoshi on 11/12/15.
 */
public class FindPath {

    public static boolean checkIfPathExist(Tree<Integer> root, int target) {
        return checkIfPathExistHelper(root, target, 0);
    }

    /**
     *
     * Time Complexity - O(n)
     *
     * Space Complexity - O(h)
     *
     * @param root
     * @param target
     * @param running_sum
     * @return
     */
    private static boolean checkIfPathExistHelper(Tree<Integer> root, int target, int running_sum) {
        if(root == null) {
            if(target == running_sum)
                return true;
            return false;
        }
        return checkIfPathExistHelper(root.left, target, running_sum + root.data) ||
                checkIfPathExistHelper(root.right, target, running_sum + root.data);
    }

    public static ArrayList<ArrayList<Integer>> returnAllPathEqualToTarget(Tree<Integer> root, int target) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        returnAllPathEqualToTargetHelper(root, target, results, new ArrayList<Integer>(), 0);
        return results;

    }

    private static void returnAllPathEqualToTargetHelper(Tree<Integer> root, int target,
                                                         ArrayList<ArrayList<Integer>> results, ArrayList<Integer> result,
                                                         int running_sum) {
        if(root == null)
            return;

        running_sum += root.data;
        ArrayList<Integer> subResult = new ArrayList<>(result);
        subResult.add(root.data);

        /**
         * Leaf node
         */
        if(root.left == null && root.right == null) {
            if(target == running_sum)
                results.add(subResult);
            return;
        }

        returnAllPathEqualToTargetHelper(root.left, target, results, subResult, running_sum);
        returnAllPathEqualToTargetHelper(root.right, target, results, subResult, running_sum);
    }

}
