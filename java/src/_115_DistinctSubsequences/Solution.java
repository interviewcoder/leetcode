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

    // try to pick tLen characters from s to match t
    public int numDistinct(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        // dp[i][j] = number of distinct for S[0:j) to T[0:i)
        int[][] dp = new int[tLen + 1][sLen + 1];
        for (int i = 0; i <= tLen; i++) {
            for (int j = 0; j <= sLen; j++) {
                int count = 0;
                if (i == 0) {
                    // for empty T
                    count = 1;
                } else if (j == 0) {
                    // for empty S
                    count = 0;
                } else if (s.charAt(j - 1) != t.charAt(i - 1)) {
                    count = dp[i][j - 1];
                } else {
                    count = dp[i - 1][j - 1] + dp[i][j - 1];
                }
                dp[i][j] = count;
            }
        }
        return dp[tLen][sLen];
    }

}
