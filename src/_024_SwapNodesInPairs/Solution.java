/**
 * Time : O() ; Space: O()
 * @tag : Linked List
 * @by  : Steven Cooks
 * @date: Jul 20, 2015
 ***************************************************************************
 * Description:
 * 
 * Given a linked list, swap every two adjacent nodes and return its head. 
 * 
 * For example, Given 1->2->3->4, you should return the list as 2->1->4->3. 
 * 
 * Your algorithm should use only constant space. You may not modify the 
 * values in the list, only nodes itself can be changed.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/swap-nodes-in-pairs/ }
 */
package _024_SwapNodesInPairs;

import com.leetcode.ListNode;

/** see test {@link _024_SwapNodesInPairs.SolutionTest } */
public class Solution {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode cur = pre.next;
        while (cur != null && cur.next != null) {
            ListNode post = cur.next.next;

            // swap cur and cur.next
            pre.next = cur.next;
            cur.next.next = cur;
            cur.next = post;
            
            pre = pre.next.next;
            cur = post;
        }
        return dummy.next;
    }

}
