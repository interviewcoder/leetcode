/**
 * Time : O(N); Space : O(1)
 * @tag : Linked List
 * @by  : Steven Cooks
 * @date: Jun 25, 2015
 * {@link https://leetcode.com/problems/remove-linked-list-elements/ }
 */
package _203_RemoveLinkedListElements;

import com.leetcode.ListNode;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode node = dummy.next;
        while (node != null) {
            if (node.val == val) {
                // delete current node
                pre.next = node.next;
            } else {
                pre = pre.next;
            }
            // go to next node
            node = node.next;
        }
        return dummy.next;
    }
}
