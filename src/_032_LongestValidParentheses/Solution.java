/**
 * Time : O(N); Space: O(N)
 * @tag : Dynamic Programming; String
 * @by  : Steven Cooks
 * @date: May 6, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a string containing just the characters '(' and ')', find the 
 * length of the longest valid (well-formed) parentheses substring. 
 * For "(()", the longest valid parentheses substring is "()", 
 * which has length = 2. 
 * 
 * Another example is ")()())", where the longest valid parentheses 
 * substring is "()()", which has length = 4.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/longest-valid-parentheses/ }
 */
package _032_LongestValidParentheses;

/** see test {@link _032_LongestValidParentheses.SolutionTest } */
public class Solution {

    // dynamic programming version
    public int longestValidParentheses(String s) {
        int len = s.length();
        if (len <= 1) {
            return 0;
        }
        int result = 0;
        int local = 0;

        // longest[i] = longest valid parentheses ending at s[i - 1]
        int[] longest = new int[len + 1];
        longest[0] = 0;

        int lefts = 0;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') {
                lefts++;
                local = 0;
                longest[i + 1] = 0;
            } else if (lefts > 0) {
                // ch == ')' and has open bracket for matching
                lefts--;
                // 2 for matching
                local = 2 + local + longest[i + 1 - local - 2];
                longest[i + 1] = local;

                // update global optimization
                result = Math.max(result, local);
            }
        }

        return result;
    }

}
