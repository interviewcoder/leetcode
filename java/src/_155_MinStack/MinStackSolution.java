/**
 * Time : O(); Space : O()
 * @tag : Stack; Data Structure
 * @by  : Steven Cooks
 * @date: Jun 27, 2015
 *******************************************************************************
 * Description: 
 * 
 * Design a stack that supports push, pop, top, and retrieving the 
 * minimum element in constant time. 
 * 
 *  push(x)  -- Push element x onto stack. 
 *  pop()    -- Removes the element on top of the stack. 
 *  top()    -- Get the top element. 
 *  getMin() -- Retrieve the minimum element in the stack.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/min-stack/ }
 */
package _155_MinStack;

import java.util.Stack;

/**
 * If we have one extra stack to store minimum numbers, it is easy. If we want
 * to save this extra stack, we push the current minimum number into the same
 * stack we are using.
 */
public class MinStackSolution {

    private Stack<Integer> stack = new Stack<>();

    private int min;

    public void push(int x) {
        if (stack.empty()) {
            min = x;
        } else if (x <= min) {
            // ! not x < min
            // bury the current minimum value under x
            // so that we can get minimum when 'x' is popped out.
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        check(!stack.empty(), "no element");
        if (stack.pop() == min) {
            if (!stack.empty()) {
                min = stack.pop();
            }
        } 
    }

    public int top() {
        check(!stack.empty(), "no element");
        return stack.peek();
    }

    public int getMin() {
        check(!stack.empty(), "no element");
        return min;
    }
    
    private void check(boolean condition, String msg) {
        if (!condition) {
            System.err.println(msg);
        }
    }

    @Override
    public String toString() {
        return "MinStackSolution [stack=" + stack + ", min=" + min + "]";
    }

}
