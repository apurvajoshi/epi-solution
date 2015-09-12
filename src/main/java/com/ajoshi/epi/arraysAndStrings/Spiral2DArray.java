package com.ajoshi.epi.arraysAndStrings;

/**
 * Created by ajoshi on 8/14/15.
 */
public class Spiral2DArray {

    public static void printSprial2DArray(int[][] a) {
        int n = a.length * (a[0].length);
        System.out.println("row = " + a.length);
        System.out.println("Column = " + a[0].length);
        int i = 0;
        int direction = 0;
        int x = 0;
        int y = 0;
        int w = a[0].length;
        int h = a.length - 1;

        while(i < n) {
            switch(direction) {
                case 0:
                    //System.out.println("Case 0 ");
                    //System.out.println("X = " + x + " Y = " + y);
                    for(int j = 0; j < w; j++) {
                        System.out.println(a[x][y+j] + " ");
                        i++;
                    }
                    y += w -1;
                    x++; w--; direction++;
                    break;

                case 1:
                    //System.out.println("Case 1 ");
                    //System.out.println("X = " + x + " Y = " + y);
                    for(int j = 0; j < h; j++) {
                        System.out.println(a[x+j][y] + " ");
                        i++;
                    }
                    x += h-1;
                    y--; h--; direction++;
                    break;

                case 2:
                    //System.out.println("Case 2 ");
                    //System.out.println("X = " + x + " Y = " + y);
                    for(int j = 0; j < w; j++) {
                        System.out.println(a[x][y - j] + " ");
                        i++;
                    }
                    y -= w-1;
                    x--; w--; direction++;
                    break;

                case 3:
                    //System.out.println("Case 3 ");
                    //System.out.println("X = " + x + " Y = " + y);
                    for(int j = 0; j < h; j++) {
                        System.out.println(a[x-j][y] + " ");
                        i++;
                    }
                    x -= h-1;
                    y++; h--; direction = 0;
                    break;
            }
        }
    }
}
