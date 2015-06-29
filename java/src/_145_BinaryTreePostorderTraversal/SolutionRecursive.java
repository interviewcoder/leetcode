/**
 * Time : O(N); Space: O(N)
 * @tag : Tree; Stack
 * @date: Jun 19, 2015
 * @by  : Steven Cooks
 *************************************************************************
 * Description: 
 * 
 * Given a binary tree, return the postorder traversal of its nodes' values.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/binary-tree-postorder-traversal/ }
 */
package _145_BinaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.TreeNode;

/** see test {@link _145_BinaryTreePostorderTraversal.SolutionRecursiveTest } */
public class SolutionRecursive {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        // base case
        if (root == null) {
            return result;
        }
        // recursive case
        // visit left
        result.addAll(postorderTraversal(root.left));
        // visit right
        result.addAll(postorderTraversal(root.right));
        // visit root
        result.add(root.val);
        return result;
    }
}
