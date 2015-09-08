/**
 * Time : O(N^2); Space: O(N^2)
 * @tag : Dynamic Programming; String
 * @by  : Steven Cooks
 * @date: Jun 16, 2015
 ********************************************************
 * Description:
 * 
 * Given a string S and a string T, count the number of distinct subsequences 
 * of T in S. 
 * A subsequence of a string is a new string which is formed from the original 
 * string by deleting some (can be none) of the characters without disturbing 
 * the relative positions of the remaining characters. (ie, "ACE" is a 
 * subsequence of "ABCDE" while "AEC" is not). 
 * 
 * Here is an example: S = "rabbbit", T = "rabbit" 
 * Return 3.
 * 
 ********************************************************
 * {@link https://leetcode.com/problems/distinct-subsequences/ }
 */
package _115_DistinctSubsequences;

/** see test {@link _115_DistinctSubsequences.SolutionTest } */
public class Solution {

    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = s.length(); i >= 0; i--) {
            for (int j = t.length(); j >= 0; j--) {
                int count = 0;
                if (i == s.length() && j == t.length()) {
                    count = 1;
                } else if (i == s.length()) {
                    count = 0;
                } else if (j == t.length()) {
                    count = 1;
                } else if (s.charAt(i) != t.charAt(j)) {
                    count = dp[i + 1][j];
                } else {
                    count = dp[i + 1][j] + dp[i + 1][j + 1];
                }
                dp[i][j] = count;
            }
        }
        return dp[0][0];
    }

    public int numDistinct2(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = s.length(); i >= 0; i--) {
            for (int j = t.length(); j >= 0; j--) {
                int count = 0;
                if (i == s.length() && j == t.length()) {
                    count = 1;
                } else if (i == s.length()) {
                    count = 0;
                } else if (j == t.length()) {
                    count = 1;
                } else if (s.charAt(i) != t.charAt(j)) {
                    count = dp[i + 1][j];
                } else {
                    count = dp[i + 1][j] + dp[i + 1][j + 1];
                }
                dp[i][j] = count;
            }
        }
        return dp[0][0];
    }

}
