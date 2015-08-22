/**
 * Time : O(); Space: O()
 * @tag : Dynamic Programming
 * @by  : Steven Cooks
 * @date: Jun 17, 2015
 *************************************************************************
 *  Given a string s, partition s such that every substring of the       *
 *  partition is a palindrome.                                           *
 *  Return the minimum cuts needed for a palindrome partitioning of s.   *
 *************************************************************************
 * {@link https://leetcode.com/problems/palindrome-partitioning-ii/ }
 */
package _132_PalindromePartitioningII;

/** {@link https://leetcode.com/discuss/9476/solution-does-not-need-table-palindrome-right-uses-only-space }*/
/** see test {@link _132_PalindromePartitioningII.SolutionTest } */
public class Solution {
    
    public int minCut(String s) {
        int len = s.length();
        // marking palindrome
        boolean[][] palin = new boolean[len + 1][len + 1];
        for (int l = 0; l <= len; l++) {
            for (int i = 0; i <= len - l; i++) {
                // is s[i, i + l] palindrome?
                if (l == 0 || l == 1) {
                    palin[i][l] = true;
                } else if (l == 2) {
                    palin[i][l] = s.charAt(i) == s.charAt(i + 1);
                } else {
                    palin[i][l] = s.charAt(i) == s.charAt(i + l - 1) 
                            && palin[i + 1][l - 2];
                }
            }
        }
        // dp[i] = minCut for s.substring(i)
        int[] dp = new int[len + 1];
        for (int i = len; i >= 0; i--) {
            if (palin[i][len - i]) {
                dp[i] = 0;
            } else {
                // max possible cuts for s.substring(i) if no palindrome
                // exists in substring
                int cuts = len - 1 - i;
                for (int j = i; j < len; j++) {
                    // only palindrome can make cuts smaller
                    if (palin[i][j - i + 1]) {
                        cuts = Math.min(cuts, 1 + dp[j + 1]);
                    }
                }
                dp[i] = cuts;
            }
        }
        return dp[0];

    }
}
