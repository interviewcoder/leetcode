/**
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
 * @tag : Linked List; Two Pointers
 * {@link https://leetcode.com/problems/rotate-list/ }
 */
package _061_RotateList;

import com.leetcode.ListNode;

/** see test {@link _061_RotateList.PracticeTest } */
public class Practice {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k < 0) {
            return head;
        }
        // in case k is larger than length
        int len = 0;
        ListNode cur = head;
        while (cur != null && len < k) {
            cur = cur.next;
            len++;
        }
        k = (cur == null) ? (k % len) : k;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        cur = head;
        for (int i = 0; i < k; i++) {
            cur = cur.next;
        }
        ListNode pre = head;
        while (cur.next != null) {
            cur = cur.next;
            pre = pre.next;
        }
        // rotate list
        cur.next = head;
        // connect to new list node
        dummy.next = pre.next;
        pre.next = null;
        return dummy.next;
    }

}
