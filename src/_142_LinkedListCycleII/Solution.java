/**
 * Time : O(N); Space : O(N)
 * @tag : Linked List; Two Pointers
 * @by  : Steven Cooks
 * @date: Jul 2, 2015
 ***************************************************************************
 * Description: 
 * 
 * Given a linked list, return the node where the cycle begins. 
 * If there is no cycle, return null. 
 * 
 * Follow up: 
 * 
 * Can you solve it without using extra space?
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/linked-list-cycle-ii/ }
 */
package _142_LinkedListCycleII;

import java.util.HashSet;
import java.util.Set;

import com.leetcode.ListNode;

/** see test {@link _142_LinkedListCycleII.SolutionTest } */
public class Solution {

    private Set<ListNode> nodeSet = new HashSet<>();

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode node = head;
        while (node != null && !nodeSet.contains(node)) {
            nodeSet.add(node);
            node = node.next;
        }
        return node;
    }
    
}
