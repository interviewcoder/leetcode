/**
 * Time : O(); Space: O(1)
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

/** see test {@link _097_InterleavingString.SolutionDFSTest } */
public class SolutionDFS {
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
        // base base
        int k = i + j;
        if (k == s3.length()) {
            return true;
        }

        // recursive case: next character may be from either s1 or s2
        return ((i < s1.length() && s1.charAt(i) == s3.charAt(k) && isInterleave(
                s1, s2, s3, i + 1, j)) || (j < s2.length()
                && s2.charAt(j) == s3.charAt(k) && isInterleave(s1, s2, s3, i,
                    j + 1)));
    }

}
