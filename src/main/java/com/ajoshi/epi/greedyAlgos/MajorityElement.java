package com.ajoshi.epi.greedyAlgos;

/**
 * Created by ajoshi on 10/22/15.
 */
public class MajorityElement {
    public static String findMajorityElement(String[] words) {
        int count = 0;
        String majorityElement = "";
        for(String word:words) {
            if(count == 0) {
                majorityElement = word;
                count++;
            } else if(majorityElement.equals(word)) {
                count++;
            }
            else {
                count--;
            }
        }
        return majorityElement;
    }


    /**
     *
     * Can also solve the problem by finding n/2th largest element
     * in the array. Since we know that majority element is going to
     * be more than n/2 elements. The n/2th element will always be
     * equal to the majority element.
     *
     */
}
