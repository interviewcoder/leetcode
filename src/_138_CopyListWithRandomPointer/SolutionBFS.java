/**
 * Time : O(N); Space: O(N)
 * @tag : Hash Table; Linked List
 * @date: Jun 20, 2015
 * @by  : Steven Cooks
 * {@link https://leetcode.com/problems/copy-list-with-random-pointer/ }
 */
package _138_CopyListWithRandomPointer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/** see test {@link _138_CopyListWithRandomPointer.SolutionBFSTest } */
public class SolutionBFS {

    // BFS version
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return head;
        }
        RandomListNode headCopy = new RandomListNode(head.label);
        // map for node and its copy
        Map<RandomListNode, RandomListNode> copyMap = new HashMap<>();
        // queue for nodes in searching
        Queue<RandomListNode> queue = new LinkedList<>();

        queue.add(head);
        copyMap.put(head, headCopy);

        while (!queue.isEmpty()) {
            RandomListNode node = queue.poll();
            // for next pointer
            copyMap.get(node).next = copy(node.next, copyMap, queue);
            copyMap.get(node).random = copy(node.random, copyMap, queue);
        }

        return headCopy;
    }

    // for null node, push it into queue and return its copy.
    private RandomListNode copy(RandomListNode node,
            Map<RandomListNode, RandomListNode> copyMap,
            Queue<RandomListNode> queue) {
        RandomListNode nodeCopy = null;
        if (copyMap.containsKey(node)) {
            nodeCopy = copyMap.get(node);
        } else if (node != null) {
            nodeCopy = new RandomListNode(node.label);
            queue.add(node);
            copyMap.put(node, nodeCopy);
        }
        return nodeCopy;
    }

}
