package com.ajoshi.epi.IFTTT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ajoshi on 11/6/15.
 */
public class Scheduling {



    public static class Person {
        private String name;
        private int id;
        public Person(int id) {
            this.id = id;
        }
    }

    public static class Pair {
        private Person p1;
        private Person p2;

        public Pair(Person p1, Person p2) {
            this.p1 = p1;
            this.p2 = p2;
        }
    }


    public static ArrayList<Pair> createPairs(ArrayList<Person> personList) {

        ArrayList<Pair> results = new ArrayList<>();

        for(int i = 1; i <= personList.size(); i++) {
            for(int j = i+1; j <= personList.size(); j++) {
                results.add(new Pair(new Person(i), new Person(j)));
            }
        }
        return results;
    }

    public static void print(ArrayList<Pair> results) {
        for (Pair pair : results) {
            System.out.println(pair.p1.id + " - > " + pair.p2.id);
        }
    }


    public static HashMap<Integer, ArrayList<Pair>> schedule(ArrayList<Pair> pairs) {

        int currentUser = pairs.get(0).p1.id;
        int day = 0;
        HashMap<Integer, ArrayList<Pair>> results = new HashMap<>();

        for(Pair pair : pairs) {
            if(pair.p1.id == currentUser)
                day++;
            else
                day = 1;

            ArrayList<Pair> schedule = null;
            if(!results.containsKey(day)) {
                schedule = new ArrayList<>();
                schedule.add(pair);
            }
            else {
                schedule = results.get(day);
                schedule.add(pair);
            }
            results.put(day, schedule);
        }
        return results;
    }


    public static void main(String args[]) {

        ArrayList<Person> personList = new ArrayList<>();

        for(int i = 1; i <= 20; i++)
            personList.add(new Person(i));

        ArrayList<Pair> results = createPairs(personList);
        print(results);
        HashMap<Integer, ArrayList<Pair>> schedule = schedule(results);
        for(Map.Entry<Integer, ArrayList<Pair>> entry :  schedule.entrySet()) {
            System.out.println("Day = " + entry.getKey());
            for(Pair p : entry.getValue())
                System.out.println("Schedule = " + p.p1.id + " ->" + p.p2.id);
        }
    }

}
