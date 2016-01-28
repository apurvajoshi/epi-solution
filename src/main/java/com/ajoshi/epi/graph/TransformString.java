package com.ajoshi.epi.graph;

import java.util.*;

/**
 * Created by ajoshi on 9/26/15.
 */
public class TransformString {

    public static boolean tranform(String from, String to, String[] dictionary) {
        Graph<String> g = createGraph(dictionary);
        //g.printAdjList();
        return bfsTraversal(g,from ,to);
    }

    private static Graph<String> createGraph(String[] dictionary) {
        Graph<String> g = new Graph<String>();
        for(int i = 0; i < dictionary.length; i++) {
            g.add(dictionary[i]);
        }
        for(int i = 0; i < dictionary.length; i++) {
            for(int j = i+1; j < dictionary.length; j++) {
                if(!dictionary[i].equals(dictionary[j])) {
                    if(calculateDegreeOfSeparation(dictionary[i], dictionary[j]) == 1) {
                        g.connect(dictionary[i], dictionary[j]);
                    }
                }
            }
        }
        return g;
    }

    private static int calculateDegreeOfSeparation(String string1, String string2) {
        if(string1.length() != string2.length())
            return -1;
        int degreeOfSeparation = 0;
        for(int i = 0; i < string1.length(); i++) {
            if(string1.charAt(i) != string2.charAt(i))
                degreeOfSeparation++;
        }
        return degreeOfSeparation;
    }

    private static boolean bfsTraversal(Graph<String> g, String from, String to) {
        HashSet<String> discovered = new HashSet<String>();
        Queue<String> queue = new LinkedList<String>();
        HashMap<String, String> parent = new HashMap<String, String>();
        discovered.add(from);
        queue.add(from);
        parent.put(from, null);

        while(!queue.isEmpty()) {
            String str = queue.remove();
            if(str.equals(to)) {
                printPath(parent, to);
                return true;
            }

            ArrayList<String> list = g.getAdjacencyList(str);
            for(String adj : list) {
                if(!discovered.contains(adj)) {
                    discovered.add(adj);
                    parent.put(adj,str);
                    queue.add(adj);
                }
            }
        }
        return false;
    }

    private static void printPath(HashMap<String, String> parent, String to) {
        System.out.println("Printing path");
        while(parent.get(to) != null) {
            System.out.print(to + " <- ");
            to = parent.get(to);
        }
        System.out.println(to);
    }

    public static void main(String[] args) {
        String[] dictionary = {"dog","pog","log","dol","dad","mad","bur","dug","mod","cod","cud","san","dom","sar","lur",
                "car","lug","cur","cag","dod","rag"};

        System.out.println(TransformString.tranform("car","dog",dictionary));
    }
}
