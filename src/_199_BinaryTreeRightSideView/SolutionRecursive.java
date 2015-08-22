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
package _199_BinaryTreeRightSideView;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.TreeNode;

/** see test {@link _199_BinaryTreeRightSideView.SolutionRecursiveTest } */
public class SolutionRecursive {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        // base case
        if (root == null) {
            return result;
        }
        // recursive case
        result.add(root.val);
        List<Integer> left = rightSideView(root.left);
        // take elements from the right side
        List<Integer> right = rightSideView(root.right);
        result.addAll(right);
        // for deeper levels that cannot be hidden by right subtree
        //       1 
        //     /   \
        //    2     3
        //     \
        //      4  <-- this cannot be hidden by right subtree
        
        if (right.size() <= left.size()) {
            result.addAll(left.subList(right.size(), left.size()));
        }
        return result;
    }

}
