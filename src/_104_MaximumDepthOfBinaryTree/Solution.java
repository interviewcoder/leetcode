/**
 * Time : O(N); Space : O()
 * @tag : Tree; Depth-first Search
 * @by  : Steven Cooks
 * @date: Jun 28, 2015
 *******************************************************************************
 * Description: 
 * 
 * Given a binary tree, find its maximum depth. 
 * 
 * The maximum depth is the number of nodes along the longest path from 
 * the root node down to the farthest leaf node.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/maximum-depth-of-binary-tree/ }
 */
package _104_MaximumDepthOfBinaryTree;

import com.leetcode.TreeNode;

/** see test {@link _104_MaximumDepthOfBinaryTree.SolutionTest } */
public class Solution {

    // post-order traversal of DFS
    public int maxDepth(TreeNode rootNode) {
        // base case
        if (rootNode == null) {
            return 0;
        }
        // recursive case
        return 1 + Math.max(maxDepth(rootNode.left), maxDepth(rootNode.right));
    }

}
