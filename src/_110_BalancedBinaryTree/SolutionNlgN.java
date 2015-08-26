/**
 * Time : O(NlgN) ~ O(N^2); Space: O()
 * @tag : Tree; Depth-first Search
 * @by  : Steven Cooks
 * @date: Jun 11, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a binary tree, determine if it is height-balanced. 
 * For this problem, a height-balanced binary tree is defined as a binary 
 * tree in which the depth of the two subtrees of every node never differ by
 * more than 1.
 *  
 *************************************************************************
 * {@link: https://leetcode.com/problems/balanced-binary-tree/ }
 */
package _110_BalancedBinaryTree;

import com.leetcode.TreeNode;

/** see test {@link _110_BalancedBinaryTree.SolutionNlgNTest } */
public class SolutionNlgN {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isBalanced(root.left) && isBalanced(root.right)
                && Math.abs(depth(root.left) - depth(root.right)) <= 1;

    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(depth(root.left), depth(root.right));
    }

}
