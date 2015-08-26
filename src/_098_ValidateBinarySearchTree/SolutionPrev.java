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
    
    // previous node of current node in in-order traversal
    private TreeNode prev = null;

    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }

    // business while visiting current node:
    //     1) assert pre.val < cur.val
    //     2) update pre = cur
    private boolean inorder(TreeNode cur) {
        if (cur == null) {
            return true;
        }
        // visit left subtree
        if (!inorder(cur.left)) {
            return false;
        }

        // visit cur
        if (prev != null && prev.val >= cur.val) {
            return false;
        }
        prev = cur;

        // visit right subtree
        return inorder(cur.right);
    }
}
