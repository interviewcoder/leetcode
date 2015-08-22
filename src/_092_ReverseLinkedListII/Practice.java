/**
 *************************************************************************
 * Description:
 * 
 * Reverse a linked list from position m to n. Do it in-place and in one-pass. 
 * 
 * For example: 
 * Given 1->2->3->4->5->NULL, m = 2 and n = 4, return 1->4->3->2->5->NULL. 
 * 
 * Note: Given m, n satisfy the following condition: 1 ≤ m ≤ n ≤ length of list.
 * 
 *************************************************************************
 * @tag : Linked List
 * {@link https://leetcode.com/problems/reverse-linked-list-ii/ }
 */
package _092_ReverseLinkedListII;

import com.leetcode.ListNode;

/** see test {@link _092_ReverseLinkedListII.PracticeTest } */
public class Practice {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        // let fast walks (m - 1) steps to node before reversing head
        for (int i = 0; i < (m - 1); i++) {
            fast = fast.next;
        }
        ListNode preReverse = fast;
        ListNode reverseHead = fast.next;
        ListNode pre = reverseHead;
        for (int i = 0; i < (n - m); i++) {
            ListNode cur = pre.next;
            pre.next = cur.next;
            cur.next = reverseHead;
            reverseHead = cur;
        }
        preReverse.next = reverseHead;
        return dummy.next;
    }

}
