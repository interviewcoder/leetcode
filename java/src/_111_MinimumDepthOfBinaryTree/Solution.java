/**
 * Time : O(N); Space: O(1)
 * @tag : Tree; Depth-first Search
 * @by  : Steven Cooks
 * @date: Jun 11, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a binary tree, find its minimum depth. 
 * The minimum depth is the number of nodes along the shortest path from the 
 * root node down to the nearest leaf node.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/minimum-depth-of-binary-tree/ }
 */
package _111_MinimumDepthOfBinaryTree;

import com.leetcode.TreeNode;

/** see test {@link _111_MinimumDepthOfBinaryTree.SolutionTest } */
public class Solution {

    public int minDepth(TreeNode root) {
        // base case
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            // reach leaf node
            return 1;
        }
        // recursive case
        int depth = Integer.MAX_VALUE;
        if (root.left != null) {
            depth = Math.min(depth, 1 + minDepth(root.left));
        }
        if (root.right != null) {
            depth = Math.min(depth, 1 + minDepth(root.right));
        }
        return depth;
    }

}
