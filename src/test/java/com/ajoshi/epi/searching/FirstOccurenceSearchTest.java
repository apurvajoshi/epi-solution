package com.ajoshi.epi.searching;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstOccurenceSearchTest {

    @Test
    public void testFindFirstOccurence() throws Exception {
        System.out.println("\ntestFindFirstOccurence");
        int[] a = {-14,-10,2,108,108,243,285,285,285,401};
        assertEquals(FirstOccurenceSearch.findFirstOccurence(a, 108), 3);
        assertEquals(FirstOccurenceSearch.findFirstOccurence(a, 285), 6);
    }

    @Test
    public void testFindFirstOccurenceWithEqualValueArray() throws Exception {
        System.out.println("\ntestFindFirstOccurenceWithEqualValueArray");
        int[] a = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        assertEquals(FirstOccurenceSearch.findFirstOccurence(a, 1), 0);
    }

    @Test
    public void testFindFirstOccurenceImproved() throws Exception {
        System.out.println("\ntestFindFirstOccurenceImproved");
        int[] a = {-14,-10,2,108,108,243,285,285,285,401};
        assertEquals(FirstOccurenceSearch.findFirstOccurenceImproved(a, 108), 3);
        assertEquals(FirstOccurenceSearch.findFirstOccurenceImproved(a, 285), 6);
    }

    @Test
    public void testFindFirstOccurenceImprovedWithEqualValueArray() throws Exception {
        System.out.println("\ntestFindFirstOccurenceImprovedWithEqualValueArray");
        int[] a = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        assertEquals(FirstOccurenceSearch.findFirstOccurenceImproved(a, 1), 0);
    }
}