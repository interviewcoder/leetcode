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

import java.util.HashMap;
import java.util.Map;

/** see test {@link _115_DistinctSubsequences.SolutionMemoTest } */
public class SolutionMemo {

    private Map<Integer, Integer> memo = new HashMap<>();

    public int numDistinct(String s, String t) {
        return numDistinct(s, t, 0, 0);
    }

    private int numDistinct(String s, String t, int i, int j) {
        int sLen = s.length();
        int tLen = t.length();
        int index = i * (sLen + 1) + j;
        if (memo.containsKey(index)) {
            return memo.get(index);
        }
        int count = 0;
        if (i == sLen && j == tLen) {
            return 1;
        } else if (i == sLen) {
            count = 0;
        } else if (j == tLen) {
            count = 1;
        } else if (s.charAt(i) != t.charAt(j)) {
            count = numDistinct(s, t, i + 1, j);
        } else {
            count = numDistinct(s, t, i + 1, j)
                    + numDistinct(s, t, i + 1, j + 1);
        }
        memo.put(index, count);
        return count;
    }

}
