/**
 * Time : O(); Space: O()
 * @tag : Tree; Breadth-first Search
 * @by  : Stevem Cooks
 * @date: Jun 11, 2015
 *****************************************************************
 * Description: 
 * 
 * Given a binary tree, return the bottom-up level order traversal of its 
 * nodes' values. (ie, from left to right, level by level from leaf to root). 
 * 
 * For example: 
 * Given binary tree {3,9,20,#,#,15,7}, 
 *    3 
 *   / \ 
 *  9  20 
 *    /  \
 *   15   7 
 * return its bottom-up level order traversal as: 
 * [ [15,7], [9,20], [3] ]
 * 
 *****************************************************************
 * {@link: https://leetcode.com/problems/binary-tree-level-order-traversal-ii/ }
 * return the bottom-up level order
 */
package _107_BinaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.leetcode.TreeNode;

/** see test {@link _107_BinaryTreeLevelOrderTraversalII.SolutionTest } */
public class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> curLevel = new LinkedList<>();
        curLevel.add(root);
        while (!curLevel.isEmpty()) {
            Queue<TreeNode> nextLevel = new LinkedList<>();
            List<Integer> curList = new ArrayList<>();
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
            // next level
            result.add(0, curList);
            curLevel = nextLevel;
        }
        return result;
    }

}
