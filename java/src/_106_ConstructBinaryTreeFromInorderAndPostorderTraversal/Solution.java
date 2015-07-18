/**
 * Time : O(); Space: O()
 * @tag : Tree; Array; Depth-first Search
 * @by  : Steven Cooks
 * @date: Jun 14, 2015
 *****************************************************************
 * Description: 
 * 
 * Given inorder and postorder traversal of a tree, construct the binary tree. 
 * Note: 
 * You may assume that duplicates do not exist in the tree
 * 
 *****************************************************************
 * {@link https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/ }
 */
package _106_ConstructBinaryTreeFromInorderAndPostorderTraversal;

import com.leetcode.TreeNode;

/**
 * see test
 * {@link _106_ConstructBinaryTreeFromInorderAndPostorderTraversal.SolutionTest }
 */
public class Solution {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length != postorder.length || inorder.length == 0) {
            return null;
        }
        int inStart = 0;
        int inEnd = inorder.length - 1;
        int postStart = 0;
        int postEnd = postorder.length - 1;
        return buildTree(inorder, inStart, inEnd, postorder, postStart, postEnd);
    }

    private TreeNode buildTree(int[] inorder, int inStart, int inEnd,
            int[] postorder, int postStart, int postEnd) {
        // base case
        if (inStart > inEnd) {
            return null;
        }
        if (inStart == inEnd) {
            return new TreeNode(inorder[inStart]);
        }
        
        // recursive case
        int rootVal = postorder[postEnd];
        // find root value in inorder array
        int rootIndexInInorder = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndexInInorder = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);
        int leftEnd = rootIndexInInorder - 1 - inStart + postStart;
        root.left = buildTree(inorder, inStart, rootIndexInInorder - 1, 
                postorder, postStart, leftEnd);
        root.right = buildTree(inorder, rootIndexInInorder + 1, inEnd, 
                postorder, leftEnd + 1, postEnd - 1);

        return root;
    }

}
