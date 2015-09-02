/**
 * Time : O() ; Space: O()
 * @tag : Stack; Data Structure
 * @by  : Steven Cooks
 * @date: Aug 21, 2015
 ***************************************************************************
 * Description:
 * 
 * Implement the following operations of a queue using stacks. 
 *  push(x) -- Push element x to the back of queue.
 *  pop()   -- Removes the element from in front of queue.
 *  peek()  -- Get the front element.
 *  empty() -- Return whether the queue is empty.
 * Notes: 
 * You must use only standard operations of a stack -- which means only push to 
 * top, peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, stack may not be supported natively. You may 
 * simulate a stack by using a list or deque (double-ended queue), as long as 
 * you use only standard operations of a stack.
 * 
 * You may assume that all operations are valid (for example, no pop or peek 
 * operations will be called on an empty queue).
 *
 ***************************************************************************
 * {@link https://leetcode.com/problems/implement-queue-using-stacks/ }
 */
package _232_ImplementQueueUsingStacks;

import java.util.NoSuchElementException;
import java.util.Stack;

/** see test {@link _232_ImplementQueueUsingStacks.SolutionTest } */
public class Solution {

    // container for newly pushed item
    private Stack<Integer> pushStack = new Stack<>();

    // container in which items are in 'queue' order
    private Stack<Integer> peekStack = new Stack<>();

    // Push element x to the back of queue.
    public void push(int x) {
        pushStack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        transfer();
        peekStack.pop();
    }

    // Get the front element.
    public int peek() {
        transfer();
        return peekStack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return pushStack.isEmpty() && peekStack.isEmpty();
    }

    // if peek stack is empty
    // transfer all elements from push stack to peek stack
    private void transfer() {
        if (peekStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                peekStack.push(pushStack.pop());
            }
        }
        if (peekStack.isEmpty()) {
            throw new NoSuchElementException("queue underflow");
        }
    }

}
