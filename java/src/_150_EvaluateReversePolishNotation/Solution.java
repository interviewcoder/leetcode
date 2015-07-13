/**
 * Time : O(N); Space: O(N)
 * @tag : Stack
 * @by  : Steven Cooks
 * @date: 05.06.2015
 *************************************************************************
 * Description: 
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation. 
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression. 
 * Some examples: 
 *  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9 
 *  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/evaluate-reverse-polish-notation/ }
 * -----------------------------------------------------------------------
 * 1. use interface as work-around for lambda expression in Java
 * 2. two-brace initialization for hash map
 */
package _150_EvaluateReversePolishNotation;

import java.util.Map;
import java.util.Stack;
import java.util.HashMap;

/** see test {@link _150_EvaluateReversePolishNotation.SolutionTest } */
public class Solution {

    /** use interface as work-around for lambda expression */
    public interface Operator {
        int eval(int x, int y);
    }

    /**
     * global map for operator and its corresponding operation
     */
    @SuppressWarnings("serial")
    public static final Map<String, Operator> OperatorMap = new HashMap<String, Solution.Operator>() {
        {
            put("+", new Operator() {
                public int eval(int x, int y) {
                    return x + y;
                }
            });
            put("-", new Operator() {
                public int eval(int x, int y) {
                    return x - y;
                }
            });
            put("*", new Operator() {
                public int eval(int x, int y) {
                    return x * y;
                }
            });
            put("/", new Operator() {
                public int eval(int x, int y) {
                    return x / y;
                }
            });
        }
    };

    /**
     * For operands (numbers), push them into stack for later use;
     * For operators (+,-,*,/), retrieve the latest two operands in stack
     * , evaluate the result and then push the result back to stack 
     */
    public int evalRPN(String[] tokens) {
        Stack<Integer> operands = new Stack<Integer>();
        for (String token : tokens) {
            if (OperatorMap.containsKey(token)) {
                // for operator: calculate operation and then push to stack
                int op2 = operands.pop();
                int op1 = operands.pop();
                operands.push(OperatorMap.get(token).eval(op1, op2));
            } else {
                // for operand: push to stack
                operands.push(Integer.parseInt(token));
            }
        }
        return operands.pop();
    }

}
