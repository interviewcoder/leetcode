/**
 * Time : O(N^4); Space: O(N^3)
 * @tag : Dynamic Programming; String
 * @by  : Steven Cooks
 * @date: Jun 8, 2015
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
 * {@link https://leetcode.com/problems/scramble-string/ }
 */
package _087_ScrambleString;

/** see test {@link _087_ScrambleString.SolutionTest } */
public class Solution {

    public boolean isScramble(String s1, String s2) {
        // corner case: different lengths of two string
        if (s1.length() != s2.length()) {
            return false;
        }

        int len = s1.length();
        // memo[i][j][l] =
        // isScramble(s1.substring(i, i + l), s2.substring(j, j + l));
        boolean[][][] memo = new boolean[len + 1][len + 1][len + 1];
        for (int l = 1; l <= len; l++) {
            for (int i = len - l; i >= 0; i--) {
                for (int j = len - l; j >= 0; j--) {
                    if (l == 1) {
                        // base case: only one character
                        memo[i][j][l] = s1.charAt(i) == s2.charAt(j);
                    } else {
                        for (int ll = 1; ll < l; ll++) {
                            // partition s1 and s2, and compare
                            if ((memo[i][j][ll] && memo[i + ll][j + ll][l - ll])
                                    || (memo[i][j + l - ll][ll] && memo[i + ll][j][l
                                            - ll])) {
                                memo[i][j][l] = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return memo[0][0][len];
    }

}
