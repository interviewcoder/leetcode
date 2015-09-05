/**
 * Time : O(m*n); Space: O(m * n)
 * @Tag : Dynamic Programming; String
 * @Date: July 1, 2015
 *************************************************************************
 * Description: 
 * 
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2. 
 * 
 * For example, 
 * 
 * Given: 
 * s1 = "aabcc", s2 = "dbbca", 
 * When s3 = "aadbbcbcac", return true. 
 * When s3 = "aadbbbaccc", return false.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/interleaving-string/ } 
 */
package _097_InterleavingString;

public class SolutionBottomUp {
    public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        if (len1 + len2 != len3) {
            return false;
        }
        // dp[i][j] = isInterleave(s1.substring(i), s2.substring(j))
        boolean[][] dp = new boolean[len1 + 1][len2 + 1];
        for (int i = len1; i >= 0; i--) {
            for (int j = len2; j >= 0; j--) {
                int k = i + j;
                if (k == len3) {
                    dp[i][j] = true;
                } else {
                    dp[i][j] =
                    // able to match s3[k] using s1[i] ?
                    (i < len1 && s1.charAt(i) == s3.charAt(k) && dp[i + 1][j])
                            ||
                            // able to match s3[k] using s2[j] ?
                            (j < len2 && s2.charAt(j) == s3.charAt(k) && dp[i][j + 1]);
                }
            }
        }
        return dp[0][0];
    }
}
