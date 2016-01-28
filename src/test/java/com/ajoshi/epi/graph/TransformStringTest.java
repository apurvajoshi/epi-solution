package com.ajoshi.epi.graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransformStringTest {

    @Test
    public void testTranform() throws Exception {
        String[] dictionary = {"dog","pog","log","dol","dad","mad","bur","dug","mod","cod","cud","san","dom","sar","lur",
                "car","lug","cur","cag","dod","rag"};

        System.out.println(TransformString.tranform("dog","car",dictionary));

    }
}