package com.ajoshi.epi.arraysAndStrings;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PhoneNumberMnemonicTest{

    @Test
    public void testGenerateSequence() throws Exception {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "0");
        map.put(1, "1");
        map.put(2, "ABC");
        map.put(3, "DEF");
        map.put(4, "GHI");
        map.put(5, "JKL");
        map.put(6, "MNO");
        map.put(7, "PQRS");
        map.put(8, "TUV");
        map.put(9, "WXYZ");

        ArrayList<String> result = PhoneNumberMnemonic.generateSequence("2602178", map);
        System.out.println(Arrays.toString(result.toArray()));
        Assert.assertTrue(!result.isEmpty());
    }
}