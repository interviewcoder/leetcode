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

/** see test {@link _072_EditDistance.SolutionTest } */
public class Solution {

    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] memo = new int[len1 + 1][len2 + 1];

        // initialize the memo
        for (int i = 0; i < len1 + 1; i++) {
            // cost for converting from "" to word1.substring(i)
            memo[i][0] = i;
        }

        for (int j = 0; j < len2 + 1; j++) {
            // cost for converting from "" to word2.substring(j)
            memo[0][j] = j;
        }

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    // if chars are equal, no cost for converting
                    memo[i + 1][j + 1] = memo[i][j];
                } else {
                    memo[i + 1][j + 1] = 1 + Math.min(memo[i][j], // replace
                            Math.min(memo[i][j + 1], // add
                                    memo[i + 1][j])); // delete
                }
            }
        }
        return memo[len1][len2];
    }

}
