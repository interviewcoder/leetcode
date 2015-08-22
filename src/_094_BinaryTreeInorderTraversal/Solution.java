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
import java.util.Stack;

import com.leetcode.TreeNode;

/**
 * see test {@link _094_BinaryTreeInorderTraversal.SolutionTest } 
 * @reference {@link https://leetcode.com/discuss/19765/iterative-solution-in-java-simple-and-readable }
 */
public class Solution {

    // more concise version compared to my verbose one
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.empty()) {
            // push left nodes into stack
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            result.add(node.val);
            // ! key step: invoke recursive call on node's right child
            node = node.right;
        }
        return result;
    }

//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        if (root == null) {
//            return result;
//        }
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode node = root;
//        while (node != null) {
//            stack.push(node);
//            node = node.left;
//        }
//        
//        while (!stack.empty()) {
//            node = stack.pop();
//            result.add(node.val);
//            if (node.right != null) {
//                node = node.right;
//                while (node != null) {
//                    stack.push(node);
//                    node = node.left;
//                }
//            }
//        }
//        return result;
//    }

}
