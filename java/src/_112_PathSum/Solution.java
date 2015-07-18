/**
 * Time : O(); Space: O()
 * @tag : Tree; Depth-first Search
 * @by  : Steven Cooks
 * @date: Jun 11, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf 
 * path such that adding up all the values along the path equals the given sum. 
 * 
 * For example: 
 * Given the below binary tree and sum = 22,
 *            5
 *           / \ 
 *          4   8 
 *         /   / \ 
 *        11  13  4 
 *       /  \      \ 
 *      7    2      1
 *      
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 * 
 *************************************************************************
 * {@link: https://leetcode.com/problems/path-sum/ } 
 */
package _112_PathSum;

import com.leetcode.TreeNode;

/** see test {@link _112_PathSum.SolutionTest } */
public class Solution {

    public boolean hasPathSum(TreeNode root, int sum) {
        // base case
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && root.val == sum) {
            return true;
        }
        // recursive case
        return hasPathSum(root.left, sum - root.val)
                || hasPathSum(root.right, sum - root.val);
    }

}
