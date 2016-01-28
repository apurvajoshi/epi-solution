package com.ajoshi.epi.graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


/**
 * Created by ajoshi on 10/15/15.
 */
public class PaintMatrix {

    private static class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void paintBooleanMatrix(int[][] A, int x, int y) {
        Queue<Point> queue = new LinkedList<Point>();
        int[][] discovered = new int[A.length][A[0].length];
        queue.add(new Point(x,y));
        while(!queue.isEmpty()) {
            Point u = queue.remove();

            for(Point p : getAdjacent(A, u)) {
                if(discovered[p.x][p.y] == 0) {
                    discovered[p.x][p.y] = 1;
                    queue.add(p);
                }
            }
            A[u.x][u.y] = A[u.x][u.y] == 0 ? 1 : 0;
        }
    }

    private static ArrayList<Point> getAdjacent(int[][] a, Point u) {
        ArrayList<Point> neighbors = new ArrayList<Point>();
        if(u.x != 0 && a[u.x][u.y] == a[u.x-1][u.y])
            neighbors.add(new Point(u.x-1,u.y));

        if(u.x != a.length-1 && a[u.x][u.y] == a[u.x+1][u.y])
            neighbors.add(new Point(u.x+1,u.y));

        if(u.y != 0 && a[u.x][u.y] == a[u.x][u.y-1])
            neighbors.add(new Point(u.x,u.y-1));

        if(u.y != a.length-1 && a[u.x][u.y] == a[u.x][u.y+1])
            neighbors.add(new Point(u.x,u.y+1));

        return neighbors;
    }

    public static void paintBooleanMatrixEfficient(int[][] A, int x, int y) {
        Queue<Point> queue = new LinkedList<Point>();
        int color = A[x][y];
        A[x][y] = A[x][y] == 0 ? 1 : 0;
        queue.add(new Point(x,y));

        while(!queue.isEmpty()) {
            Point u = queue.remove();
            for(Point p : getAdjacentEfficient(A, u, color)) {
                A[p.x][p.y] = A[p.x][p.y] == 0 ? 1 : 0;
                queue.add(p);
            }
        }
    }



    private static ArrayList<Point> getAdjacentEfficient(int[][] a, Point u, int color) {
        ArrayList<Point> neighbors = new ArrayList<Point>();
        if(u.x != 0 && a[u.x-1][u.y] == color)
            neighbors.add(new Point(u.x-1,u.y));

        if(u.x != a.length-1 && a[u.x+1][u.y] == color)
            neighbors.add(new Point(u.x+1,u.y));

        if(u.y != 0 && a[u.x][u.y-1] == color)
            neighbors.add(new Point(u.x,u.y-1));

        if(u.y != a.length-1 && a[u.x][u.y+1] == color)
            neighbors.add(new Point(u.x,u.y+1));

        return neighbors;
    }
}
