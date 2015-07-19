/**
 * Time : O(); Space: O()
 * @tag : Tree; Depth-first Search
 * @by  : Steven Cooks
 * @date: Jun 16, 2015
 *************************************************************************
 * Description:
 * 
 * Given a binary tree, find the maximum path sum. 
 * The path may start and end at any node in the tree. 
 * For example: Given the below binary tree, 
 *   1 
 *  / \ 
 * 2   3 
 * Return 6.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/binary-tree-maximum-path-sum/ }
 */
package _124_BinaryTreeMaximumPathSum;

import com.leetcode.TreeNode;

/** see test {@link _124_BinaryTreeMaximumPathSum.SolutionTest } */
public class Solution {
    
    private int globalMax;

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        globalMax = Integer.MIN_VALUE;
        maxPathSumDown(root);
        return globalMax;
    }

    private int maxPathSumDown(TreeNode root) {
        // base case
        if (root == null) {
            return 0;
        }
        // recursive case
        int leftMaxPathSum = Math.max(0, maxPathSumDown(root.left));
        int rightMaxPathSum = Math.max(0, maxPathSumDown(root.right));
        globalMax = Math.max(globalMax, leftMaxPathSum + rightMaxPathSum + root.val);
        return root.val + Math.max(leftMaxPathSum, rightMaxPathSum);
    }

}
