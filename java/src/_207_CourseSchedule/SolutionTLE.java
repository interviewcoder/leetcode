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

public class SolutionTLE {
    
    private Map<Integer, Set<Integer>> preMap = new HashMap<>();
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // construct prerequisites map
        preMap = constructPrerequisiteMap(prerequisites);
        for (int i = 0; i < numCourses; i++) {
            // able to take course i ?
            if (preMap.containsKey(i)) {
                // able to meet all prerequisites?
                Set<Integer> visited = new HashSet<>();
                visited.add(i);
                for (int request : preMap.get(i)) {
                    if (!canMeetRequest(i, request, visited)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean canMeetRequest(int course, int request, Set<Integer> visited) {
        // base case
        if (!preMap.containsKey(request)) {
            // no pre-request course for this requested course
            return true;
        } else if (visited.contains(request)) {
            // cycle appears
            return false;
        } else {
            visited.add(request);
            // recursive case
            for (int req : preMap.get(request)) {
                if (!canMeetRequest(course, req, visited)) {
                    return false;
                }
            }
            return true;
        }
    }

    private Map<Integer, Set<Integer>> constructPrerequisiteMap(
            int[][] prerequisites) {
        Map<Integer, Set<Integer>> preMap = new HashMap<>();
        for (int[] requisites : prerequisites) {
            int course = requisites[0];
            int request = requisites[1];
            if (preMap.containsKey(course)) {
                preMap.get(course).add(request);
            } else {
                preMap.put(course, new HashSet<>(Arrays.asList(request)));
            }
        }
        return preMap;
    }
}
