/**
 * Time : O(); Space : O()
 * @tag : Dynamic Programming; Backtracking; String
 * @by  : Steven Cooks
 * @date: Jul 2, 2015
 *******************************************************************************
 * Description: 
 * 
 * Implement regular expression matching with support for '.' and '*'. 
 * '.' Matches any single character. 
 * '*' Matches zero or more of the preceding element. 
 * The matching should cover the entire input string (not partial). 
 * 
 * The function prototype should be: 
 * 
 * bool isMatch(const char *s, const char *p) 
 * 
 * Some examples: 
 * 
 * isMatch("aa","a") → false 
 * isMatch("aa","aa") → true 
 * isMatch("aaa","aa") → false 
 * isMatch("aa", "a*") → true 
 * isMatch("aa", ".*") → true 
 * isMatch("ab", ".*") → true 
 * isMatch("aab", "c*a*b") → true
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/regular-expression-matching/ }
 */
package _010_RegularExpressionMatching;

/** see test {@link _010_RegularExpressionMatching.SolutionTest } */
public class Solution {

    public boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();

        boolean[][] dp = new boolean[sLen + 1][pLen + 1];

        for (int i = sLen; i >= 0; i--) {
            for (int j = pLen; j >= 0; j--) {
                boolean matched = false;
                if (i == sLen && j == pLen) {
                    matched = true;
                } else if (i < sLen && j == pLen) {
                    matched = false;
                } else if ((j + 1) < pLen && p.charAt(j + 1) == '*') {
                    if (i < sLen && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.')) {
                        // if equals or met with '.', then move on to the next state
                        matched = dp[i][j + 2]
                               || dp[i + 1][j + 2] 
                               || dp[i + 1][j];
                    } else {
                        // ignore '*'
                        matched = dp[i][j + 2];
                    }
                } else if (i < sLen && j < pLen && (s.charAt(i) == p.charAt(j) || (p.charAt(j) == '.' ))) {
                    matched = dp[i + 1][j + 1];
                }
                dp[i][j] = matched;
            }
        }
        return dp[0][0];
    }

}
