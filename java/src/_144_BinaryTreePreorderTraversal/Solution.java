/**
 * Time : O(); Space: O()
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
import java.util.Stack;

import com.leetcode.TreeNode;

// iterative version
/** see test {@link _144_BinaryTreePreorderTraversal.SolutionTest } */
public class Solution {

    // Solution1: push right child before pushing left child
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                result.add(node.val);
                // push right child before pushing left child
                stack.add(node.right);
                stack.add(node.left);
            }
        }
        return result;
    }

    // Solution2: avoid null in stack
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            // push right child before pushing left child
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return result;
    }

    // Solution3: only push right child into stack
    public List<Integer> preorderTraversal3(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        // only push right child of node
        Stack<TreeNode> rightChildren = new Stack<>();
        TreeNode node = root;
        while (node != null) {
            result.add(node.val);
            if (node.right != null) {
                rightChildren.add(node.right);
            }
            node = node.left;
            if (node == null && !rightChildren.isEmpty()) {
                // left children is finished
                node = rightChildren.pop();
            }
        }
        return result;
    }

}
