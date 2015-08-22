/**
 * Time : O(N) ; Space O(N)
 * @tag : Stack; String
 * @by  : Steven Cooks
 * @date: 04.27.2015
 *******************************************************************************
 * Description: 
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid. 
 * The brackets must close in the correct order, "()" and "()[]{}" are all 
 * valid but "(]" and "([)]" are not.
 *
 *******************************************************************************
 * {@link https://leetcode.com/problems/valid-parentheses/ }
 */
package _020_ValidParentheses;

import java.util.Stack;

/** see test {@link _020_ValidParentheses.SolutionVerboseTest } */
public class SolutionVerbose {
    public boolean isValid(String s) {
        Stack<Character> leftParenthesesStack = new Stack<Character>();
        int len = s.length();
        if (len % 2 != 0) {
            // for odd-number length, there is no change to be valid;
            return false;
        }

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                // push left parentheses into stack
                leftParenthesesStack.add(ch);
            } else {
                // right part
                if (leftParenthesesStack.isEmpty()) {
                    // nothing left to be matched, then invalid
                    return false;
                }
                char leftPart = leftParenthesesStack.peek();
                if ((ch == ']' && leftPart == '[')
                        || (ch == '}' && leftPart == '{')
                        || (ch == ')' && leftPart == '(')) {
                    // matched!
                    leftParenthesesStack.pop();
                } else {
                    return false;
                }
            }
        }

        // has nothing left?
        return leftParenthesesStack.isEmpty();
    }
}
