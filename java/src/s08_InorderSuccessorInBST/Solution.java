/**
 * Time : O(h) ; Space: O(1)
 * @tag : Tree
 * @by  : Steven Cooks
 * @date: Aug 11, 2015
 ***************************************************************************
 * Description:
 * 
 * Find the successor of given in in-order traversal, i.e. node that has 
 * next larger number.
 * 
 ***************************************************************************
 * {@link _173_BinarySearchTreeIterator.Solution }
 * {@link http://www.geeksforgeeks.org/inorder-successor-in-binary-search-tree/ }
 */
package s08_InorderSuccessorInBST;

import com.leetcode.TreeNode;


public class Solution {
    
    /**
     * Returns the successor of given node in the binary search tree.
     * 
     * @param root
     * @param node
     * @return successor node
     */
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
