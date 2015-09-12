package com.ajoshi.epi.arraysAndStrings;


import org.junit.Assert;
import org.junit.Test;

public class BigIntegerMultiplicationTest {

    @Test
    public void testProduct() throws Exception {

        // Checking Associativity
        Assert.assertEquals(BigIntegerMultiplication.product("45", "123"), 5535);
        Assert.assertEquals(BigIntegerMultiplication.product("123", "45"), 5535);

        // Checking Sign
        Assert.assertEquals(BigIntegerMultiplication.product("-45", "123"), -5535);
        Assert.assertEquals(BigIntegerMultiplication.product("123", "-45"), -5535);

        // Checking Sign
        Assert.assertEquals(BigIntegerMultiplication.product("-45", "-123"), 5535);
        Assert.assertEquals(BigIntegerMultiplication.product("-123", "-45"), 5535);


        // Checking multiplication
        Assert.assertEquals(BigIntegerMultiplication.product("205", "5"), 1025);
        Assert.assertEquals(BigIntegerMultiplication.product("500", "25"), 12500);
        Assert.assertEquals(BigIntegerMultiplication.product("900345", "505"), 454674225);


        // Checking big multiplication
        Assert.assertEquals(BigIntegerMultiplication.product("34534", "23441"), 809511494);
        Assert.assertEquals(BigIntegerMultiplication.product("23441", "34534"), 809511494);
    }

    @Test
    public void testImprovedProduct() throws Exception {
        // Checking Associativity
        Assert.assertEquals(BigIntegerMultiplication.improvedProduct("45", "123"), "5535");
        Assert.assertEquals(BigIntegerMultiplication.improvedProduct("123", "45"), "5535");

        // Checking Sign
        Assert.assertEquals(BigIntegerMultiplication.improvedProduct("-45", "123"), "-5535");
        Assert.assertEquals(BigIntegerMultiplication.improvedProduct("123", "-45"), "-5535");

        // Checking Sign
        Assert.assertEquals(BigIntegerMultiplication.improvedProduct("-45", "-123"), "5535");
        Assert.assertEquals(BigIntegerMultiplication.improvedProduct("-123", "-45"), "5535");

        // Checking multiplication
        Assert.assertEquals(BigIntegerMultiplication.improvedProduct("9", "999"), "8991");
        Assert.assertEquals(BigIntegerMultiplication.improvedProduct("205", "5"), "1025");
        Assert.assertEquals(BigIntegerMultiplication.improvedProduct("500", "25"), "12500");
        Assert.assertEquals(BigIntegerMultiplication.improvedProduct("900345", "505"), "454674225");
        Assert.assertEquals(BigIntegerMultiplication.improvedProduct("-90032445", "52343405"), "-4712604731775225");
        Assert.assertEquals(BigIntegerMultiplication.improvedProduct("233756", "3423499"), "800263432244");


    }
}