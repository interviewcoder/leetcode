/**
 * Time : O(N); Space: O(1)
 * @tag : Linked List; Two Pointers
 * @by  : Steven Cooks
 * @date: 05.04.2015
 *************************************************************************
 * Description: 
 * 
 * Given a linked list, remove the nth node from the end of list and return 
 * its head. 
 * 
 * For example, 
 * Given linked list: 1->2->3->4->5, and n = 2. 
 * After removing the second node from the end, the linked list 
 * becomes 1->2->3->5. 
 * 
 * Note: 
 * Given n will always be valid. Try to do this in one pass.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/remove-nth-node-from-end-of-list/ }
 * 1. slow-fast two pointers on linked list
 */
package _019_RemoveNthNodeFromEndOfList;

import com.leetcode.ListNode;

/** see test {@link _019_RemoveNthNodeFromEndOfList.SolutionTest } */
public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return null;
        }
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode fast = dummyHead;
        ListNode slow = dummyHead;

        // let fast point go n steps itself
        for (int i = 0; i < n; i++) {
            assert (fast != null);
            fast = fast.next;
        }

        // fast and slow go together
        // until fast reaches the end of list
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // now slow should pointing to the node
        // before which we want to remove
        slow.next = slow.next.next;

        return dummyHead.next;
    }

}
