package _113_PathSumII;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.TreeNode;

/**
 * {@link https://leetcode.com/problems/path-sum-ii/ }
 *************************************************************************
 *  Given a binary tree and a sum, find all root-to-leaf paths 
 *  where each path's sum equals the given sum.
 *  
 *************************************************************************
 * {@link com.leetcode.Classify#findAllPaths()}
 */
public class SolutionWrong {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        int curSum = 0;
        final int expSum = sum;
        List<Integer> path = new ArrayList<>();
        pathSum(root, curSum, expSum, path, result);
        return result;
    }

    // [Wrong] because you should not end at null ending, should
    // stop at leaf node. Otherwise, you can get duplicated path
    // check Test11
    private void pathSum(TreeNode root, int curSum, int expSum,
            List<Integer> path, List<List<Integer>> result) {
        if (root == null) {
            // base case
            if (curSum == expSum) {
                // one path found
                result.add(new ArrayList<>(path));
            }
        } else {
            // recursive case: pre-order traversal
            curSum += root.val;
            path.add(root.val);
            pathSum(root.left, curSum, expSum, path, result);
            pathSum(root.right, curSum, expSum, path, result);
            // before going back to parent node
            path.remove(path.size() - 1);
            curSum -= root.val;
        }
    }

}
