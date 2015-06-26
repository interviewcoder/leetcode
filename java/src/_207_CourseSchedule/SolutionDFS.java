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

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1. how to construct a topological graph 
 * 2. how to check if there is a cycle in topological graph using DFS 
 * 3. use memo to speed program
 * see also {@link _207_CourseSchedule.Solution BFS version solution}
 */
public class SolutionDFS {
    
    /** <Course, Prerequisites for this course> */
    private Map<Integer, Set<Integer>> preMap = new HashMap<>();
    
    /** whether we have visited course i in current checking for cycle */
    private boolean[] visited;
    
    /** memo. cycleChecked[i] = true, means we have checked whether there is a cycle from
     *  course i, and the checking result is no such cycle exists. */
    private boolean[] cycleChecked;
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // initialization
        visited = new boolean[numCourses];
        cycleChecked = new boolean[numCourses];

        // construct map
        preMap = constructMap(prerequisites);

        // check cycle using DFS
        for (int i = 0; i < numCourses; i++) {
            if (hasCycleFrom(i)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasCycleFrom(int i) {
        if (cycleChecked[i] || !preMap.containsKey(i)) {
            // we checked cycle or this course requires no prerequisites
            return false;
        } else if (visited[i]) {
            // cycle found
            return true;
        } else {
            visited[i] = true;
            for (int request : preMap.get(i)) {
                if (hasCycleFrom(request)) {
                    return true;
                }
            }
            visited[i] = false;
            // save checking result for later use
            cycleChecked[i] = true;
            return false;
        }
    }

    private Map<Integer, Set<Integer>> constructMap(int[][] prerequisites) {
        // <Course, Prerequisites for this course>
        // i.e. if you want to take course, you must take all prerequisites before.
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] is : prerequisites) {
            int course = is[0];
            int request = is[1];
            if (map.containsKey(course)) {
                map.get(course).add(request);
            } else {
                map.put(course, new HashSet<>(Arrays.asList(request)));
            }
        }
        return map;
    }

}
