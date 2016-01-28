package com.ajoshi.epi.sorting;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ajoshi on 10/26/15.
 */
public class UnionIntervals {

    public static class Interval implements Comparable<Interval> {
        int x1;
        int x2;
        boolean x1_included;
        boolean x2_included;

        public Interval(int x1, int x2,
              boolean x1_included, boolean x2_included) {
            this.x1 = x1;
            this.x2 = x2;
            this.x1_included = x1_included;
            this.x2_included = x2_included;
        }


        public Interval(Interval o) {
            this.x1 = o.x1;
            this.x2 = o.x2;
            this.x1_included = o.x1_included;
            this.x2_included = o.x2_included;
        }

        public int compareTo(Interval o) {
            if(this.x1 > o.x1)
                return 1;
            else if(this.x1 == o.x1)
                return 0;
            else
                return -1;
        }
    }

    public static ArrayList<Interval> createUnionOfIntervals(ArrayList<Interval> intervals) {
        Collections.sort(intervals);

        ArrayList<Interval> results = new ArrayList<Interval>();
        Interval union = new Interval(intervals.get(0));

        for(int i = 1; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);

            if(interval.x1 <= union.x2) {
                // Interval intersects with union
                if(interval.x2 > union.x2) {
                    union.x2 = interval.x2;
                    union.x2_included = interval.x2_included;
                } else if (interval.x2 == union.x2 && !union.x2_included) {
                    union.x2_included = interval.x2_included;
                } else if (interval.x1 == union.x1 && !union.x1_included) {
                    union.x1_included = interval.x1_included;
                }
            } else if (interval.x1 > union.x2) {
                // Start a new interval
                results.add(union);
                union = new Interval(interval);
            }
        }

        if(intervals.get(intervals.size()-1).x1 <= union.x2)
            results.add(union);

        return results;
    }
}
