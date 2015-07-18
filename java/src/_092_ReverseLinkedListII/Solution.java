/**
 * Time : O(N); Space: O(1)
 * @tag : Linked List
 * @date: Jun 13, 2015
 * @by  : Steven Cooks
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
 * {@link https://leetcode.com/problems/reverse-linked-list-ii/ }
 * Do it in-place and in one-pass.
 * 1 <= m <= n <= length is satisfied.
 */
package _092_ReverseLinkedListII;

import com.leetcode.ListNode;

/** see test {@link _092_ReverseLinkedListII.SolutionTest } */
public class Solution {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        // let pre walks (m - 1) steps itself
        for (int i = 0; i < m - 1; i++) {
            pre = pre.next;
        }
        ListNode start = pre.next;
        ListNode then = start.next;
        // reverse nodes between m and n
        for (int i = 0; i < n -m; i++) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        return dummy.next;
    }

}
