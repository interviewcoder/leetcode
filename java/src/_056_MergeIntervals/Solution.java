/**
 * Time : O(); Space: O()
 * @tag : Array; Sort
 * @by  : Steven Cooks
 * @date: Jul 7, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a collection of intervals, merge all overlapping intervals. 
 * 
 * For example, 
 * Given [1,3],[2,6],[8,10],[15,18], 
 * return [1,6],[8,10],[15,18].
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/merge-intervals/ }
 */
package _056_MergeIntervals;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.leetcode.Interval;

/** see test {@link _056_MergeIntervals.SolutionTest } */
public class Solution {

    public List<Interval> merge(List<Interval> intervals) {
        
        // sort interval by interval's start
        Collections.sort(intervals, new Comparator<Interval>() {

            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start != o2.start) {
                    return o1.start - o2.start;
                } else {
                    return o1.end - o2.end;
                }
            }

        });
        
        for (int i = 0; i < intervals.size() - 1; i++) {
            Interval i1 = intervals.get(i);
            Interval i2 = intervals.get(i + 1);
            int s2 = i2.start;
            int s1 = i1.start;
            int e1 = i1.end;
            int e2 = i2.end;
            // i1 starts before i2
            if (s2 <= e1) {
                // i1 and i2 are overlapping
                if (s2 <= e1 && e1 <= e2) {
                    // i2 ends after i1 ends
                    i2.start = s1;
                    i2.end = e2;
                } else if (s2 <= e2 && e2 <= e1) {
                    // i2 ends before i1 ends
                    i2.start = s1;
                    i2.end = e1;
                }
                intervals.remove(i);
                i--;
            }
        }
        
        return intervals;
    }
}
