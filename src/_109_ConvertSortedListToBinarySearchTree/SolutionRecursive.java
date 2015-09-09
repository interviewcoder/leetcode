/**
 * Time : O(N); Space: O(N)
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
 */
package _109_ConvertSortedListToBinarySearchTree;

import com.leetcode.ListNode;
import com.leetcode.TreeNode;

/** see test {@link _109_ConvertSortedListToBinarySearchTree.SolutionRecursiveTest } */
public class SolutionRecursive{

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        
        // find the node right before middle node
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode pre = slow;
        ListNode cur = slow.next;
        pre.next = null;

        TreeNode root = new TreeNode(cur.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(cur.next);
        return root;
    }

}
