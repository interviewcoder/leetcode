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

/** see test {@link _010_RegularExpressionMatching.SolutionBottomUpTest } */
public class SolutionBottomUp {

    public boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        boolean[][] dp = new boolean[sLen + 1][pLen + 1];
        for (int sIndex = sLen; sIndex >= 0; sIndex--) {
            for (int pIndex = pLen; pIndex >= 0; pIndex--) {
                // how to match s[sIndex] with p[pIndex]
                boolean matched = false;
                if (sIndex == sLen && pIndex == pLen) {
                    matched = true;
                } else if (sIndex != sLen && pIndex == pLen) {
                    // no character from p left to match
                    matched = false;
                } else if ((pIndex + 1) < pLen && p.charAt(pIndex + 1) == '*') {
                    if (sIndex < sLen && p.charAt(pIndex) == s.charAt(sIndex)
                            || (p.charAt(pIndex) == '.' && sIndex < sLen)) {
                        // if equals or met with '.', then move on to the next state
                        matched = dp[sIndex + 1][pIndex + 2]
                                || dp[sIndex + 1][pIndex]
                                || dp[sIndex][pIndex + 2];
                    } else {
                        // ignore a '*'
                        matched = dp[sIndex][pIndex + 2];
                    }
                } else if (sIndex < sLen && pIndex < pLen
                        && s.charAt(sIndex) == p.charAt(pIndex)
                        || (p.charAt(pIndex) == '.' && sIndex < sLen)) {
                    matched = dp[sIndex + 1][pIndex + 1];
                }
                dp[sIndex][pIndex] = matched;
            }
        }
        return dp[0][0];
    }

}
