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

/** see test {@link _160_IntersectionOfTwoLinkedLists.SolutionTest } */
public class Solution {

    /**
     *  Assuming longer list's length is <em>m</em>, shorter list's length is <em>n</em>,
     *  and the distance between intersecting position and list end is <em>l</em>
     *               (m + n - l)
     *                    |
     *  |==========!==|+++!++|
     *                            => two pointers will meet at position (m + n - l)
     *  |+++!++|==========!==| 
     *                    |
     *               (m + n - l)
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        // loop until nodes meet or both nodes come to list end (i.e. null)
        while (nodeA != nodeB) {
            // after listA is finished, scan from head of listB
            nodeA = nodeA != null ? nodeA.next : headB;
            nodeB = nodeB != null ? nodeB.next : headA;
        }
        return nodeA;
    }

}
