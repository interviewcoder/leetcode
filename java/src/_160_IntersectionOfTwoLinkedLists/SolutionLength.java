/**
 * Time : O(m + n) ; Space: O(1)
 * @tag : Linked List
 * @by  : Steven Cooks
 * @date: Aug 10, 2015
 ***************************************************************************
 * Description:
 *
 * Write a program to find the node at which the intersection of two singly linked 
 * lists begins. 
 * 
 * For example, the following two linked lists: 
 * A:          a1 → a2 
 *                    ↘ 
 *                     c1 → c2 → c3 
 *                   ↗
 * B:     b1 → b2 → b3 
 * begin to intersect at node c1. 
 * 
 * Notes: 
 * If the two linked lists have no intersection at all, return null. 
 * The linked lists must retain their original structure after the function 
 * returns.
 * You may assume there are no cycles anywhere in the entire linked structure. 
 * Your code should preferably run in O(n) time and use only O(1) memory.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/intersection-of-two-linked-lists/ }
 */
package _160_IntersectionOfTwoLinkedLists;

import com.leetcode.ListNode;

/** see test {@link _160_IntersectionOfTwoLinkedLists.SolutionLengthTest } */
public class SolutionLength {

    /**
     * 1) count the lengths of two lists 
     * 2) set starting scan point at the same length to list end
     * 3) scan for same list node
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getListLength(headA);
        int lenB = getListLength(headB);
        if (lenA < lenB) {
            return getIntersectionNode(headB, headA);
        }
        ListNode nodeA = headA;
        // move nodeA to the position where it has same steps to list
        // end as nodeB
        for (int i = 0; i < lenA - lenB; i++) {
            nodeA = nodeA.next;
        }
        ListNode nodeB = headB;
        while (nodeA != null) {
            if (nodeA == nodeB) {
                return nodeA;
            }
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return null;
    }

    // return the length of linked list
    private int getListLength(ListNode head) {
        int len = 0;
        ListNode node = head;
        while (node != null) {
            len++;
            node = node.next;
        }
        return len;
    }

}
