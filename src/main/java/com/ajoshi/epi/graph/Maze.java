package com.ajoshi.epi.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * Created by ajoshi on 9/29/15.
 */
public class Maze {

    private static class Label {
        int i;
        int j;
        int value;

        public Label(int i, int j, int value) {
            this.i = i;
            this.j = j;
            this.value = value;
        }
    }

    private static HashSet<Label> discovered = new HashSet<Label>();
    private static HashMap<Label, Label> parent = new HashMap<Label, Label>();

    public static boolean solveMaze(int[][] a) {
        Label[][] maze = convertIntoLabel(a);
        Graph<Label> g = modelIntoGraph(maze);
        return dfsTraversal(g, maze[0][0], maze[a.length-1][a[0].length-1]);
    }

    private static Graph<Label> modelIntoGraph(Label [][] a) {
        Graph<Label> g = new Graph<Label>();

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                if(a[i][j].value == 0) {
                    g.add(a[i][j]);

                    if(i-1 >= 0 && a[i-1][j].value == 0)
                        g.connect(a[i-1][j], a[i][j]);

                    if(j-1 >= 0 && a[i][j-1].value == 0)
                        g.connect(a[i][j-1], a[i][j]);
                }
            }
        }
        return g;
    }


    private static Label[][] convertIntoLabel(int[][] a) {
        Label[][] l = new Label[a.length][a[0].length];

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                l[i][j] = new Label(i,j,a[i][j]);
            }
        }

        return l;
    }

    private static boolean dfsTraversal(Graph<Label> g, Label start, Label end) {
        discovered.add(start);
        if(start == end) {
            printPath(parent, end);
            return true;
        }

        ArrayList<Label> adjNodes = g.getAdjacencyList(start);
        for(Label adjNode : adjNodes) {
            if(!discovered.contains(adjNode)) {
                parent.put(adjNode, start);
                if(dfsTraversal(g,adjNode, end))
                    return true;
            }
        }

        return false;
    }

    private static void printPath(HashMap<Label, Label> parent, Label end) {
        System.out.println("Printing path");
        while(end != null) {
            System.out.print("[" + end.i+ "]["+ end.j+"]("+end.value+")  <- ");
            end = parent.get(end);
        }
        System.out.println();
    }
}