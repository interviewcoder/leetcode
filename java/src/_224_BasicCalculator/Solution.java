/**
 * Time : O(); Space : O()
 * @tag : Stack; Math
 * @date: Jul 2, 2015
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
 * {@link https://leetcode.com/problems/basic-calculator/ }
 */
package _224_BasicCalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Solution {

    // define functional type
    public interface Operation {
        public int eval(int op1, int op2);
    }

    private Map<String, Operation> OperatorMap = new HashMap<>();

    private Set<Character> splitors = new HashSet<>();

    public int calculate(String s) {
        if (s.length() == 0) {
            return 0;
        }
        learnOperators();
        List<String> strs = parseStr(s);
        Stack<String> ops = new Stack<>();
        for (String token : strs) {
            if (token.equals(")")) {
                // calculate result from the inner most bracket
                int op = eval(ops);
                ops.push("" + op);
            } else {
                ops.push(token);
            }
        }
        int result = eval(ops);
        return result;
    }

    private void learnOperators() {
        OperatorMap.put("+", new Operation() {
            @Override
            public int eval(int op1, int op2) {
                return op1 + op2;
            }
        });

        OperatorMap.put("-", new Operation() {
            @Override
            public int eval(int op1, int op2) {
                return op1 - op2;
            }
        });

        splitors.add(' ');
        splitors.add('+');
        splitors.add('-');
        splitors.add('(');
        splitors.add(')');
    }

    private List<String> parseStr(String s) {
        List<String> strings = new ArrayList<>();
        String numStr = "";
        for (char ch : s.toCharArray()) {
            if (splitors.contains(ch)) {
                // if accumulating number, then stop
                if (!numStr.isEmpty()) {
                    strings.add(numStr);
                    numStr = "";
                }
                if (ch != ' ') {
                    strings.add("" + ch);
                }
            } else {
                numStr += ch;
            }
        }
        // don't forget the last one
        if (!numStr.isEmpty()) {
            strings.add(numStr);
        }
        return strings;
    }

    private int eval(Stack<String> ops) {
        // calculate until we met "(" or stack is empty
        Stack<String> stack = new Stack<>();
        while (!ops.isEmpty()) {
            String op = ops.pop();
            if (op.equals("(")) {
                break;
            }
            stack.push(op);
        }
        while (!stack.isEmpty()) {
            if (stack.size() == 1) {
                return Integer.parseInt(stack.pop());
            } else {
                int op1 = Integer.parseInt(stack.pop());
                String op = stack.pop();
                int op2 = Integer.parseInt(stack.pop());
                stack.push("" + OperatorMap.get(op).eval(op1, op2));
            }
        }
        return 0;
    }

}
