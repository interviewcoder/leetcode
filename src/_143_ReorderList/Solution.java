/**
 * Time : O(N) ; Space: O(1)
 * @tag : Linked List
 * @by  : Steven Cooks
 * @date: Jul 20, 2015
 ***************************************************************************
 * Description:
 * 
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln, 
 * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→… 
 * 
 * You must do this in-place without altering the nodes' values. 
 * 
 * For example, Given {1,2,3,4}, reorder it to {1,4,2,3}.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/reorder-list/ }
 */
package _143_ReorderList;

import com.leetcode.ListNode;

/** see test {@link _143_ReorderList.SolutionTest } */
public class Solution {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode dummy = new ListNode(0);
        ListNode fast = head;
        ListNode slow = head;
        // let slow stops at the middle node
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        // reverse from slow.next to end
        ListNode preMiddle = slow;
        ListNode preCurrent = slow.next;
        while (preCurrent.next != null) {
            ListNode current = preCurrent.next;
            preCurrent.next = current.next;
            current.next = preMiddle.next;
            preMiddle.next = current;
        }

        ListNode l2 = preMiddle.next;
        slow.next = null;

        // merge two lists (l2 might be one node less than l1)
        ListNode l1 = head;
        ListNode node = dummy;
        while (l2 != null) {
            node.next = l1;
            l1 = l1.next;
            node = node.next;
            node.next = l2;
            l2 = l2.next;
            node = node.next;
        }
        // last node in list1
        node.next = l1;
    }

}
