/**
 * Time : O(N^4); Space: O(N^2)
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
import java.util.Arrays;
import java.util.List;

/** see test {@link _022_GenerateParentheses.SolutionDPTest } */
public class SolutionDP {
    // iterative DP version
    // f(0): ""
    // f(1): "("+f(0)+")"
    // f(2): "("+ f(0) +")" + f(1), "(" + f(1) + ")"+ f(0)
    // f(3): "("+ f(0) +")" + f(2), "(" + f(1) + ")" + f(1), "(" + f(2) + ")" +
    // f(0)
    // f(n): ..., "(" + f(k) + ")" + f(n - 1 - k), ...
    public List<String> generateParenthesis(int n) {

        // initialize the list by pushing f(0)
        List<List<String>> dp = new ArrayList<List<String>>();
        dp.add(Arrays.asList(""));

        for (int i = 1; i <= n; i++) {
            // calculating f(i)
            List<String> level = new ArrayList<String>();
            for (int j = 0; j < i; j++) {
                for (String first : dp.get(j)) {
                    for (String second : dp.get(i - j - 1)) {
                        level.add("(" + first + ")" + second);
                    }
                }
            }
            dp.add(level);
        }

        return dp.get(n);
    }
}
