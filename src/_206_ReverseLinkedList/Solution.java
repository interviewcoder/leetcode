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
        ListNode tail = head;
        ListNode node = head.next;
        while (node != null) {
            // put current node as the new head of reversed list
            tail.next = node.next;
            node.next = reverseHead;
            reverseHead = node;
            // for next step
            node = tail.next;
        }
        return reverseHead;
    }

}
