/**
 * Time : O(N); Space : O(N)
 * @tag : Depth-first Search; Breadth-first Search; Graph
 * @by  : Steven Cooks
 * @date: Jun 26, 2015
 *******************************************************************************
 * Description: 
 * 
 * Clone an undirected graph. Each node in the graph contains a label and
 * a list of its neighbors.
 * 
 * Visually, the graph looks like the following:
 *
 *     1
 *    / \
 *   /   \
 *  0 --- 2 
 *       / \
 *       \_/
 *******************************************************************************
 * {@link https://leetcode.com/problems/clone-graph/ }
 */
package _133_CloneGraph;

import java.util.HashMap;
import java.util.Map;

import com.leetcode.UndirectedGraphNode;

public class SolutionDFS {

    /**
     * DFS version, see also {@link _133_CloneGraph.Solution BFS version }
     * Similar to memo version top-down dp problem. First find in memo,
     * if we have copied that node, return it; otherwise, construct a new node
     * and add neighbors to it.
     */
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        Map<UndirectedGraphNode, UndirectedGraphNode> cloneMap = 
                new HashMap<>();
        return cloneGraph(node, cloneMap);
    }

    private UndirectedGraphNode cloneGraph(UndirectedGraphNode node,
            Map<UndirectedGraphNode, UndirectedGraphNode> cloneMap) {
        if (cloneMap.containsKey(node)) {
            // look up in memo first
            return cloneMap.get(node);
        } else if (node == null) {
            return null;
        } else {
            // copy each neighbor
            UndirectedGraphNode nodeCopy = new UndirectedGraphNode(node.label);
            // update map here, don't wait until return statement like memo version dp
            cloneMap.put(node, nodeCopy);
            for (UndirectedGraphNode neighbor : node.neighbors) {
                nodeCopy.neighbors.add(cloneGraph(neighbor, cloneMap));
            }
            return nodeCopy;
        }
    }

}
