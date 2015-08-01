/**
 ***************************************************************************
 * Description: 
 * 
 * Implement a basic calculator to evaluate a simple expression string. 
 * 
 * The expression string may contain open ( and closing parentheses ), 
 * the plus + or minus sign -, non-negative integers and empty spaces . 
 * 
 * You may assume that the given expression is always valid. 
 * Some examples: 
 *  "1 + 1" = 2 
 *  " 2-1 + 2 " = 3 
 *  "(1+(4+5+2)-3)+(6+8)" = 23 
 *  
 * Note: Do not use the eval built-in library function.
 * 
 ***************************************************************************
 * @tag : Stack; Math
 * {@link https://leetcode.com/problems/basic-calculator/ }
 */
package _224_BasicCalculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/** see test {@link _224_BasicCalculator.PracticeTest } */
public class Practice {

    // operator and its corresponding operations
    private Map<Character, Operator> OperatorMap = new HashMap<>();

    public int calculate(String s) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        learnOperators();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')') {
                // calculate result and push it to operands stack
                int op1 = operands.pop();
                int op2 = operands.pop();
                operands.push(OperatorMap.get(operators.pop()).eval(op1, op2));
            } else if (OperatorMap.containsKey(ch)) {
                operators.push(ch);
            } else if (Character.isDigit(ch)) {
                // digit
                num = num * 10 + (ch - '0');
                if (i == s.length() - 1 || !Character.isDigit(s.charAt(i + 1))) {
                    System.out.println("num: " + num);
                    operands.push(num);
                    num = 0;
                }
            }
            // neglect empty space and left parenthesis
        }
        while (!operators.isEmpty()) {
                int op1 = operands.pop();
                int op2 = operands.pop();
                operands.push(OperatorMap.get(operators.pop()).eval(op1, op2));
        }
        return operands.pop();
    }

    // map operator to its corresponding operation
    private void learnOperators() {
        OperatorMap.put('+', new Operator() {
            @Override
            public int eval(int op1, int op2) {
                return op1 + op2;
            }
        });
        OperatorMap.put('-', new Operator() {
            @Override
            public int eval(int op1, int op2) {
                return op2 - op1;
            }
        });
    }

    // interface is like header file in c++, where you put method signatures
    public interface Operator {
        public int eval(int op1, int op2);
    }

}
