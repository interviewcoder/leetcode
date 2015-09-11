/**
 * Time : O(N); Space : O(N)
 * @tag : Dynamic Programming; Backtracking; Greedy; String
 * @by  : Steven Cooks
 * @date: Jul 2, 2015
 *************************************************************************
 * Description: 
 * 
 * Implement wildcard pattern matching with support for '?' and '*'. 
 * 
 * '?' Matches any single character. 
 * '*' Matches any sequence of characters (including the empty sequence). 
 * 
 * The matching should cover the entire input string (not partial). 
 * 
 * The function prototype should be: 
 * bool isMatch(const char *s, const char *p) 
 * 
 * Some examples: 
 * 
 *  isMatch("aa","a") → false 
 *  isMatch("aa","aa") → true 
 *  isMatch("aaa","aa") → false 
 *  isMatch("aa", "*") → true 
 *  isMatch("aa", "a*") → true 
 *  isMatch("ab", "?*") → true 
 *  isMatch("aab", "c*a*b") → false
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/wildcard-matching/ }
 */
package _044_WildcardMatching;

/**
 * @reference {@link https://leetcode.com/discuss/30620/my-java-dp-solution }
 *  see test {@link _044_WildcardMatching.SolutionDPTest } */
public class SolutionDP {
    
    public boolean isMatch(String s, String p) {
        int sLen = s.length();
        // initialize: dp[i] represents s[i:end] is matched with p
        boolean[] dp = new boolean[sLen + 1];
        dp[0] = true;
        // dynamic programming
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '*') {
                for (int j = 0; j < s.length(); j++) {
                    dp[j + 1] = dp[j + 1] || dp[j] ;
                }
            } else {
                for (int j = s.length() - 1; j >= 0; j--) {
                    dp[j + 1] = dp[j] && (p.charAt(i) == '?' || p.charAt(i) == s.charAt(j));
                }
            }
            dp[0] = dp[0] && p.charAt(i) == '*';
        }
        return dp[sLen];
    }

}
