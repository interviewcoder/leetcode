/**
 * Time : O(N) ; Space: O(N)
 * @tag : Hash Table; Two Pointers; String
 * @by  : Steven Cooks
 * @date: Sep 30, 2015
 ***************************************************************************
 * Description:
 * 
 * Given a string, find the length of the longest substring T that contains 
 * at most 2 distinct characters. 
 * 
 * For example, Given s = “eceba”, T is "ece" which its length is 3.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/ }
 */
package _159_LongestSubstringWithAtMostTwoDistinctCharacters;

import java.util.HashMap;
import java.util.Map;

/** see test {@link _159_LongestSubstringWithAtMostTwoDistinctCharacters.SolutionTest } */
public class Solution {
    
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int res = 0;
        // char, first appearance after the other char in current window
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.size() < 2) {
                // less than two characters in current window
                if (!map.containsKey(ch)) {
                    map.put(ch, i);
                }
            } else if (map.containsKey(ch)) {
                // duplicates appears, update index
                if (s.charAt(i - 1)  != ch) {
                    map.put(ch, i);
                }
            } else {
                // 3rd character appears
                start = map.get(s.charAt(i - 1));
                map = new HashMap<>();
                map.put(s.charAt(i - 1), start);
                map.put(ch, i);
            }
            // update global result
            if (i - start + 1 > res) {
                res = i - start + 1;
            }
        }
        return res;
    }

}
