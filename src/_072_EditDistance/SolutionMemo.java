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

import java.util.HashMap;
import java.util.Map;

/** see test {@link _072_EditDistance.SolutionMemoTest } */
public class SolutionMemo {
    
    private Map<Integer, Integer> memo = new HashMap<>();

    public int minDistance(String word1, String word2) {
        int i = 0;
        int j = 0;
        return minDistance(i, j, word1, word2);
    }

    private int minDistance(int i, int j, String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        if (i == len1 && j == len2) {
            return 0;
        } else if (i == len1) {
            return len2 - j;
        } else if (j == len2) {
            return len1 - i;
        } else {
            int index = i * (len2 + 1) + j;
            if (memo.containsKey(index)) {
                return memo.get(index);
            } 
            int dist = 0;
            if (word1.charAt(i) == word2.charAt(j)) {
                dist = minDistance(i + 1, j + 1, word1, word2);
            } else {
                dist = 1 + Math.min(minDistance(i + 1, j + 1, word1, word2),
                        Math.min(minDistance(i + 1, j, word1, word2), minDistance(i, j + 1, word1, word2)));
            }
            memo.put(index, dist);
            return dist;
        }
    }

}
