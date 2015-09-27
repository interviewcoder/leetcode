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
    
    // bottom-up recursion
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode rHead = reverseList(next);
        next.next = head;
        head.next = null;
        return rHead;
    }

    // top-down
    public ListNode reverseList2(ListNode head) {
        return reverseList2(head, null);
    }

    // put `head` node as the new reversed head, and then recursively reverse the rest
    //      3 -> 2 -> 1 -> null      4 -> 5
    //      |                        |
    //      reverseHead              head
    // ==>
    //      4 -> 3 -> 2 -> 1 -> null      5
    //      |                             |  
    //      reverseHead                   head
    private ListNode reverseList2(ListNode head, ListNode reverseHead) {
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
        return reverseList2(head, reverseHead);
    }
}
