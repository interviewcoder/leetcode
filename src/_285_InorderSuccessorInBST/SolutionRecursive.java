/**
 * Time : O() ; Space: O()
 * @tag : Tree
 * @by  : Steven Cooks
 * @date: Sep 30, 2015
 ***************************************************************************
 * Description:
 * 
 * Given a binary search tree and a node in it, find the in-order successor
 * of that node in the BST. 
 * 
 * Note: If the given node has no in-order successor in the tree, return null.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/inorder-successor-in-bst/ }
 */
package _285_InorderSuccessorInBST;

import com.leetcode.TreeNode;

/** see test {@link _285_InorderSuccessorInBST.SolutionRecursiveTest } */
public class SolutionRecursive {

    // recursive version
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null || p == null) {
            return null;
        }
        if (root.val > p.val) {
            TreeNode left = inorderSuccessor(root.left, p);
            if (left != null) {
                return left;
            }
        }
        if (p.val < root.val) {
            return root;
        }
        return inorderSuccessor(root.right, p);

    }

}
