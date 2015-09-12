package com.ajoshi.epi.primitive;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ajoshi on 8/3/15.
 */
public class BitReversalTest {
    @Test
    public void testReversalForZero() {
        Assert.assertEquals(BitReversal.reverseBits(0), 0);
    }

    @Test
    public void testReversal() {
        Long x = 24L;
        Long y = BitReversal.reverseBits(x);
        Long z = BitReversal.reverseBits(y);
        System.out.println("Z is " + z);
        Assert.assertEquals(x, z);
    }
}
