/**
 * Time : O(N); Space : O()
 * @tag : Tree; Depth-first Search
 * @by  : Steven Cooks
 * @date: Aug 26, 2015
 *******************************************************************************
 * Description: 
 * 
 * Given a binary tree, find its maximum depth. 
 * 
 * The maximum depth is the number of nodes along the longest path from 
 * the root node down to the farthest leaf node.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/maximum-depth-of-binary-tree/ }
 */
package _104_MaximumDepthOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import com.leetcode.TreeNode;

/** see test {@link _104_MaximumDepthOfBinaryTree.SolutionIterativeTest } */
public class SolutionIterative {

    // level order traversal
    public int maxDepth(TreeNode rootNode) {
        int depth = 0;
        Queue<TreeNode> level = new LinkedList<>();
        level.offer(rootNode);
        while (!level.isEmpty()) {
            int n = level.size();
            boolean hasLeaf = false;
            for (int i = 0; i < n; i++) {
                TreeNode node = level.poll();
                if (node != null) {
                    hasLeaf = true;
                    level.add(node.left);
                    level.add(node.right);
                }
            }
            if (hasLeaf) {
                depth++;
            }
        }
        return depth;
    }

}
