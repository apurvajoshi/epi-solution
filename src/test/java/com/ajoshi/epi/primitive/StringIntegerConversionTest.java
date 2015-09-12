package com.ajoshi.epi.primitive;

import org.junit.Assert;
import org.junit.Test;

public class StringIntegerConversionTest {

    @Test
    public void testIntToString() throws Exception {
        Assert.assertEquals(StringIntegerConversion.intToString(123), "123");
        Assert.assertEquals(StringIntegerConversion.intToString(-1), "-1");
        Assert.assertEquals(StringIntegerConversion.intToString(0), "0");
        Assert.assertEquals(StringIntegerConversion.intToString(234234243), "234234243");
        Assert.assertEquals(StringIntegerConversion.intToString(-234234243), "-234234243");
    }

    @Test
    public void testStringToInt() throws Exception {
        Assert.assertEquals(StringIntegerConversion.stringToInt("123"), 123);
        Assert.assertEquals(StringIntegerConversion.stringToInt("12345"), 12345);
        Assert.assertEquals(StringIntegerConversion.stringToInt("0"), 0);
        Assert.assertEquals(StringIntegerConversion.stringToInt("011"), 11);
        Assert.assertEquals(StringIntegerConversion.stringToInt("-11"), -11);
        Assert.assertEquals(StringIntegerConversion.stringToInt("-11qweqwe"), -1);
        Assert.assertEquals(StringIntegerConversion.stringToInt("qweqwe"), -1);
        Assert.assertEquals(StringIntegerConversion.stringToInt("      123"), 123);
        Assert.assertEquals(StringIntegerConversion.stringToInt("      123            "), 123);
        Assert.assertEquals(StringIntegerConversion.stringToInt("-123"), -123);
        Assert.assertEquals(StringIntegerConversion.stringToInt("     -123   "), -123);
        Assert.assertEquals(StringIntegerConversion.stringToInt("     -123324234"), -123324234);
    }
}