/**
 * Time : O() ; Space: O()
 * @tag : 
 * @by  : Steven Cooks
 * @date: Sep 14, 2015
 ***************************************************************************
 * Description:
 *
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/course-schedule-ii/ }
 */
package _210_CourseScheduleII;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/** see test {@link _210_CourseScheduleII.SolutionTest } */
public class Solution {
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // for each course in the map nextVertex, the corresponding set contains prerequisite courses for this course 
        Map<Integer, Set<Integer>> nextVertex = new HashMap<>();
        // preVertex[i] indicates the number of courses that depend on course i
        int[] preVertex = new int[numCourses];

        // set up nextVertex and preVertex
        for (int i = 0; i < prerequisites.length; i++) {
            if (!nextVertex.containsKey(prerequisites[i][0])) {
                nextVertex.put(prerequisites[i][0], new HashSet<>());
            }

            if (nextVertex.get(prerequisites[i][0]).add(prerequisites[i][1])) {
                preVertex[prerequisites[i][1]]++;
            }
        }

        // queue for BFS, which will only hold courses currently upon which no other courses depend
        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < preVertex.length; i++) {
            // start from courses upon which no other courses depend. These courses should come last in the order list
            if (preVertex[i] == 0) {
                queue.offerLast(i);
            }
        }

        // array for the result, which will be filled up from the end by index
        int[] res = new int[numCourses];
        int index = res.length - 1;

        while (!queue.isEmpty()) {
            int key = queue.pollFirst(); // this is a course that no other courses will depend upon
            res[index--] = key;          // so we put it at the end of the order list

            // since we are done with course "key", for any other course that course "key" is dependent on, we can decrease
            // the corrresponding preVertex by one and check if it is qualified to be added to the queue.
            if (nextVertex.containsKey(key)) {
                for (int i : nextVertex.get(key)) {
                    if (--preVertex[i] == 0) {
                        queue.offerLast(i);
                    }
                }
            }

            --numCourses; // we are done with course "key", so reduce the remaining number of courses by 1
        }

        // if the remaining number of courses is not zero, then we cannot complete all the courses; otherwise return the result
        return numCourses == 0 ? res : new int[0];
    }

}
