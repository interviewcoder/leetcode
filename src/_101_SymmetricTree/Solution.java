/**
 * Time : O(); Space: O()
 * @tag : Tree; Depth-first Search
 * @by  : Steven Cooks
 * @date: Jun 10, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center). 
 * For example, this binary tree is symmetric: 
 *     1
 *    / \ 
 *   2   2
 *  / \ / \ 
 * 3  4 4  3 
 * 
 * But the following is not: 
 *    1 
 *   / \ 
 *  2   2 
 *   \   \ 
 *    3    3 
 * Note: 
 * Bonus points if you could solve it both recursively and iteratively.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/symmetric-tree/ }
 */
package _101_SymmetricTree;

import com.leetcode.TreeNode;

/** see test {@link _101_SymmetricTree.SolutionTest } */
public class Solution {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            // base case
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left != null && right != null) {
            return left.val == right.val
                    && isMirror(left.left, right.right)
                    && isMirror(left.right, right.left) ;
        } else {
            return false;
        }
    }

}
