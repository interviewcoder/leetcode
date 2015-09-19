/**
 * Time : O(N) ; Space: O(1)
 * @tag : Tree
 * @by  : Steven Cooks
 * @date: Aug 19, 2015
 ***************************************************************************
 * Description:
 * 
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes 
 * in the tree. 
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor 
 * is defined between two nodes v and w as the lowest node in T that has 
 * both v and w as descendants (where we allow a node to be a descendant of itself).” 
 * 
 *      _______3______ 
 *     /              \
 *  ___5__          ___1__
 * /      \        /      \
 * 6      _2       0       8
 *        /  \
 *       7    4
 * For example, the lowest common ancestor (LCA) of nodes 5 and 1 is 3. Another 
 * example is LCA of nodes 5 and 4 is 5, since a node can be a descendant of 
 * itself according to the LCA definition.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/ }
 */
package _236_LowestCommonAncestorOfABinaryTree;

import com.leetcode.TreeNode;

/** see test {@link _236_LowestCommonAncestorOfABinaryTree.SolutionTest } */
public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // base case
        if (root == null || root == p || root == q) {
            return root;
        }
        // recursive case: divide and conquer
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        } else if (left != null) {
            return left;
        } else {
            return right;
        }
    }

}
