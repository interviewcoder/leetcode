/**
 * Time : O(n^2); Space: O(1)
 * @tag : Dynamic Programming
 * @by  : Steven Cooks
 * @date: Jun 11, 2015
 *************************************************************************
 * Description:
 * 
 * Given a string s and a dictionary of words dict, determine if s can be 
 * segmented into a space-separated sequence of one or more dictionary words. 
 * 
 * For example, given s = "leetcode", dict = ["leet", "code"]. 
 * Return true because "leetcode" can be segmented as "leet code".
 * 
 *************************************************************************
 * {@link: https://leetcode.com/problems/word-break/ }
 */
package _139_WordBreak;

import java.util.Set;

/** see test {@link _139_WordBreak.SolutionTest } */
public class Solution {

    /** bottom-up dynamic programming */
    public boolean wordBreak(String s, Set<String> wordDict) {
        int len = s.length();
        // whether s[i : end] can be successfully broken
        boolean[] dp = new boolean[len + 1];
        for (int i = len; i >= 0; i--) {
            boolean breakable = false;
            if (wordDict.contains(s.substring(i))) {
                // base case
                breakable = true;
            } else {
                for (int j = i + 1; j <= len; j++) {
                    if (wordDict.contains(s.substring(i, j)) && dp[j]) {
                        breakable = true;
                        break;
                    }
                }
            }
            dp[i] = breakable;
        }
        return dp[0];
    }

}
