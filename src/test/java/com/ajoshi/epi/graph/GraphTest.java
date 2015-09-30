package com.ajoshi.epi.graph;
import org.junit.Test;

import java.util.ArrayList;

public class GraphTest {

    @Test
    public void testGraph() throws Exception {
        Graph<String> graph = new Graph<String>();
        graph.add("dog");
        graph.add("log");
        graph.add("cog");
        graph.add("car");
        graph.add("tar");
        graph.add("cat");
        graph.add("pat");


        graph.connect("dog", "log");
        graph.connect("dog", "cog");

        graph.connect("car","tar");
        graph.connect("cat","pat");

        System.out.println(graph.getVertexSize());
        System.out.println(graph.getEdgeSize());
        graph.printAdjList();

        ArrayList<String> result = graph.getAdjacencyList("car");
        result.add("lololol");

        graph.printAdjList();



    }

}