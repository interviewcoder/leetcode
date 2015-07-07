/**
 * Time : O(); Space : O()
 * @tag : Array; Sort
 * @by  : Steven Cooks
 * @date: Jul 7, 2015
 *******************************************************************************
 * Description: 
 * 
 * Given a set of non-overlapping intervals, insert a new interval into 
 * the intervals (merge if necessary). 
 * 
 * You may assume that the intervals were initially sorted according to 
 * their start times. 
 * 
 * Example 1: 
 * Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9]. 
 * 
 * Example 2: 
 * Given [1,2],[3,5],[6,7],[8,10],[12,16],
 * insert and merge [4,9] in as [1,2],[3,10],[12,16]. 
 * 
 * This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/insert-interval/ }
 */
package _057_InsertInterval;

import java.util.List;

import com.leetcode.Interval;

/** see test {@link _057_InsertInterval.SolutionTest } */
public class Solution {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if (intervals.size() == 0) {
            intervals.add(newInterval);
            return intervals;
        }
        // find the interval overlaps with newInterval
        int index = -1;
        for (int i = 0; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            int is = interval.start;
            int ie = interval.end;
            int ns = newInterval.start;
            int ne = newInterval.end;
            if (ne < is) {
                // ns  ne   is  ie
                // [    ] |
                //        | [    ]
                // insert newInterval before current interval 
                intervals.add(i, newInterval);
                return intervals;
            } else if (ns <= is) {
                // ns  is    ne  ie      ns  is  ie  ne
                // [      |  ]       or  [     |     ]
                //      [ |       ]          [ |  ]
                if (is <= ne &&  ne <= ie) {
                    interval.start = ns;
                    interval.end = ie;
                } else if (is <= ie && ie <= ne) {
                    interval.start = ns;
                    interval.end = ne;
                }
                index = i;
                break;
            } else if (ie >= ns) {
                // is  ns   ne  ie       is  ns   ie   ne
                // [      |      ]  or   [      |  ]
                //     [  |  ]                [ |      ]
                if (ne <= ie) {
                    // newInterval is included by this interval
                    return intervals;
                } else {
                    interval.end = newInterval.end;
                    index = i;
                    break;
                }
            }
        }
        if (index != -1) {
            // merge overlapping intervals from index
            for (int i = index; i < intervals.size() - 1; i++) {
                Interval i1 = intervals.get(i);
                Interval i2 = intervals.get(i + 1);
                if (i2.start > i1.end) {
                    // no overlapping any more
                    break;
                } else {
                    // overlapping
                    if (i2.end > i1.end) {
                        // i2 ends after i1 ends
                        i1.end = i2.end;
                    }
                    intervals.remove(i + 1);
                    i--;
                }
            }
        } else {
            // insert newInterval at the end of list
            intervals.add(newInterval);
        }
        return intervals;
    }

}
