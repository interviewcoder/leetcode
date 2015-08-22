/**
 * Time : O(N); Space: O()
 * @tag : Hash Table; Two Pointers; String
 * @by  : Steven Cooks
 * @date: Jun 6, 2015
 ***************************************************************************
 * Description: 
 * 
 * Given a string S and a string T, find the minimum window in S which will 
 * contain all the characters in T in complexity O(n). 
 * For example, 
 *  S = "ADOBECODEBANC",  T = "ABC" 
 *  Minimum window is "BANC". 
 * Note: 
 * If there is no such window in S that covers all characters in T, 
 * return the emtpy string "". 
 * If there are multiple such windows, you are guaranteed that there will
 * always be only one unique minimum window in S.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/minimum-window-substring/ }
 * 1. create and update hash map.
 * 2. two pointers to maintain a window
 */
package _076_MinimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

/** see test {@link _076_MinimumWindowSubstring.SolutionTest } */
public class Solution {

    public String minWindow(String s, String t) {
        if (s.length() == 0) {
            return "";
        }
        // count string t
        Map<Character, Integer> tMap = new HashMap<>();
        for (char ch : t.toCharArray()) {
            int count = 1;
            if (tMap.containsKey(ch)) {
                count += tMap.get(ch);
            }
            tMap.put(ch, count);
        }

        int lenT = t.length();
        String result = s + t;
        Map<Character, Integer> window = new HashMap<>();
        int left = 0;
        int counts = 0; // how many 'useful' characters that we find in current
                        // window
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (tMap.containsKey(ch)) {
                int count = 1;
                if (!window.containsKey(ch) || window.get(ch) < tMap.get(ch)) {
                    // another useful character appears
                    counts++;
                }
                if (window.containsKey(ch)) {
                    count += window.get(ch);
                }
                window.put(ch, count);
                // if we find a qualified window, then shrink window until not
                if (counts == lenT) {
                    for (int j = left; j <= i; j++) {
                        char c = s.charAt(j);
                        if (!tMap.containsKey(c)) {
                            // rubbish character
                        } else if (window.get(c) > tMap.get(c)) {
                            // without c , current window is still qualified
                            window.put(c, window.get(c) - 1);
                        } else {
                            // min window appears window is going to break;
                            if (i - j + 1 < result.length()) {
                                result = s.substring(j, i + 1);
                            }
                            left = j;
                            break;
                        }
                    }
                    window.put(s.charAt(left), window.get(s.charAt(left)) - 1);
                    left++;
                    counts--;
                }
            }
        }
        return result.length() == (s.length() + t.length()) ? "" : result;
    }

}
