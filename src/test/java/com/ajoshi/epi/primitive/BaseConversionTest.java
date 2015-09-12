package com.ajoshi.epi.primitive;

import org.junit.Assert;
import org.junit.Test;

public class BaseConversionTest {

    @Test
    public void testBaseConversion() throws Exception {
        Assert.assertEquals(BaseConversion.baseConversion(2, "1000", 16), "8");
        System.out.println("\n\n");
        Assert.assertEquals(BaseConversion.baseConversion(10,"0",2), "0");
        System.out.println("\n\n");
        Assert.assertEquals(BaseConversion.baseConversion(16,"A",2), "1010");
        System.out.println("\n\n");
        Assert.assertEquals(BaseConversion.baseConversion(16,"AF",2), "10101111");
        System.out.println("\n\n");
        Assert.assertEquals(BaseConversion.baseConversion(16,"FFFF",2), "1111111111111111");
        System.out.println("\n\n");
        Assert.assertEquals(BaseConversion.baseConversion(2,"-1000",16), "-8");
        System.out.println("\n\n");
        Assert.assertEquals(BaseConversion.baseConversion(10,"-9",2), "-1001");
    }
}