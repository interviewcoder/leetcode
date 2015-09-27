/**
 * Time : O(N); Space : O(1)
 * @tag : Linked List
 * @by  : Steven Cooks
 * @date: Jun 25, 2015
  *******************************************************************************
 * Description: 
 * 
 * Reverse a singly linked list.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/reverse-linked-list/ }
 */
package _206_ReverseLinkedList;

import com.leetcode.ListNode;

/** see test {@link _206_ReverseLinkedList.SolutionTest } */
public class Solution {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode reverseHead = head;
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            pre.next = cur.next;
            cur.next = reverseHead;
            reverseHead = cur;

            // for next step
            cur = pre.next;
        }
        return reverseHead;
    }

    // use dummy head
    public ListNode reverseList_Dummy(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = head;
        ListNode cur = head.next; 
        while (cur != null) {
            pre.next = cur.next;
            cur.next = dummy.next;
            dummy.next = cur;
            
            cur = pre.next;
        }
        return dummy.next;
    }


}
