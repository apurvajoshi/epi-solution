package com.ajoshi.epi.dynamicProgramming;

/**
 * Created by ajoshi on 9/18/15.
 */
public class LCS {

    private static int[][]m;

    public static int findLCS(String s1, String s2) {
        m = new int[s1.length()+1][s2.length()+1];

        for(int i = 1; i <= s1.length(); i++) {
            for(int j = 1; j <= s2.length(); j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    m[i][j] = m[i-1][j-1] + 1;
                }
                else {
                    m[i][j] = Math.max(m[i][j-1], m[i-1][j]);
                }
            }
        }
        return m[s1.length()][s2.length()];
    }

    public static String backtrackLCS(String s1, String s2, int i, int j) {
        if(i==0 || j==0)
            return "";

        if(s1.charAt(i-1) == s2.charAt(j-1))
            return backtrackLCS(s1,s2,i-1,j-1) + s1.charAt(i-1);
        else{
            if(m[i][j-1] > m[i-1][j])
                return backtrackLCS(s1,s2,i,j-1);
            else
                return backtrackLCS(s1,s2,i-1,j);
        }
    }
}
