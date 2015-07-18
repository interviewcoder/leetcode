/**
 * Time : O(); Space: O()
 * @tag : Tree; Breadth-first Search
 * @by  : Steven Cooks
 * @date: Jun 10, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a binary tree, return the level order traversal of its nodes' values. 
 * (ie, from left to right, level by level). 
 * 
 * For example: Given binary tree {3,9,20,#,#,15,7}, 
 *    3 
 *   / \ 
 *  9  20
 *    /  \
 *   15   7 
 * return its level order traversal as:
 * [ [3], [9,20], [15,7] ]
 *  
 *************************************************************************
 * {@link https://leetcode.com/problems/binary-tree-level-order-traversal/ V
 */
package _102_BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.leetcode.TreeNode;

/** see test {@link _102_BinaryTreeLevelOrderTraversal.SolutionTest } */
public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> curLevel = new LinkedList<>();
        curLevel.add(root);
        while (!curLevel.isEmpty()) {
            List<Integer> curList = new ArrayList<>();
            Queue<TreeNode> nextLevel = new LinkedList<>();
            while (!curLevel.isEmpty()) {
                TreeNode node = curLevel.poll();
                curList.add(node.val);
                if (node.left != null) {
                    nextLevel.add(node.left);
                }
                if (node.right != null) {
                    nextLevel.add(node.right);
                }
            }
            // go to next level
            result.add(curList);
            curLevel = nextLevel;
        }
        return result;
    }

}
