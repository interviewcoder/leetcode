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
import java.util.Stack;

import com.leetcode.TreeNode;

/** see test {@link _145_BinaryTreePostorderTraversal.SolutionTest } */
public class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> children = new Stack<>();
        children.push(root);
        while (!children.isEmpty()) {
            TreeNode node = children.pop();
            if (node != null) {
                // insert node's value at the beginning of list
                result.add(0, node.val);
                children.push(node.left);
                children.push(node.right);
            }
        }
        return result;
    }

}
