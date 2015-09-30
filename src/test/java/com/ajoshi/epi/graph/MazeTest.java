package com.ajoshi.epi.graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class MazeTest {

    @Test
    public void testSolveMaze() throws Exception {
        int[][] a = {
                     {0,1,0},
                     {0,0,0},
                     {1,1,0}
                    };
        System.out.println(Maze.solveMaze(a));

        int[][] b = {
                {0,1,1,0,0},
                {0,0,0,0,1},
                {0,0,1,0,0},
                {1,0,0,0,0},
        };

        System.out.println(Maze.solveMaze(b));

    }
}