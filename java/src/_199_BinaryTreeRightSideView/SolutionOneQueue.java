/**
 * Time : O(); Space : O()
 * @tag : Tree; Depth-first Search; Breadth-first Search
 * @by  : Steven Cooks
 * @date: Jun 30, 2015
 ***************************************************************************
 * Description: 
 * 
 * Given a binary tree, imagine yourself standing on the right side of it, 
 * return the values of the nodes you can see ordered from top to bottom. 
 * 
 * For example: 
 * 
 * Given the following binary tree,
 *      1       <--- 
 *    /   \ 
 *   2     3     <--- 
 *    \     \ 
 *     5     4     <--- 
 * You should return [1, 3, 4].
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/binary-tree-right-side-view/ }
 */
package _199_BinaryTreeRightSideView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.leetcode.TreeNode;

    /**
     * use one queue instead of two queue by count size of each level
     */
public class SolutionOneQueue {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i == size - 1) {
                    // last element in current level
                    result.add(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return result;
    }
}
