/**
 * Time : O() ; Space: O()
 * @tag : 
 * @by  : Steven Cooks
 * @date: Aug 14, 2015
 ***************************************************************************
 * Description:
 * 
 * Convert ternary expression to binary syntax tree.
 * a?b:c  =>       a
 *                / \
 *               b   c
 * a?b?c:d:e =>    a
 *                / \
 *              b     e
 *            /   \
 *           c     d  
 * 
 ***************************************************************************
 * {@link http://www.geeksforgeeks.org/ternary-search-tree/ }
 */
package s09_ConvertTernaryExpressionToBinaryTree;

import java.util.Stack;

import com.leetcode.TreeNode;

/** 
 * 1. Does node have parent pointer?
 * 2. Expression's format, leading, trailing spaces, spaces between characters?
 * 3. May expression be illegal?
 * 4. Token's length is always 1?
 * see test {@link s09_ConvertTernaryExpressionToBinaryTree.SolutionTest } 
 */
public class Solution {
    
    /**
     * Converts ternary expression to binary tree. 
     */
    public TreeNode convertTernaryToBinaryTree(String s) {
        if (s.length() < 1) {
            return null;
        }
        Stack<TreeNode> lefts = new Stack<>();
        TreeNode root = new TreeNode(s.charAt(0));
        lefts.push(root);
        for (int i = 1; i < s.length(); i = i + 2) {
            if (s.charAt(i) == '?') {
                // left child of peek node in stack
                TreeNode left = new TreeNode(s.charAt(i + 1));
                lefts.peek().left = left;
                lefts.push(left);
            } else if (s.charAt(i) == ':') {
                // right sibling of peek node in stack
                lefts.pop();
                lefts.peek().right = new TreeNode(s.charAt(i + 1));
            }
        }
        return root;
    }

}
