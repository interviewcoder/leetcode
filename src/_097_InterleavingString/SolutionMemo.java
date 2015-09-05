/**
 * Time : O(m * n); Space: O(m * n))
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
        return helper(0, 0, 0, s1, s2, s3);
    }

    private boolean helper(int i, int j, int k, String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();
        // lookup in memo 
        int index = i * (len2 + 1) + j;
        if (memo.containsKey(index)) {
            return memo.get(index);
        }
        // recursive
        boolean f = false;
        if (i == len1 && j == len2) {
            f = true;
        } else if (i == len1) {
            f = s2.substring(j).equals(s3.substring(k));
        } else if (j == len2) {
            f = s1.substring(i).equals(s3.substring(k));
        } else {
            // recursive case
            f = s1.charAt(i) == s3.charAt(k) && helper(i + 1, j, k + 1, s1, s2, s3)
                    || s2.charAt(j) == s3.charAt(k) && helper(i, j + 1, k + 1, s1, s2, s3);

        }
        memo.put(index, f);
        return f;
    }

}