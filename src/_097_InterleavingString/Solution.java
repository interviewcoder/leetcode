/**
 * Time : O(m*n); Space: O(min(m, n))
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

/**
 * Summary:
 * <p>
 * 1. classic String DP problem (suffix/prefix type)
 * 
 * <p>
 * 2. optimization flow Time Space Space DFS ---> Memo version DP ---> Bottom-up
 * DP ---> 1D Bottom-up DP save time for rearrange order save space by deleting
 * overlapping subproblem of subproblems result that have fully used
 * 
 * <p>
 * 3. see {@link _097_InterleavingString.SolutionDFS DFS} see
 * {@link _097_InterleavingString.SolutionMemo memo version} see
 * {@link _097_InterleavingString.SolutionBottomUp originally bottom-up} see
 * test {@link _097_InterleavingString.SolutionTest }
 */
public class Solution {

    public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        if (len1 + len2 != len3) {
            return false;
        }
        if (len1 < len2) {
            // to save space for dp array
            return isInterleave(s2, s1, s3);
        }
        boolean[] dp = new boolean[len2 + 1];
        for (int i = len1; i >= 0; i--) {
            for (int j = len2; j >= 0; j--) {
                int k = i + j;
                if (k == len3) {
                    dp[j] = true;
                } else {
                    dp[j] = (i < len1 && s1.charAt(i) == s3.charAt(k) && dp[j])
                    // able to match s3[k] using s1[i] ?
                            || (j < len2 && s2.charAt(j) == s3.charAt(k) && dp[j + 1]);
                    // able to match s3[k] using s2[j] ?
                }
            }
        }
        return dp[0];
    }

}
