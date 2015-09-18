/**
 * Time : O(lgN) ; Space: O(1)
 * @tag : Tree
 * @by  : Steven Cooks
 * @date: Aug 19, 2015
 ***************************************************************************
 * Description:
 *
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two 
 * given nodes in the BST. 
 * 
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor 
 * is defined between two nodes v and w as the lowest node in T that has both 
 * v and w as descendants (where we allow a node to be a descendant of itself).” 
 *      _______6______
 *     /              \
 *  ___2__          ___8__
 * /      \        /      \
 * 0      _4       7       9
 *        /  \
 *       3   5
 *       
 * For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another 
 * example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of 
 * itself according to the LCA definition.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/ }
 */
package _235_LowestCommonAncestorOfABinarySearchTree;

import com.leetcode.TreeNode;

/** see test {@link _235_LowestCommonAncestorOfABinarySearchTree.SolutionTest } */
public class Solution {

    /** As long as two nodes are in the subtree, go to that subtree to search */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while ((root.val - p.val) * (root.val - q.val) > 0) {
            // p and q are under the same sub-tree
            root = root.val > p.val ? root.left : root.right;
        }
        return root;
    }

}
