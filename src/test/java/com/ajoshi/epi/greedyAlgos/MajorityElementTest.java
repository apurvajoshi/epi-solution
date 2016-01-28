package com.ajoshi.epi.greedyAlgos;

import org.junit.Test;

import static org.junit.Assert.*;

public class MajorityElementTest {

    @Test
    public void testFindMajorityElement() throws Exception {
        String[] words = {"the", "thing","some", "what","some","some", "some", "a", "test","the","some"};
        assertEquals(MajorityElement.findMajorityElement(words), "some");

    }
}