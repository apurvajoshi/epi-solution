package com.ajoshi.epi.primitive;

import org.junit.Assert;
import org.junit.Test;

public class SSColumnEncodingTest {

    @Test
    public void testSsDecodeColID() throws Exception {
        Assert.assertEquals(SSColumnEncoding.ssDecodeColID("A"), 1);
        System.out.println("\n\n");
        Assert.assertEquals(SSColumnEncoding.ssDecodeColID("Z"), 26);
        System.out.println("\n\n");
        Assert.assertEquals(SSColumnEncoding.ssDecodeColID("AA"), 27);
        System.out.println("\n\n");
        Assert.assertEquals(SSColumnEncoding.ssDecodeColID("AZ"), 52);
        System.out.println("\n\n");
        Assert.assertEquals(SSColumnEncoding.ssDecodeColID("ZY"), 701);
        System.out.println("\n\n");
        SSColumnEncoding.ssDecodeColID("ASDSD");

    }
}