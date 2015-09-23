/**
 * Time : O(N^4); Space: O(N)
 * @tag : Backtracking; String
 * @by  : Steven Cooks
 * @date: May 6, 2015
 *************************************************************************
 * Description: 
 * 
 * Given n pairs of parentheses, write a function to generate all 
 * combinations of well-formed parentheses. 
 * 
 * For example, given n = 3, a solution set is: 
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/generate-parentheses/ }
 */
package _022_GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _022_GenerateParentheses.SolutionTest } */
public class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        int leftsUsed = 0;
        int rightsUsed = 0;
        String prefix = "";
        generateParenthesis(n, leftsUsed, rightsUsed, prefix, result);
        return result;
    }

    public void generateParenthesis(int n, int leftsUsed, int rightsUsed,
            String prefix, List<String> result) {
        // base case
        if (leftsUsed == n && rightsUsed == n) {
            // one combination found!
            result.add(prefix);
            return;
        }
        // recursive case
        if (leftsUsed == rightsUsed) {
            // next must be '("
            generateParenthesis(n, leftsUsed + 1, rightsUsed, prefix + "(",
                    result);
        } else {
            // can either be "(" or ")"
            if (leftsUsed < n) {
                // still has "(" left for use
                generateParenthesis(n, leftsUsed + 1, rightsUsed, prefix + "(",
                        result);
            }
            if (rightsUsed < n) {
                generateParenthesis(n, leftsUsed, rightsUsed + 1, prefix + ")",
                        result);
            }
        }
    }

}
