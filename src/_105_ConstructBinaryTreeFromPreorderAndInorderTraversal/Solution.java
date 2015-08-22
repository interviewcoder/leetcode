/**
 * Time : O(); Space: O()
 * @tag : Tree; Array; Depth-first Search
 * @by  : Steven Cooks
 * @date: Jun 14, 2015
 *****************************************************************
 * Description: 
 * 
 * Given preorder and inorder traversal of a tree, construct the binary tree. 
 * 
 * Note: 
 * You may assume that duplicates do not exist in the tree.
 * 
 *****************************************************************
 * {@link https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/}
 */

package _105_ConstructBinaryTreeFromPreorderAndInorderTraversal;

import com.leetcode.TreeNode;

/**
 * see test
 * {@link _105_ConstructBinaryTreeFromPreorderAndInorderTraversal.SolutionTest }
 */
public class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length != inorder.length || preorder.length == 0) {
            return null;
        }
        int preStart = 0;
        int preEnd = preorder.length - 1;
        int inStart = 0;
        int inEnd = inorder.length - 1;
        return buildTree(preorder, preStart, preEnd, inorder, inStart, inEnd);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd,
            int[] inorder, int inStart, int inEnd) {
        // base case
        if (preStart > preEnd) {
            return null;
        }
        if (preStart == preEnd) {
            return new TreeNode(preorder[preStart]);
        }
        // recursive case
        int rootVal = preorder[preStart];
        // find index of root in inorder array
        int rootIndexInInorder = -1; 
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndexInInorder = i;
                break;
            }
        }
        //TODO: if rootIndex == -1, throws exception
        TreeNode root = new TreeNode(rootVal);
        int leftEnd = rootIndexInInorder - inStart + preStart;
        root.left = buildTree(preorder, preStart + 1, leftEnd,
                inorder, inStart, rootIndexInInorder - 1);
        root.right = buildTree(preorder, leftEnd + 1, preEnd, 
                inorder, rootIndexInInorder + 1, inEnd);
        return root;
    }

}
