/**
 * Time : O(N); Space: O(N^2)
 * @tag : Tree; Depth-first Search
 * @by  : Steven Cooks
 * @date: Jun 11, 2015  
 *************************************************************************
 * Description: 
 * 
 * Given a binary tree and a sum, find all root-to-leaf paths 
 * where each path's sum equals the given sum.
 *  
 *************************************************************************
 * {@link https://leetcode.com/problems/path-sum-ii/ }
 * add 1d list into 2d list.
 */
package _113_PathSumII;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.TreeNode;

/** {@link com.leetcode.Classify#findAllPaths()} */
/** see test {@link _113_PathSumII.SolutionTest } */
public class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        int target = sum;
        List<Integer> path = new ArrayList<>();
        pathSum(root, target, path, result);
        return result;
    }

    private void pathSum(TreeNode root, int target, List<Integer> path,
            List<List<Integer>> result) {
        // base case
        if (root == null) {
            return;
        }
        path.add(root.val);
        if (root.left == null && root.right == null && root.val == target) {
            // base case
            // ! don't use result.add(path) because this will only add a
            // reference;
            result.add(new ArrayList<>(path));
        } else {
            // recursive case
            pathSum(root.left, target - root.val, path, result);
            pathSum(root.right, target - root.val, path, result);
        }
        path.remove(path.size() - 1);
    }

}
