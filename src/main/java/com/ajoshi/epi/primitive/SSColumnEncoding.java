package com.ajoshi.epi.primitive;

/**
 * Created by ajoshi on 8/5/15.
 */
public class SSColumnEncoding {

    public static int ssDecodeColID(String s) {
        int ret = 0;
        //(26*(s.length()-1)) + s.charAt(s.length()-1) - 'A' + 1;
        for(int i = 0; i < s.length(); i++) {
            ret = ret * 26 + s.charAt(i) - 'A'  + 1;
        }
        System.out.println("Value is " + ret);
        return ret;
    }
}
