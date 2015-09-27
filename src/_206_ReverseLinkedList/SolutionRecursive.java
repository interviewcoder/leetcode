/**
 * Time : O(N); Space : O(N)
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

/** see test {@link _206_ReverseLinkedList.SolutionRecursiveTest } */
public class SolutionRecursive {

    public ListNode reverseList(ListNode head) {
        return reverseList(head, null);
    }

    // put `head` node as the new reversed head, and then recursively reverse the rest
    //      3 -> 2 -> 1 -> null      4 -> 5
    //      |                        |
    //      reverseHead              head
    // ==>
    //      4 -> 3 -> 2 -> 1 -> null      5
    //      |                             |  
    //      reverseHead                   head
    private ListNode reverseList(ListNode head, ListNode reverseHead) {
        // base case
        if (head == null) {
            // when no nodes left to reverse, return reversedHead
            return reverseHead;
        }
        // recursive case
        ListNode headNext = head.next;
        head.next = reverseHead;
        // for next recursive call
        reverseHead = head;
        head = headNext;
        return reverseList(head, reverseHead);
    }
}
