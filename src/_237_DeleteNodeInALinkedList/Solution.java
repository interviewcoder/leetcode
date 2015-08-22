/**
 * Time : O() ; Space: O()
 * @tag : Linked List
 * @by  : Steven Cooks
 * @date: Aug 19, 2015
 ***************************************************************************
 * Description:
 * 
 * Write a function to delete a node (except the tail) in a singly linked list, 
 * given only access to that node. 
 * 
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node 
 * with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
 *
 ***************************************************************************
 * {@link https://leetcode.com/problems/delete-node-in-a-linked-list/ }
 */
package _237_DeleteNodeInALinkedList;

import com.leetcode.ListNode;

/** see test {@link _237_DeleteNodeInALinkedList.SolutionTest } */
public class Solution {

    /** copy next node's value to current node */
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            node = null; 
            return;
        }
        ListNode pre = node;
        while (node.next != null) {
            node.val = node.next.val;
            pre = node;
            node = node.next;
        }
        pre.next = null;
    }

}
