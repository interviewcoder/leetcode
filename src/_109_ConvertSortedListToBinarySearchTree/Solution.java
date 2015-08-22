/**
 * Time : O(); Space: O()
 * @tag : Depth-first Search; Linked List
 * @by  : Steven Cooks
 * @date: Jun 14, 2015
 ***************************************************************
 * Description: 
 * 
 * Given a singly linked list where elements are sorted        *
 * in ascending order, convert it to a height balanced BST.    *
 ***************************************************************
 * {@link https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/ }
 * 1. how to get middle index (len - 1) / 2 v.s. len / 2;
 */
package _109_ConvertSortedListToBinarySearchTree;

import com.leetcode.ListNode;
import com.leetcode.TreeNode;

/** see test {@link _109_ConvertSortedListToBinarySearchTree.SolutionTest } */
public class Solution {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        int len = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            len++;
        }
        return sortedListToBST(head, len);
    }

    private TreeNode sortedListToBST(ListNode head, int len) {
        // base case
        if (len == 0) {
            return null;
        }
        if (len == 1) {
            return new TreeNode(head.val);
        }
        // recursive case
        int middle = (len - 1) / 2;
        ListNode node = head;
        for (int i = 0; i < middle; i++) {
            node = node.next;
        }
        TreeNode root = new TreeNode(node.val);
        root.left = sortedListToBST(head, middle);
        root.right = sortedListToBST(node.next, len - middle - 1);
        return root;
    }

}
