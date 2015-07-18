/**
 * Time : O(); Space: O()
 * @tag : Tree; Breadth-first Search; Stack
 * @by  : Steven Cooks
 * @date: Jun 10, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a binary tree, return the zigzag level order traversal of its nodes' 
 * values. (ie, from left to right, then right to left for the next level 
 * and alternate between). 
 * 
 * For example: 
 * Given binary tree {3,9,20,#,#,15,7}, 
 *     3
 *    / \
 *   9  20
 *     /  \ 
 *    15   7 
 * return its zigzag level order traversal as: 
 * [ [3], [20,9], [15,7] ]
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/ }
 */
package _103_BinaryTreeZigzagLevelOrderTraversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.leetcode.TreeNode;

/** see test {@link _103_BinaryTreeZigzagLevelOrderTraversal.SolutionTest } */
public class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> curLevel = new LinkedList<>();
        curLevel.add(root);
        boolean oddLevel = true;
        while (!curLevel.isEmpty()) {
            Queue<TreeNode> nextLevel = new LinkedList<>();
            int curLevelLen = curLevel.size();

            // initialize list with current list's size
            List<Integer> curList = new ArrayList<>(
                    Arrays.asList(new Integer[curLevelLen]));

            for (int i = 0; i < curLevelLen; i++) {
                TreeNode node = curLevel.poll();
                // index to put current value
                int index = oddLevel ? i : (curLevelLen - i - 1);
                curList.set(index, node.val);

                if (node.left != null) {
                    nextLevel.add(node.left);
                }
                if (node.right != null) {
                    nextLevel.add(node.right);
                }

            }
            // for next level
            result.add(curList);
            oddLevel = !oddLevel;
            curLevel = nextLevel;
        }
        return result;
    }

}
