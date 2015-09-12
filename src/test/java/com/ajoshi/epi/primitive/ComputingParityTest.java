package com.ajoshi.epi.primitive;
import org.junit.*;


/**
 * Created by ajoshi on 7/30/15.
 */
public class ComputingParityTest {
    @Test
    public void testParity1() {
        Assert.assertEquals(ComputingParity.calculateParity1(1),1);
        Assert.assertEquals(ComputingParity.calculateParity1(2),1);
        Assert.assertEquals(ComputingParity.calculateParity1(3),0);
        Assert.assertEquals(ComputingParity.calculateParity1(4),1);
        Assert.assertEquals(ComputingParity.calculateParity1(5),0);
        Assert.assertEquals(ComputingParity.calculateParity1(6),0);
    }

    @Test
    public void testParity2() {
        Assert.assertEquals(ComputingParity.calculateParity2(1),1);
        Assert.assertEquals(ComputingParity.calculateParity2(2),1);
        Assert.assertEquals(ComputingParity.calculateParity2(3),0);
        Assert.assertEquals(ComputingParity.calculateParity2(4),1);
        Assert.assertEquals(ComputingParity.calculateParity2(5),0);
        Assert.assertEquals(ComputingParity.calculateParity2(6),0);
    }
}
