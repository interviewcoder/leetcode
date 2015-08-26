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

import java.util.ArrayList;
import java.util.List;

import com.leetcode.TreeNode;

/** see test {@link _099_RecoverBinarySearchTree.SolutionNTest } */
public class SolutionN {

    public void recoverTree(TreeNode root) {
        List<TreeNode> in = new ArrayList<>();
        inorder(root, in);
        TreeNode first = null;
        TreeNode second = null;
        for (int i = 0; i < in.size() - 1; i++) {
            if (first == null && in.get(i).val > in.get(i + 1).val) {
                first = in.get(i);
            }
            if (first != null && in.get(i).val > in.get(i + 1).val) {
                second = in.get(i + 1);
            }
        }
        if (first != null && second != null) {
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }
    }

    private void inorder(TreeNode root, List<TreeNode> in) {
        if (root == null) {
            return;
        }
        inorder(root.left, in);
        in.add(root);
        inorder(root.right, in);
    }

}
