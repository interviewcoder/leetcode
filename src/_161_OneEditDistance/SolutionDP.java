/**
 * Time : O(N^2) ; Space: O(N^2)
 * @tag : String
 * @by  : Steven Cooks
 * @date: Sep 20, 2015
 ***************************************************************************
 * Description:
 *
 * Given two strings S and T, determine if they are both one edit distance apart.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/one-edit-distance/ }
 */
package _161_OneEditDistance;

/** see test {@link _161_OneEditDistance.SolutionDPTest } */
public class SolutionDP {

    public boolean isOneEditDistance(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        // initialize
        int[][] f = new int[len1 + 1][len2 + 1];

        // dp
        for (int i = len1; i >= 0; i--) {
            for (int j = len2; j >= 0; j--) {
                int len = 0;
                if (i == len1 && j == len2) {
                    len = 0;
                } else if (i == len1) {
                    len = len2 - j;
                } else if (j == len2) {
                    len = len1 - i;
                } else {
                    if (s.charAt(i) == t.charAt(j)) {
                        len = f[i + 1][j + 1];
                    } else {
                        len = 1 + Math.min(f[i + 1][j + 1], Math.min(f[i + 1][j], f[i][j + 1]));
                    }
                }
                f[i][j] = len;
            }
        }
        return f[0][0] == 1;
    }

}
