/**
 * Time : O(NlgN) ; Space: O(1)
 * @tag : Sort
 * @by  : Steven Cooks
 * @date: Sep 26, 2015
 ***************************************************************************
 * Description:
 * 
 * Given an array of meeting time intervals consisting of start and end times 
 * [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings. 
 * 
 * For example, 
 * Given [[0, 30],[5, 10],[15, 20]], 
 * return false.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/meeting-rooms/ }
 */
package _252_MeetingRooms;

import java.util.Arrays;
import java.util.Comparator;

import com.leetcode.Interval;

/** see test {@link _252_MeetingRooms.SolutionTest } */
public class Solution {

    public boolean canAttendMeetings(Interval[] intervals) {
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                return i1.start != i2.start ? i1.start - i2.start : i1.end - i2.end;
            }
        });
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start < intervals[i - 1].end) {
                return false;
            }
        }
        return true;
    }

}
