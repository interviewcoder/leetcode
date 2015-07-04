/**
 * Time : O(); Space : O()
 * @tag : Data Structure
 * @by  : Steven Cooks
 * @date: Jul 4, 2015
 *******************************************************************************
 * Description: 
 * 
 * Implement the following operations of a stack using queues. 
 *  push(x) -- Push element x onto stack. 
 *  pop() -- Removes the element on top of the stack. 
 *  top() -- Get the top element. 
 *  empty() -- Return whether the stack is empty. 
 *  
 * Notes: 
 * 
 * You must use only standard operations of a queue -- which means only 
 * push to back, peek/pop from front, size, and is empty operations are valid. 
 * Depending on your language, queue may not be supported natively. You may 
 * simulate a queue by using a list or deque (double-ended queue), as long 
 * as you use only standard operations of a queue. 
 * 
 * You may assume that all operations are valid (for example, no pop or 
 * top operations will be called on an empty stack).
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/implement-stack-using-queues/ }
 */
package _225_ImplementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

/** 
 * see also implementation with only one Queue {@link _225_ImplementStackUsingQueues.MyStackOneQueue }
 * see test {@link _225_ImplementStackUsingQueues.MyStackSolutionTest } */
class MyStackSolution {
    
    private Queue<Integer> main = new LinkedList<>();
    
    private Queue<Integer> help = new LinkedList<>();

    // O(N) Push element x onto stack.
    public void push(int x) {
        help.offer(x);
        while (!main.isEmpty()) {
            help.offer(main.poll());
        }
        main = new LinkedList<>(help);
        help.clear();
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
