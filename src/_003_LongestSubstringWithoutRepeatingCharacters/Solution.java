/**
 * Time : O(N) ; Space: O(1)
 * @tag : Hash Table; Two Pointers; String
 * @by  : Steven Cooks
 * @date: Jul 22, 2015
 ***************************************************************************
 * Description:
 * 
 * Given a string, find the length of the longest substring without repeating 
 * characters. For example, the longest substring without repeating letters 
 * for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest 
 * substring is "b", with the length of 1.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/longest-substring-without-repeating-characters/ }
 */
package _003_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

/**
 * Use two pointers to keep a window. Check repeating character: 1) repeat in
 * map; 2) within current window
 * 
 * see test {@link _003_LongestSubstringWithoutRepeatingCharacters.SolutionTest }
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int start = 0;  // left side of window
        // character, and index in s of its latest appearance
        Map<Character, Integer> posMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // if repeated in current window
            if (posMap.containsKey(ch) && posMap.get(ch) >= start) {
                // move left side of current window to remove repeated character
                start = posMap.get(ch) + 1;
            } else {
                // window is expanding
                result = Math.max(result, i - start + 1);
            }
            posMap.put(ch, i);
        }
        return result;
    }

}
