/**
 * Time : O(); Space: O()
 * @tag : Linked List; Two Pointers
 * @by  : Steven Cooks
 * @date: Jun 4, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a list, rotate the list to the right by k places, where k is 
 * non-negative. 
 * For example: 
 *  Given 1->2->3->4->5->NULL and k = 2, 
 *  return 4->5->1->2->3->NULL.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/rotate-list/ }
 * P.S. : dummy head + two pointers
 */
package _061_RotateList;

import com.leetcode.ListNode;

/** see test {@link _061_RotateList.SolutionTest } */
public class Solution {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }

        // create dummy head
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        // count the length of list
        int len = 0;
        while (fast.next != null) {
            len++;
            fast = fast.next;
        }
        fast = dummy;

        k = k % len;
        if (k != 0) {
            // let fast pointer itself moves k steps
            for (int i = 0; i < k; i++) {
                fast = fast.next;
            }
            // let fast and slow move together until fast reaches the last node
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
            // reconnect
            fast.next = dummy.next;
            dummy.next = slow.next;
            slow.next = null;
        }

        return dummy.next;
    }

}
