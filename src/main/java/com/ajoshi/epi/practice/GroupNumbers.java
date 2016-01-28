package com.ajoshi.epi.practice;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ajoshi on 11/4/15.
 *
 * Given a string of numbers and operators, return all possible
 * results from computing all the different possible ways to
 * group numbers and operators. The valid operators are +, - and *.
 *
 */

public class GroupNumbers {

//    public static List<Integer> diffWaysToCompute(String input) throws Exception {
//        List<Integer> results = new ArrayList<Integer>();
//
//        List<String> values = new ArrayList<>(Arrays.asList(input.split("[-+*]")));
//        values.removeAll(Arrays.asList(""));
//        System.out.println("Values = " + values);
//        if(values.size() == 0)
//            return null;
//
//        List<String> operators = new ArrayList<>(Arrays.asList(input.split("\\d+")));
//        operators.removeAll(Arrays.asList(""));
//        System.out.println("Operators = " + operators);
//
//
//        if(values.size() == 2) {
//            if(operators.size() == 1) {
//                results.add(calculate(Integer.parseInt(values.get(0)), Integer.parseInt(values.get(1)), operators.get(0)));
//            }
//            else {
//                int val1 = operators.get(0).equals("-") ? -1*Integer.parseInt(values.get(0)) : Integer.parseInt(values.get(0));
//                results.add(calculate(val1, Integer.parseInt(values.get(1)), operators.get(1)));
//            }
//            return results;
//        }
//
//        if(operators.size() > 1) {
//            int cal = calculate(Integer.parseInt(values.get(0)), Integer.parseInt(values.get(1)), operators.get(0));
//            String input1 = cal + input.substring(values.get(0).length() + operators.get(0).length() +
//                    values.get(1).length());
//            System.out.println("input1 = " + input1);
//            List<Integer> subResults1 = diffWaysToCompute(input1);
//            results.addAll(new ArrayList<Integer>(subResults1));
//        }
//
//        String input2 = input.substring(values.get(0).length() + operators.get(0).length());
//        System.out.println("input2 = " + input2);
//        List<Integer> subResults2 = diffWaysToCompute(input2);
//        for(Integer subResult : subResults2) {
//            results.add(calculate(Integer.parseInt(values.get(0)), subResult, operators.get(0)));
//        }
//        return results;
//    }

    public static List<Integer> diffWaysToComputeHelper(List<Integer> values, List<Character> operators, int index)
            throws Exception {
        List<Integer> results = new ArrayList<>();

        System.out.println("Values = " + values);
        System.out.println("Operators = " + operators);

        if(values.size() == 0)
            return null;

        if(values.size() == 1) {
            results.add(values.get(0));
            return results;
        }

        if(values.size() == 2) {
            results.add(calculate(values.get(0), values.get(1), operators.get(0)));
            return results;
        }

        int val1 = values.remove(0);
        char operator = operators.remove(0);

        // Compute values one at a time
        List<Integer> subResults = diffWaysToComputeHelper(new ArrayList<>(values), new ArrayList<>(operators), index);
        for(Integer subResult : subResults) {
            results.add(calculate(val1, subResult, operator));
        }

        // Compute values two at a time
        int val2 = values.remove(0);
        int cal = calculate(val1, val2, operator);
        values.add(0,cal);
        List<Integer> subResults1 = diffWaysToComputeHelper(new ArrayList<>(values), new ArrayList<>(operators), index);
        results.addAll(subResults1);

        return results;
    }


    public static List<Integer> compute(String input) throws Exception {
        String stringValues[] = input.split("[-+*]");
        System.out.println("Values = " + Arrays.toString(stringValues));

        String stringOperators[] = input.split("\\d+");
        System.out.println("Operators = " + Arrays.toString(stringOperators));

        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<Character> operators = new ArrayList<>();

        for(int i = 0; i < stringValues.length; i++) {
            if(!stringValues[i].equals(""))
                values.add(Integer.parseInt(stringValues[i]));
        }

        for(int i = 0; i < stringOperators.length; i++) {
            if(stringOperators[i].equals("+") || stringOperators[i].equals("-") || stringOperators[i].equals("*"))
                operators.add(stringOperators[i].charAt(0));
        }

        if(values.size() == operators.size()) {
            if(operators.get(0) == '-') {
                int val = values.remove(0);
                values.add(0,-1 * val);
            }
            operators.remove(0);
        }

        System.out.println("int values = " + values);
        System.out.println("operators = " + operators);

        if(values.size()-1 == operators.size())
            return diffWaysToComputeHelper(values, operators, 0);
        return null;

    }

    private static int calculate(int i, int j, char operator) throws Exception {
        switch (operator) {
            case '+':
                return i+j;
            case '-':
                return i-j;
            case '*':
                return i*j;
            default:
                throw new Exception("Illegal operator");
        }
    }


    public static void main(String args[]) throws Exception {
        List<Integer> results = compute("2*3-4*5");
        System.out.println(Arrays.toString(results.toArray()));
    }

}
