package com.ajoshi.epi.recursion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GenerateCombinationTest {

    @Test
    public void testGetCombinations() throws Exception {

        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<>();
        ArrayList<String> list = new ArrayList<>();
        list.add("US");
        list.add("CA");
        list.add("MX");
        map.put("country", list);

        list = new ArrayList<>();
        list.add("M");
        list.add("F");
        map.put("gender", list);

        list = new ArrayList<>();
        list.add("0-19");
        list.add("20-39");
        list.add("40-59");
        list.add("60-79");
        list.add("80-99");
        map.put("age-group", list);

        list = new ArrayList<>();
        list.add("L");
        list.add("M");
        list.add("H");
        map.put("income", list);

        for(Map.Entry<String, ArrayList<String>> entry :  map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        System.out.println("\n\nRESULTS");

        ArrayList<ArrayList<String>> results =  GenerateCombination.getCombinations(map);

        for(ArrayList<String> result : results) {
            System.out.println(result);
        }

        System.out.println(results.size());

    }
}