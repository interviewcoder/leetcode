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

import java.util.Arrays;

/** see test {@link _261_GraphValidTree.SolutionTest } */
public class Solution {

    private int[] id;

    public boolean validTree(int n, int[][] edges) {
        id = new int[n];
        Arrays.fill(id, -1);

        // union-find
        for (int[] edge : edges) {
            int parent = edge[0];
            int child = edge[1];
            if (isConnected(parent, child)) {
                return false;
            }
            // union
            id[child] = parent;
        }

        // because no duplicated edges exist
        return edges.length == n - 1;
    }

    private boolean isConnected(int parent, int child) {
        return root(parent) == root(child);
    }

    private int root(int node) {
        if (id[node] == -1) {
            return node;
        }
        return root(id[node]);
    }

}
