/**
 * Time : O(N); Space : O(1)
 * @tag : Linked List; Math
 * @by  : Steven Cooks
 * @date: Jul 15, 2015
 *******************************************************************************
 * Description: 
 * 
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain 
 * a single digit. Add the two numbers and return it as a linked list. 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) 
 * Output: 7 -> 0 -> 8
 * 
 *******************************************************************************
 * Similar to Leetcode[067]
 * {@link https://leetcode.com/problems/add-two-numbers/ }
 */
package _002_AddTwoNumbers;

import com.leetcode.ListNode;

/** see test {@link _002_AddTwoNumbers.SolutionTest } */
public class Solution {

    /**
     *  Add until both lists reach end and no positive carry left.
     *  Be careful to test null before reference node's value
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        while (h1 != null || h2 != null || carry > 0) {
            int n1 = 0;
            int n2 = 0;
            if (h1 != null) {
                n1 = h1.val;
                h1 = h1.next;
            }
            if (h2 != null) {
                n2 = h2.val;
                h2 = h2.next;
            }
            int num = n1 + n2 + carry;
            node.next = new ListNode(num % 10);
            node = node.next;
            carry = num / 10;
        }
        return dummy.next;
    }

}
