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

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/** see test {@link _020_ValidParentheses.SolutionTest } */
public class Solution {

    /**
     * add a global map to make code to be more extensible and more concise
     */
    @SuppressWarnings("serial")
    private static final Map<Character, Character> parentheseMap = new HashMap<Character, Character>() {
        {
            put('(', ')');
            put('{', '}');
            put('[', ']');
        }
    };

    public boolean isValid(String s) {
        int len = s.length();
        if (len % 2 != 0) {
            // for string of odd-number length, return false immediately
            return false;
        }
        Stack<Character> lefts = new Stack<Character>();
        for (char ch : s.toCharArray()) {
            if (parentheseMap.containsKey(ch)) {
                lefts.push(parentheseMap.get(ch));
            } else {
                // for '}', ']', ')',
                // return false if nothing left or not matching
                if (lefts.isEmpty() || lefts.pop() != ch) {
                    return false;
                }
            }
        }
        return lefts.isEmpty();
    }

}
