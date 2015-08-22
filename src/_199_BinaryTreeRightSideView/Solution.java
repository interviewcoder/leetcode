/**
 * Time : O(N); Space : O(N)
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
/**
 * <p>
 * <p>Given a binary tree, imagine yourself standing on the <i>right</i> 
 * side of it, return the values of the nodes you can see ordered from top to bottom.</p> 
 * <p> For example:<br /> Given the following binary tree,<br /> 
 * <pre> 
 *    1            <--- 
 *  /   \ 
 *  2     3         <--- 
 *   \     \ 
 *    5     4       <--- 
 * </pre></p> 
 * <p> You should return <code>[1, 3, 4]</code>. </p> 
 * <p><b>Credits:</b><br />Special thanks to <a href="https://leetcode.com/discuss/user/amrsaqr">@amrsaqr</a> 
 * for adding this problem and creating all test cases.</p>
 * </p>
 *
 */
package _199_BinaryTreeRightSideView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.leetcode.TreeNode;

/**
 * Summary: 
 * 1. two-queue classic BFS, one for current level, one for next level (see solution below) 
 * 
 * 2. one-queue classic BFS, count size of queue before iterating current level see {@link _199_BinaryTreeRightSideView.SolutionOneQueue }
 * 
 * 3. use (DFS + level) to achieve level reversal traversal, once a deeper level appears, add that element
 * 
 * 4. DFS, combine result from right subtree and uncovered elements from left subtree (see {@link _199_BinaryTreeRightSideView.SolutionRecursive }
 */
public class Solution {

    /**
     * Traverse level by level and only keep the last element in each level and
     * can be improved by using only one queue
     * {@link _199_BinaryTreeRightSideView.SolutionOneQueue }
     */
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> cur = new LinkedList<>();
        cur.add(root);

        while (!cur.isEmpty()) {
            Queue<TreeNode> next = new LinkedList<>();
            while (!cur.isEmpty()) {
                TreeNode node = cur.poll();
                // if this is the last node in this level
                if (cur.isEmpty()) {
                    result.add(node.val);
                }
                if (node.left != null) {
                    next.add(node.left);
                }
                if (node.right != null) {
                    next.add(node.right);
                }
            }
            // go to next level
            cur = next;
        }

        return result;
    }

}
