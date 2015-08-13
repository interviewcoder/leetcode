/**
 * Time : O(); Space: O()
 * @tag : Tree; Depth-first Search
 * @date: Jun 17, 2015
 * @by  : Steven Cooks
 *************************************************************************
 * Description:
 * 
 * Two elements of a binary search tree (BST) are swapped by mistake. 
 * Recover the tree without changing its structure. 
 * 
 * Note: 
 * A solution using O(n) space is pretty straight forward. Could you devise 
 * a constant space solution?
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/recover-binary-search-tree/ }
 */
package _099_RecoverBinarySearchTree;

import com.leetcode.TreeNode;

/** see test {@link _099_RecoverBinarySearchTree.SolutionTest } */
public class Solution {

    private TreeNode first = null;
    private TreeNode second = null;
    private TreeNode last = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root);
        if (first != null && second != null) {
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        // try to find first wrong number
        if (first == null && last.val > root.val) {
            first = last;
        }
        // try to find second wrong number
        if (first != null && last.val > root.val) {
            second = root;
        }
        last = root;
        inorder(root.right);
    }

}
