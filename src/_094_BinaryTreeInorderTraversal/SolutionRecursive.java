/**
 * Time : O(N); Space: O(N)
 * @tag : Tree; Hash Table; Stack
 * @by  : Steven Cooks
 * @date: Jun 10, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a binary tree, return the inorder traversal of its nodes' values. 
 * For example: 
 * Given binary tree {1,#,2,3}, 
 *          1
 *            \
 *             2
 *            /
 *           3
 * return [1,3,2]. 
 * Note: Recursive solution is trivial, could you do it iteratively?
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/binary-tree-inorder-traversal/ }
 */
package _094_BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;
import com.leetcode.TreeNode;

/** see test {@link _094_BinaryTreeInorderTraversal.SolutionRecursiveTest } */
public class SolutionRecursive {

    // recursive version
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        // base case
        if (root == null) {
            return result;
        }
        // recursive case
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }

}
