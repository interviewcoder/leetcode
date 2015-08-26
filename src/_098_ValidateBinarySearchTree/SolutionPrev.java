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

/** see test {@link _098_ValidateBinarySearchTree.SolutionPrevTest } */
public class SolutionPrev {
    
    private TreeNode prev = null;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return inorder(root);
    }

    private boolean inorder(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!inorder(root.left)) {
            return false;
        }
        if (prev != null && prev.val >= root.val) {
            return false;
        }
        prev = root;
        return inorder(root.right);
    }
}
