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

/** see test {@link _285_InorderSuccessorInBST.SolutionTest } */

public class Solution {

    // iterative version
    public TreeNode inorderSuccessor(TreeNode root, TreeNode node) {
        if (root == null || node == null) {
            return null;
        } else if (node.right != null) {
            // find successor in right subtree, the leftmost child
            node = node.right;
            while (node.left != null) {
                node = node.left;
            }
            return node;
        } else {
            // find successor from root down to this node
            TreeNode successor = null;
            while (root != null) {
                if (root == node) {
                    break;
                } else if (node.val < root.val) {
                    // go to left subtree
                    successor = root;
                    root = root.left;
                } else {
                    root = root.right;
                }
            }
            return successor;
        }
    }

}
