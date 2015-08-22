/**
 * Time : O(N); Space: O()
 * @tag : Tree; Stack
 * @date: Jun 18, 2015
 * @by  : Steven Cooks
 *************************************************************************
 * Description: 
 * 
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/binary-tree-preorder-traversal/ }
 */
package _144_BinaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.TreeNode;

/** see test {@link _144_BinaryTreePreorderTraversal.SolutionRecursiveTest } */
public class SolutionRecursive {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        // base case
        if (root ==  null) {
            return result;
        }
        // recursive case
        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;
    }
}
