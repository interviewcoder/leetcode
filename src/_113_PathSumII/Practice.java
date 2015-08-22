/**
 *************************************************************************
 * Description: 
 * 
 * Given a binary tree and a sum, find all root-to-leaf paths 
 * where each path's sum equals the given sum.
 *  
 *************************************************************************
 * @tag : Tree; Depth-first Search
 * {@link https://leetcode.com/problems/path-sum-ii/ }
 * {@link com.leetcode.Classify#findAllPaths()}
 */
package _113_PathSumII;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.TreeNode;


/** see test {@link _113_PathSumII.PracticeTest } */
public class Practice {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        int cursum = 0;
        pathSum(root, cursum, sum, new ArrayList<Integer>(), result);
        return result;
    }

    private void pathSum(TreeNode root, int cursum, int sum,
            List<Integer> path, List<List<Integer>> result) {
        if (root.left == null && root.right == null) {
            if (cursum + root.val == sum) {
                List<Integer> copy = new ArrayList<>(path);
                copy.add(root.val);
                result.add(copy);
            }
            return;
        } else {
            // recursive case
            path.add(root.val);
            if (root.left != null) {
                pathSum(root.left, cursum + root.val, sum, path, result);
            }
            if (root.right != null) {
                pathSum(root.right, cursum + root.val, sum, path, result);
            }
            path.remove(path.size() - 1);
        }
    }

}
