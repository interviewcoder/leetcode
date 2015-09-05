/**
 * Time : O(N^2); Space: O(N^2)
 * @tag : Dynamic Programming; String
 * @by  : Steven Cooks
 * @date: 04.27.2015 
 *************************************************************************
 * Description:
 * Given two words word1 and word2, find the minimum number of steps 
 * required to convert word1 to word2. (each operation is counted as 1 step.) 
 * 
 * You have the following 3 operations permitted on a word: 
 *  a) Insert a character 
 *  b) Delete a character 
 *  c) Replace a character
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/edit-distance/ }
 */
package _072_EditDistance;

/** see test {@link _072_EditDistance.SolutionSuffixTest } */
public class SolutionSuffix {

    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = len1; i >= 0; i--) {
            for (int j = len2; j >= 0; j--) {
                int edit = 0;
                if (i == len1 && j == len2) {
                    edit = 0;
                } else if (i == len1) {
                    edit = len2 - j;
                } else if (j == len2) {
                    edit = len1 - i;
                } else {
                    if (word1.charAt(i) == word2.charAt(j)) {
                        edit = dp[i + 1][j + 1];
                    } else {
                        edit = 1 + Math.min(dp[i + 1][j + 1],
                                Math.min(dp[i][j + 1], dp[i + 1][j]));
                    }
                }
                dp[i][j] = edit;
            }
        }
        return dp[0][0];
    }

}
