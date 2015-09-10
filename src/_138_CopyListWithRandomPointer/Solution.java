/**
 * Time : O(N); Space: O(N)
 * @tag : Hash Table; Linked List
 * @by  : Steven Cooks
 * @date: Jun 20, 2015
 *************************************************************************
 * Description:
 * 
 * A linked list is given such that each node contains an additional random 
 * pointer which could point to any node in the list or null. 
 * 
 * Return a deep copy of the list.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/copy-list-with-random-pointer/ }
 */
package _138_CopyListWithRandomPointer;

import java.util.HashMap;
import java.util.Map;

/** see test {@link _138_CopyListWithRandomPointer.SolutionTest } */
public class Solution {
    
    private Map<RandomListNode, RandomListNode> randomMap = new HashMap<>();
    
    // DFS version
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return head;
        }
        // avoid duplicated copying
        if (randomMap.containsKey(head)) {
            return randomMap.get(head);
        }
        // construct a new node
        RandomListNode copyHead = new RandomListNode(head.label);
        randomMap.put(head, copyHead);

        // copy next pointer
        copyHead.next = copyRandomList(head.next);
        // copy random pointer
        copyHead.random = copyRandomList(head.random);

        return copyHead;
    }
}
