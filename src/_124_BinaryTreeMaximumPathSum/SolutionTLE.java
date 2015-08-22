/**
 * Time : O(); Space: O()
 * @tag : Tree; Depth-first Search
 * @date: Jun 16, 2015
 * @by  : Steven Cooks
 * {@link https://leetcode.com/problems/binary-tree-maximum-path-sum/ }
 */
package _124_BinaryTreeMaximumPathSum;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.TreeNode;

/** see test {@link _124_BinaryTreeMaximumPathSum.SolutionTLETest } */
public class SolutionTLE {

    public int maxPathSum(TreeNode root) {
        List<Integer> treeList = flattenTree(root);
        return maxSublistSum(treeList);
    }

    //This method may cause TLE.
    private List<Integer> flattenTree(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        List<Integer> treeList = new ArrayList<>();
        if (root.left != null) {
            treeList.addAll(flattenTree(root.left));
        }
        treeList.add(root.val);
        if (root.right != null) {
            treeList.addAll(flattenTree(root.right));
        }
        return treeList;
    }

    private int maxSublistSum(List<Integer> treeList) {
        if (treeList.size() == 0) {
            return 0;
        }
        int maxSum = treeList.get(0);
        int sum = maxSum;
        for (int i = 1; i < treeList.size(); i++) {
            int val = treeList.get(i);
            sum = Math.max(sum + val, val);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

}
