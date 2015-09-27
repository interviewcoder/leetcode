/**
 * Time : O() ; Space: O()
 * @tag : Tree; Stack; Design
 * @by  : Steven Cooks
 * @date: Jul 27, 2015
 ***************************************************************************
 * Description:
 * 
 * Implement an iterator over a binary search tree (BST). Your iterator will 
 * be initialized with the root node of a BST. 
 * 
 * Calling next() will return the next smallest number in the BST. 
 * 
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) 
 * memory, where h is the height of the tree.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/binary-search-tree-iterator/ }
 */
package _173_BinarySearchTreeIterator;

import java.util.Stack;

import com.leetcode.TreeNode;

/** see test {@link _173_BinarySearchTreeIterator.SolutionTest } */
public class Solution {
    
    Stack<TreeNode> nodes = new Stack<>();

    public Solution(TreeNode root) {
        TreeNode node = root;
        while (node != null) {
            nodes.push(node);
            node = node.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !nodes.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = nodes.pop();
        int next = node.val;
        if (node.right != null) {
            node = node.right;
            while (node != null) {
                nodes.push(node);
                node = node.left;
            }
        }
        return next;
    }

}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
