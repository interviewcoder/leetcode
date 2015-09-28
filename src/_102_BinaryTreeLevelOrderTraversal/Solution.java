/**
 * Time : O(N); Space: O(N)
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
 * {@link https://leetcode.com/problems/binary-tree-level-order-traversal/ }
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
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> level = new LinkedList<>();
        level.offer(root);
        while (!level.isEmpty()) {
            int sz = level.size();
            List<Integer> levelList = new ArrayList<>();
            for (int i = 0; i < sz; i++) {
                TreeNode node = level.poll();
                levelList.add(node.val);
                if (node.left != null) {
                    level.offer(node.left);
                }
                if (node.right != null) {
                    level.offer(node.right);
                }
            }
            res.add(levelList);
        }
        return res;
    }

}
