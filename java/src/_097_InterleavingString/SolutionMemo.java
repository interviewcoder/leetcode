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

import java.util.HashMap;
import java.util.Map;

/** see test {@link _097_InterleavingString.SolutionMemoTest } */
public class SolutionMemo {

    private Map<Integer, Boolean> memo = new HashMap<>();

    public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        if (len1 + len2 != len3) {
            return false;
        }
        // backtracking
        return isInterleave(s1, s2, s3, 0, 0);
    }

    private boolean isInterleave(String s1, String s2, String s3, int i, int j) {
        // ! watch the index (s2.length() + 1) = cols
        int index = i * (s2.length() + 1) + j;
        // look up in memo
        if (memo.containsKey(index)) {
            return memo.get(index);
        }

        // recursive
        boolean matched = false;
        int k = i + j;
        if (k == s3.length()) {
            matched = true;
        } else {
            matched = ((i < s1.length() && s1.charAt(i) == s3.charAt(k) 
                    && isInterleave(s1, s2, s3, i + 1, j)) || (j < s2.length()
                    && s2.charAt(j) == s3.charAt(k) && isInterleave(s1, s2, s3,
                    i, j + 1)));
        }
        memo.put(index, matched);
        return matched;
    }

}