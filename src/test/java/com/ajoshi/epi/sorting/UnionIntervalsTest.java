package com.ajoshi.epi.sorting;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UnionIntervalsTest {

    @Test
    public void testCreateUnionOfIntervals() throws Exception {
        ArrayList<UnionIntervals.Interval> intervals = new ArrayList<UnionIntervals.Interval>();
        intervals.add(new UnionIntervals.Interval(16,17,false,false));
        intervals.add(new UnionIntervals.Interval(13,15,false,false));
        intervals.add(new UnionIntervals.Interval(8,11,true,false));
        intervals.add(new UnionIntervals.Interval(2,4,true,true));

        intervals.add(new UnionIntervals.Interval(1,1,true,true));
        intervals.add(new UnionIntervals.Interval(3,4,true,false));
        intervals.add(new UnionIntervals.Interval(12,16,false,true));
        intervals.add(new UnionIntervals.Interval(7,8,true,false));

        intervals.add(new UnionIntervals.Interval(9,11,false,true));
        intervals.add(new UnionIntervals.Interval(0,3,false,false));
        intervals.add(new UnionIntervals.Interval(5,7,true, false));
        intervals.add(new UnionIntervals.Interval(12,14,true, true));

        ArrayList<UnionIntervals.Interval> results =  UnionIntervals.createUnionOfIntervals(intervals);

        for(UnionIntervals.Interval interval : results) {
            if(interval.x1_included)
                System.out.print("[");
            else
                System.out.print("(");

            System.out.print(interval.x1 + "," + interval.x2);

            if(interval.x2_included)
                System.out.print("]");
            else
                System.out.print(")");
        }




    }
}