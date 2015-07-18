/**
 * Time : O(); Space: O()
 * @tag : Tree; Depth-first Search
 * @by  : Steven Cooks
 * @date: Jun 14, 2015
 *****************************************************************
 * Description: 
 * 
 * Given an array where elements are sorted in ascending order,  *
 * convert it to a height balanced BST.                          *
 *****************************************************************
 * {@link https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/ }
 */
package _108_ConvertSortedArrayToBinarySearchTree;

import com.leetcode.TreeNode;

/** see test {@link _108_ConvertSortedArrayToBinarySearchTree.SolutionTest } */
public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return null;
        }
        int startIndex = 0;
        int endIndex = len - 1;
        return sortedArrayToBST(nums, startIndex, endIndex);
    }

    private TreeNode sortedArrayToBST(int[] nums, int startIndex, int endIndex) {
        // base case
        if (startIndex > endIndex) {
            return null;
        }
        if (startIndex == endIndex) {
            return new TreeNode(nums[startIndex]);
        }
        // recursive case
        int middle = (startIndex + endIndex) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = sortedArrayToBST(nums, startIndex, middle - 1);
        root.right = sortedArrayToBST(nums, middle + 1, endIndex);
        return root;
    }

}
