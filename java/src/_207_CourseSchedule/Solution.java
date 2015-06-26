/**
 * Time : O(); Space : O()
 * @tag : Depth-first Search; Breadth-first Search; Graph; Topological Sort
 * @by  : Steven Cooks
 * @date: Jun 26, 2015
 *************************************************************************
 * Description: 
 * 
 * There are a total of n courses you have to take, labeled from 0 to n - 1. 
 * Some courses may have prerequisites, for example to take course 0 you have to
 * first take course 1, which is expressed as a pair: [0,1] 
 * 
 * Given the total number of courses and a list of prerequisite pairs, 
 * is it possible for you to finish all courses? 
 * 
 * For example: 
 * 
 *      2, [[1,0]] 
 * There are a total of 2 courses to take. To take course 1 you should have 
 * finished course 0. So it is possible. 
 * 
 *      2, [[1,0],[0,1]] 
 * There are a total of 2 courses to take. To take course 1 you should have 
 * finished course 0, and to take course 0 you should also have finished 
 * course 1. So it is impossible.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/course-schedule/ }
 */
package _207_CourseSchedule;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/** see also {@link _207_CourseSchedule.SolutionDFS DFS version solution } */
public class Solution {

    /*
     * 1. construct topological graph 2. count in-degrees for each node 3. for
     * zero in-degree nodes, put them to queue 4. BFS search if all nodes become
     * zero in-degree
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // initialize graph
        List<Set<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new HashSet<>());
        }
        // construct graph and count in-degrees for each node
        int[] indegrees = new int[numCourses];
        for (int[] is : prerequisites) {
            if (graph.get(is[0]).add(is[1])) {
                // !avoid duplicates. Alternatively, make graph List<List<Integer>>
                indegrees[is[1]]++;
            }
        }
        // push all 0 in-degree nodes into queue
        int count = 0;
        Queue<Integer> zeros = new LinkedList<>();
        for (int i = 0; i < indegrees.length; i++) {
            if (indegrees[i] == 0) {
                zeros.add(i);
                count++;
            }
        }

        // BFS
        while (!zeros.isEmpty()) {
            int course = zeros.poll();
            for (int request : graph.get(course)) {
                // count down in-degree for this prerequisite by one
                // and then if it is zero
                indegrees[request]--;
                if (indegrees[request] == 0) {
                    zeros.add(request);
                    count++;
                }
            }
        }
        return count == numCourses;
    }

}
