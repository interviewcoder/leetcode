/**
 * Time : O() ; Space: O()
 * @tag : Breadth-first Search; Depth-first Search; Graph; Topological Sort
 * @by  : Steven Cooks
 * @date: Sep 14, 2015
 ***************************************************************************
 * Description:
 * 
 * There are a total of n courses you have to take, labeled from 0 to n - 1. 
 * 
 * Some courses may have prerequisites, for example to take course 0 you have 
 * to first take course 1, which is expressed as a pair: [0,1] 
 * 
 * Given the total number of courses and a list of prerequisite pairs, return 
 * the ordering of courses you should take to finish all courses. 
 * 
 * There may be multiple correct orders, you just need to return one of them. 
 * If it is impossible to finish all courses, return an empty array.
 * 
 
 * 
 * For example: 2, [[1,0]] 
 * There are a total of 2 courses to take. To take course 1 you should have 
 * finished course 0. So the correct course order is [0,1] 
 * 
 * 4, [[1,0],[2,0],[3,1],[3,2]] 
 * There are a total of 4 courses to take. To take course 3 you should have 
 * finished both courses 1 and 2. Both courses 1 and 2 should be taken after 
 * you finished course 0. So one correct course order is [0,1,2,3]. 
 * Another correct ordering is[0,2,1,3]. 
 * 
 * Note: The input prerequisites is a graph represented by a list of edges, 
 * not adjacency matrices. Read more about how a graph is represented.
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
