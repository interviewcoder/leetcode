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

// DFS version without DP, and will cause TLE
/** see test {@link _115_DistinctSubsequences.SolutionDFSTest } */
public class SolutionDFS {

    private int distincts;

    // try to pick tLen characters from s to match t
    public int numDistinct(String s, String t) {
        distincts = 0;
        numDistinct(s, t, 0, 0);
        return distincts;
    }

    private void numDistinct(String s, String t, int sIndex, int tIndex) {
        // base case
        if (tIndex == t.length()) {
            // one distinct way found
            distincts++;
        }
        // recursive case
        int sLen = s.length();
        int tLen = t.length();
        if (sIndex < sLen && tIndex < tLen) {
            for (int i = sIndex; i <= sLen - tLen + tIndex; i++) {
                // try each character in s[tIndex, sLen - tLen + tIndex]
                // to match t[tIndex:end], last possible index of s is (sLen - tLen + tIndex)
                if (s.charAt(i) == t.charAt(tIndex)) {
                    // go on
                    numDistinct(s, t, i + 1, tIndex + 1);
                }
            }
        }
    }

}
