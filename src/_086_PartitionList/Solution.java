/**
 * Time : O(N); Space: O(1)
 * @tag : Linked List; Two Pointers
 * @by  : Steven Cooks
 * @date: Jun 8, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a linked list and a value x, partition it such that all nodes less 
 * than x come before nodes greater than or equal to x. 
 * 
 * You should preserve the original relative order of the nodes in each of 
 * the two partitions. 
 * 
 * For example, 
 * Given 1->4->3->2->5->2 and x = 3, return 1->2->2->4->3->5.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/partition-list/ }
 */
package _086_PartitionList;

import com.leetcode.ListNode;

/** see test {@link _086_PartitionList.SolutionTest } */
public class Solution {

    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            // empty list or list of only one node
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        while (fast.next != null) {
            if (fast.next.val < x) {
                if (slow == fast) {
                    // no greater-than and equal-to value appeared so far
                    fast = fast.next;
                } else {
                    // reconnect nodes
                    ListNode post = fast.next.next;
                    fast.next.next = slow.next;
                    slow.next = fast.next;
                    fast.next = post;
                }
                slow = slow.next;
            } else {
                // greater-than or equal-to value appears
                fast = fast.next;
            }
        }

        return dummy.next;
    }

}