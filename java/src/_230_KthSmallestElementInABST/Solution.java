/**
 * Time : O(); Space : O()
 * @tag : Tree
 * @by  : Steven Cooks
 * @date: Jul 3, 2015
 *******************************************************************************
 * Description: 
 * 
 * Given a binary search tree, write a function kthSmallest to find the 
 * kth smallest element in it. 
 * 
 * Note: 
 * You may assume k is always valid, 1 ≤ k ≤ BST's total elements. 
 * 
 * Follow up: 
 * What if the BST is modified (insert/delete operations) often and you 
 * need to find the kth smallest frequently? How would you optimize the 
 * kthSmallest routine?
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/kth-smallest-element-in-a-bst/ }
 */
package _230_KthSmallestElementInABST;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.TreeNode;

/** see test {@link _230_KthSmallestElementInABST.SolutionTest } */
public class Solution {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = convertBSTToList(root, k);
        if (1 <= k && k <= list.size()) {
            return list.get(k - 1);
        } else {
            return 0;
        }
    }

    private List<Integer> convertBSTToList(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        // base case
        if (root == null) {
            return list;
        }
        // recursive case: in-order traversal
        list.addAll(convertBSTToList(root.left, k));
        list.add(root.val);
        if (list.size() >= k) {
            // we don't need to check right subtree
            return list;
        } else {
            list.addAll(convertBSTToList(root.right, k));
        }
        return list;
    }

}
