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
 * l1 single digit. Add the two numbers and return it as l1 linked list. 
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
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            node.next = new ListNode(sum % 10);
            node = node.next;
            carry = sum / 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return dummy.next;
    }

}
