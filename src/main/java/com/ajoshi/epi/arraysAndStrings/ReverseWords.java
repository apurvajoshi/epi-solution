package com.ajoshi.epi.arraysAndStrings;

/**
 * Created by ajoshi on 10/16/15.
 */
public class ReverseWords {
    public static void main(String[] args) {
        String input = "Today   is        Friday";
        System.out.println(reverseSentence(input));
    }

    public static String reverseSentence(String input) {
        char[] reverse = reverseWord(input).toCharArray();
        int startIndex = 0;
        for(int i = 0; i <= reverse.length; i++) {
            if(i == reverse.length || reverse[i] == ' ' ) {
                for(int j = 0 ; j < (i-startIndex)/2; j++) {
                    char temp = reverse[j+startIndex];
                    reverse[j+startIndex] = reverse[i-1-j];
                    reverse[i-1-j] = temp;
                }
                startIndex = i+1;
            }
        }
        return new String(reverse);
    }

    public static String reverseWord(String s) {
        char[] cArray = s.toCharArray();
        for(int i =0 ; i < cArray.length/2; i++) {
            char temp = cArray[i];
            cArray[i] = cArray[cArray.length-1-i];
            cArray[cArray.length-1-i] = temp;
        }
        return new String(cArray);
    }
}
