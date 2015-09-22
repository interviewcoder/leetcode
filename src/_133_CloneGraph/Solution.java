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
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import com.leetcode.UndirectedGraphNode;

/** see test {@link _133_CloneGraph.SolutionTest } */
public class Solution {
    
    // BFS version, see also
    // For each node, building neighbors for its corresponding copy node.
    // for not copied neighbor, push it to the queue; 
    // for copied neighbor, get its copy from the cloneMap
    // P.S. don't forget to update map when adding node into queue
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return node;
        }
        UndirectedGraphNode nodeCopy = new UndirectedGraphNode(node.label);

        // <Node from given graph, Node that is cloned>
        Map<UndirectedGraphNode, UndirectedGraphNode> cloneMap = new HashMap<>();
        cloneMap.put(node, nodeCopy);

        Queue<UndirectedGraphNode> nodesToCopy = new LinkedList<>();
        nodesToCopy.add(node);

        while (!nodesToCopy.isEmpty()) {
            UndirectedGraphNode graphNode = nodesToCopy.poll();
            // clone all neighbors of graph node
            for (UndirectedGraphNode neighbour: graphNode.neighbors) {
                UndirectedGraphNode neighbourCopy;
                if (cloneMap.containsKey(neighbour)) {
                    neighbourCopy = cloneMap.get(neighbour);
                } else {
                    // for neighbor that has not been copied
                    neighbourCopy = new UndirectedGraphNode(neighbour.label);
                    cloneMap.put(neighbour, neighbourCopy);
                    nodesToCopy.add(neighbour);
                }
                cloneMap.get(graphNode).neighbors.add(neighbourCopy);
            }
        }
        return nodeCopy;
    }
}
