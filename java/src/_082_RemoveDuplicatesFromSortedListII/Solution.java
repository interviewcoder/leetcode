/**
 * Time : O(N) ; Space: O(1)
 * @tag : Linked List
 * @by  : Steven Cooks
 * @date: Jun 7, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a sorted linked list, delete all nodes that have duplicate numbers, 
 * leaving only distinct numbers from the original list. 
 * 
 * For example, 
 * Given 1->2->3->3->4->4->5, return 1->2->5. 
 * Given 1->1->1->2->3, return 2->3.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/ }
 */
package _082_RemoveDuplicatesFromSortedListII;

import com.leetcode.ListNode;

/**
 * <p>
 * A node is <em>unique</em> only when its has different value from its 
 * previous node and its post node.
 * <p>
 * So for each node, we first find the last node has its value (which is 
 * then has different value from it post node), and then compare with its
 * previous node. (pre.next == node ?)
 * <p>
 *      <p>pre   node             last    post     </p>
 *      <p> 0----> 1 ----> 1 ----> 1 ----> 2       </p>
 * </p>      
 * Another way to understand <em>unique</em> is that node is unique if it 
 * shows up only once, so see {@link _082_RemoveDuplicatesFromSortedListII.SolutionCount }
 * <p>see test {@link _082_RemoveDuplicatesFromSortedListII.SolutionTest } </p>
 * @reference: {@link https://leetcode.com/discuss/12724/my-accepted-java-code }
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy; // last unique node we found
        ListNode node = pre.next;
        while (node != null) {
            // find the last node that has the same value as current node
            while (node.next != null && node.next.val == node.val) {
                node = node.next;
            }
            // now, node has different value from its next node (if next
            // node exists), we need to compare with previous node to
            // see whether `node` has unique value
            if (pre.next == node) {
                // ! don't use (pre.val == node.val) unless you are sure
                // dummy has different value from head node
                pre = pre.next;
            } else {
                pre.next = node.next;
            }
            node = node.next;
        }
        return dummy.next;
    }

}
