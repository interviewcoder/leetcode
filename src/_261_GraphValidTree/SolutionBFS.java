/**
 * Time : O() ; Space: O()
 * @tag : Depth-first Search; Breadth-first Search; Graph; Union Find
 * @by  : Steven Cooks
 * @date: Sep 26, 2015
 ***************************************************************************
 * Description:
 * 
 * Given n nodes labeled from 0 to n - 1 and a list of undirected edges 
 * (each edge is a pair of nodes), write a function to check whether these 
 * edges make up a valid tree. 
 * 
 * For example: 
 * Given n = 5 and edges = [[0, 1], [0, 2], [0, 3], [1, 4]], return true. 
 * Given n = 5 and edges = [[0, 1], [1, 2], [2, 3], [1, 3], [1, 4]], return false.
 * 
 * Note: you can assume that no duplicate edges will appear in edges. 
 * Since all edges are undirected, [0, 1] is the same as [1, 0] and thus will 
 * not appear together in edges.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/graph-valid-tree/ }
 */
package _261_GraphValidTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/** see test {@link _261_GraphValidTree.SolutionBFSTest } */
public class SolutionBFS {

    public boolean validTree(int n, int[][] edges) {
        Map<Integer, Set<Integer>> adjs = new HashMap<>();
        // initialize adjacent lists
        for (int i = 0; i < n; i++) {
            adjs.put(i, new HashSet<>());
        }
        // construct adjacent lists
        for (int i = 0; i < edges.length; i++) {
            adjs.get(edges[i][0]).add(edges[i][1]);
            adjs.get(edges[i][1]).add(edges[i][0]);
        }
        // bfs search
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(0);
        visited.add(0);
        while (!queue.isEmpty()) {
            int num = queue.poll();
            for (int adj : adjs.get(num)) {
                if (visited.contains(adj)) {
                    return false;
                }
                visited.add(adj);
                queue.add(adj);
                adjs.get(adj).remove(num);
            }
        }
        return visited.size() == n;
    }

}
