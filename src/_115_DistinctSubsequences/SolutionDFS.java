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

/** see test {@link _115_DistinctSubsequences.SolutionDFSTest } */
public class SolutionDFS {

    public int numDistinct(String s, String t) {
        return dfs(s, t, 0, 0);
    }

    private int dfs(String s, String t, int i , int j) {
        if (i == s.length() && j == t.length()) {
            return 1;
        } else if (i == s.length()) {
            return 0;
        } else if (j == t.length()) {
            return 1;
        } else if (s.charAt(i) != t.charAt(j)) {
            return dfs(s, t, i + 1, j);
        } else {
            return dfs(s, t, i + 1, j) + dfs(s, t, i + 1, j + 1);
        }
    }

}
