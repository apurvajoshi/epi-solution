package com.ajoshi.epi.searching;

/**
 * Created by ajoshi on 9/17/15.
 */
public class FirstOccurenceSearch {

    /**
     * The time complexity of this solution can be n
     * in the worst case, when all the elements are equal.
     * @param a
     * @param key
     * @return
     */
    public static int findFirstOccurence(int[] a , int key) {
        int low = 0;
        int high = a.length - 1;
        int countIteration = 0;

        while(low <= high) {
            countIteration++;
            int middle = (low + high)/2;
            if(a[middle] == key) {
                while(middle >= 0 && a[middle] == key) {
                    middle--;
                    countIteration++;
                }
                System.out.println("Number of iteration " + countIteration);
                return middle+1;
            } else if (key < a[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        System.out.println("Number of iteration " + countIteration);
        return -1;
    }

    /**
     *
     * Improved version. Time complexity is O(log n) even
     * in the worst case.
     *
     * @param a
     * @param key
     * @return
     */
    public static int findFirstOccurenceImproved(int[] a , int key) {
        int low = 0;
        int high = a.length - 1;
        int result = -1;
        int countIteration = 0;

        while(low <= high) {
            countIteration++;
            int middle = (low + high)/2;
            if(a[middle] == key) {
                result = middle;
                high = middle - 1;
            } else if (key < a[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        System.out.println("Number of iteration " + countIteration);
        return result;
    }
}
