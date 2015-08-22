/**
 *************************************************************************
 * Description: 
 * Given a string s1, we may represent it as a binary tree by partitioning 
 * it to two non-empty substrings recursively. 
 * Below is one possible representation of s1 = "great":
 * 
 *     great
 *    /    \
 *   gr     eat
 *  / \     /  \
 * g   r   e   at
 *             / \
 *            a   t
 * To scramble the string, we may choose any non-leaf node and swap its two children. 
 * 
 * For example, if we choose the node "gr" and swap its two children, it produces a scrambled string "rgeat". 
 *      rgeat
 *     /    \
 *   rg    eat
 *  / \    /  \
 * r   g  e   at
 *            / \
 *           a   t 
 * We say that "rgeat" is a scrambled string of "great". 
 * Similarly, if we continue to swap the children of nodes "eat" and "at", it produces a scrambled string "rgtae". 
 *      rgtae
 *     /    \
 *   rg     tae
 *   / \    /  \
 *  r   g  ta   e
 *         / \
 *        t   a
 * We say that "rgtae" is a scrambled string of "great". 
 * Given two strings s1 and s2 of the same length, determine if s2 is a scrambled string of s1.
 * 
 *************************************************************************
 * @tag : Dynamic Programming; String
 * {@link https://leetcode.com/problems/scramble-string/ }
 */
package _087_ScrambleString;

/** see test {@link _087_ScrambleString.PracticeTest } */
public class Practice {

    public boolean isScramble(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int n = s1.length();
        // initialize
        boolean[][][] dp = new boolean[n + 1][n + 1][n + 1];
        // dynamic programming
        for (int len = 1; len <= n; len++) {
            for (int i = n - len; i >= 0; i--) {
                for (int j = n - len; j >= 0; j--) {
                    if (len == 1) {
                        dp[i][j][len] = s1.charAt(i) == s2.charAt(j);
                    } else {
                        // partition substring of length l
                        for (int l = 1; l < len; l++) {
                            if ((dp[i][j][l] && dp[i + l][j + l][len - l])
                                    || (dp[i][j + len - l][l] && dp[i + l][j][len - l])) {
                                dp[i][j][len] = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return dp[0][0][n];
    }

}
