/**
 * Time : O(); Space: O()
 * @tag : Tree; Depth-first Search
 * @by  : Steven Cooks
 * @date: Jun 11, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a binary tree, flatten it to a linked list in-place. 
 * For example, Given 
 *      1
 *     / \ 
 *    2   5 
 *   / \   \ 
 *  3   4   6 
 *  
 * The flattened tree should look like: 
 * 1 \ 2 \ 3 \ 4 \ 5 \ 6
 * 
 *************************************************************************
 * {@link: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/ }
 */
package _114_FlattenBinaryTreeToLinkedList;

import com.leetcode.TreeNode;

/** see test {@link _114_FlattenBinaryTreeToLinkedList.SolutionTest } */
public class Solution {

    public void flatten(TreeNode root) {
        flattenTree(root);
    }

    public TreeNode flattenTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        // ! don't forget to remove the left child
        root.left = null;
        root.right = flattenTree(left);

        TreeNode node = root;
        // find the last right node
        while (node.right != null) {
            node = node.right;
        }

        node.right = flattenTree(right);
        return root;
    }

}
