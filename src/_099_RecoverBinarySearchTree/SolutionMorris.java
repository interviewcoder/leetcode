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

/** * see test {@link _099_RecoverBinarySearchTree.SolutionMorrisTest } */
public class SolutionMorris {

    TreeNode first = null;
    TreeNode second = null;
    TreeNode last = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
        TreeNode cur = root;
        TreeNode pre = null;
        while (cur != null) {
            if (cur.left == null) {
                // to visit right subtree
                visit(cur);
                cur = cur.right;
            } else {
                // find predecessor for cur node
                pre = cur.left;
                while (pre.right != null && pre.right != cur) {
                    pre = pre.right;
                }
                if (pre.right == null) {
                    // connect predecessor to cur and to visit left subtree after cur
                    pre.right = cur;
                    cur = cur.left;
                } else {
                    // restore tree and to visit right subtree after cur
                    visit(cur);
                    pre.right = null;
                    cur = cur.right;
                }
            }
        }
        // swap
        if (first != null && second != null) {
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }

    }

    private void visit(TreeNode cur) {
        if (cur != null && last != null) {
            if (first == null && last.val > cur.val) {
                first = last;
            } 
            if (first != null && last.val > cur.val) {
                second = cur;
            }
            last = cur;
        }
    }

}
