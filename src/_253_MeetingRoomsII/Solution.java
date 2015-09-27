/**
 * Time : O() ; Space: O()
 * @tag : Heap; Greedy; Sort
 * @by  : Steven Cooks
 * @date: Sep 26, 2015
 ***************************************************************************
 * Description:
 * 
 * Given an array of meeting time intervals consisting of start and end 
 * times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference 
 * rooms required. 
 * 
 * For example, 
 * 
 * Given [[0, 30],[5, 10],[15, 20]], return 2.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/meeting-rooms-ii/ }
 */
package _253_MeetingRoomsII;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import com.leetcode.Interval;

/** see test {@link _253_MeetingRoomsII.SolutionTest } */
public class Solution {
    
    private static final int START = 1;

    private static final int END = 0;
    
    private class Event {
        int time;
        int type; // end event is 0; start event is 1

        public Event(int time, int type) {
            this.time = time;
            this.type = type;
        }
    }
    
    public int minMeetingRooms(Interval[] intervals) {
        int rooms = 0; // occupied meeting rooms
        int res = 0;

        // initialize an event queue based on event's happening time
        Queue<Event> events = new PriorityQueue<>(new Comparator<Event>() {
            @Override
            public int compare(Event e1, Event e2) {
                // for same time, let END event happens first to save rooms
                return e1.time != e2.time ? e1.time - e2.time : e1.type - e2.type;
            }
        });

        // create event and push into event queue
        for (Interval interval : intervals) {
            events.offer(new Event(interval.start, START));
            events.offer(new Event(interval.end, END));
        }
        
        // process events
        while (!events.isEmpty()) {
            Event event = events.poll();
            if (event.type == START) {
                rooms++;
                res = Math.max(res, rooms);
            } else {
                rooms--; 
            }
        }
        
        return res;
    }

}
