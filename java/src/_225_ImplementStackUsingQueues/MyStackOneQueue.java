/**
 * Time : O(); Space : O()
 * @tag : Data Structure
 * @by  : Steven Cooks
 * @date: Jul 4, 2015
 * {@link https://leetcode.com/problems/implement-stack-using-queues/ }
 */
package _225_ImplementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

/** see test {@link _225_ImplementStackUsingQueues.MyStackOneQueueTest } */
class MyStackOneQueue {
    
    private Queue<Integer> main = new LinkedList<>();
    
    // O(N) Push element x onto stack.
    public void push(int x) {
        int size = main.size();
        main.offer(x);
        // add all elements before x in queue to end of queue
        for (int i = 0; i < size; i++) {
            main.offer(main.poll());
        }
    }

    // O(1) Removes the element on top of the stack.
    public void pop() {
        main.poll();
    }

    // O(1) Get the top element.
    public int top() {
        return main.peek();
    }

    // O(1) Return whether the stack is empty.
    public boolean empty() {
        return main.isEmpty();
    }

}
