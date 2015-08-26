/**
 * Time : O(); Space: O()
 * @tag : Tree; Depth-first Search
 * @by  : Steven Cooks
 * @date: Jun 17, 2015
 *************************************************************************
 * Description:
 * 
 *  Given a binary tree, determine if it is a valid binary search tree (BST). 
 *  Assume a BST is defined as follows: 
 *  
 *  The left subtree of a node contains only nodes with keys less than the node's key. 
 *  The right subtree of a node contains only nodes with keys greater than the node's key. 
 *  Both the left and right subtrees must also be binary search trees.
 *  
 *************************************************************************
 * {@link https://leetcode.com/problems/validate-binary-search-tree/ }
 */
package _098_ValidateBinarySearchTree;

import com.leetcode.TreeNode;

/** see test {@link _098_ValidateBinarySearchTree.SolutionTest } */
public class SolutionNotGood {

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean isValid = true;
        if (isValid && root.left != null) {
            // find the largest number in left subtree
            TreeNode node = root.left;
            while (node.right != null) {
                node = node.right;
            }
            isValid = node.val < root.val && isValidBST(root.left);
        }
        if (isValid && root.right != null) {
            // find the smallest number in right subtree
            TreeNode node = root.right;
            while (node.left != null) {
                node = node.left;
            }
            isValid = root.val < node.val && isValidBST(root.right);
        }
        return isValid;
    }

}
