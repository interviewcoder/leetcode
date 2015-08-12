/**
 * Time : O() ; Space: O()
 * @tag : Depth-first Search; Binary Tree
 * @by  : Steven Cooks
 * @date: Aug 6, 2015
 ***************************************************************************
 * Description:
 * 
 * The longest length of any path in binary tree. A path can start and end 
 * at any node the tree.
 * 
 ***************************************************************************
 * {@link }
 */
package s02_DiameterOfBinaryTree;

import com.leetcode.TreeNode;

public class Solution {
    
    public int diameter(TreeNode root) {
        // base case
        if (root == null) {
            return 0;
        }
        // diameter of left subtree
        int leftDiameter = diameter(root.left);
        // diameter of right subtree
        int rightDiameter = diameter(root.right);
        // length of longest path that contains root node
        int longestLen = 1 + height(root.left) + height(root.right);
        return Math.max(longestLen, Math.max(leftDiameter, rightDiameter));
    }
    
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

}
