package com.ajoshi.epi.graph;

import java.util.*;

/**
 * Created by ajoshi on 9/26/15.
 */
public class Graph<T> {

    private class AdjacencyList {
        T vertex;
        AdjacencyList next;

        private AdjacencyList(T vertex) {
            this.vertex = vertex;
            this.next = null;
        }
    }

    private int edges = 0;
    private int vertices = 0;
    private HashMap<T,AdjacencyList> adjMap = new HashMap<T, AdjacencyList>();

    public Graph() {
    }

    public boolean add(T vertex) {
        if(!adjMap.containsKey(vertex)) {
            adjMap.put(vertex, null);
            vertices++;
            return true;
        } else {
            System.out.println("Vertex " + vertex + " already contained in the graph!");
            return false;
        }
    }

    public void connect(T vertex1, T vertex2) {
        if(!adjMap.containsKey(vertex1))
            add(vertex1);

        if(!adjMap.containsKey(vertex2))
            add(vertex2);

        AdjacencyList adjList = adjMap.get(vertex1);
        if(adjList == null) {
            adjList = new AdjacencyList(vertex2);
        }
        else {
            AdjacencyList itr = adjList;
            while(itr.next != null)
                itr = itr.next;
            itr.next = new AdjacencyList(vertex2);
        }
        adjMap.put(vertex1, adjList);

        adjList = adjMap.get(vertex2);
        if(adjList == null) {
            adjList = new AdjacencyList(vertex1);
        }
        else {
            AdjacencyList itr = adjList;
            while(itr.next != null)
                itr = itr.next;
            itr.next = new AdjacencyList(vertex1);
        }
        adjMap.put(vertex2, adjList);
        edges++;
    }

    public void printAdjList() {
        System.out.println("\nPrinting Adjacency List");
        for (Map.Entry<T, AdjacencyList> entry : adjMap.entrySet()) {
            T key = entry.getKey();
            AdjacencyList value = entry.getValue();
            System.out.println("Key:" + key);
            while(value!=null) {
                System.out.print(value.vertex + " -> ");
                value = value.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }

    public int getVertexSize() {
        return vertices;
    }

    public int getEdgeSize() {
        return edges;
    }

    public ArrayList<T> getAdjacencyList(T vertex) {
        AdjacencyList adjList =  adjMap.get(vertex);
        ArrayList<T> result = new ArrayList<T>();
        while(adjList!= null) {
            result.add(adjList.vertex);
            adjList = adjList.next;
        }
        return result;
    }



}
