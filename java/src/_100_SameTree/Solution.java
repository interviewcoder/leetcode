/**
 * Time : O(N); Space: O(1)
 * @tag : Tree; Depth-First-Search
 * @date: 04.27.2015 
 *************************************************************************
 * Description: 
 * 
 * Given two binary trees, write a function to check if they are equal or not. 
 * Two binary trees are considered equal if they are structurally identical 
 * and the nodes have the same value.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/same-tree/ }
 */
package _100_SameTree;

import com.leetcode.TreeNode;

/** see test {@link _100_SameTree.SolutionTest } */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p != null && q != null) {
            // here should not be (p == q) which compares the reference value
            // of two objects
            return p.val == q.val && isSameTree(p.left, q.left)
                    && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }
}
