/**
 *************************************************************************
 * Description:
 * 
 * A linked list is given such that each node contains an additional random 
 * pointer which could point to any node in the list or null. 
 * 
 * Return a deep copy of the list.
 * 
 *************************************************************************
 * @tag : Hash Table; Linked List
 * {@link https://leetcode.com/problems/copy-list-with-random-pointer/ }
 */
package _138_CopyListWithRandomPointer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/** see test {@link _138_CopyListWithRandomPointer.PracticeTest } */
public class Practice {

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return head;
        }
        Queue<RandomListNode> queue = new LinkedList<>();
        Map<RandomListNode, RandomListNode> copyMap = new HashMap<>();

        queue.offer(head);
        RandomListNode copyHead = new RandomListNode(head.label);
        copyMap.put(head, copyHead);

        while (!queue.isEmpty()) {
            RandomListNode node = queue.poll();
            copyMap.get(node).next = copyNode(node.next, queue, copyMap);
            copyMap.get(node).random = copyNode(node.random, queue, copyMap);
        }
        return copyHead;
    }

    private RandomListNode copyNode(RandomListNode node,
            Queue<RandomListNode> queue, Map<RandomListNode, RandomListNode> map) {
        if (node == null) {
            return node;
        }
        if (map.containsKey(node)) {
            return map.get(node);
        }
        RandomListNode copy = new RandomListNode(node.label);
        map.put(node, copy);
        queue.offer(node);
        return copy;
    }

}
