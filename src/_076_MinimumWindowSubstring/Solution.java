/**
 * Time : O(N); Space: O(N)
 * @tag : Hash Table; Two Pointers; String
 * @by  : Steven Cooks
 * @date: Jun 6, 2015
 ***************************************************************************
 * Description: 
 * 
 * Given a string S and a string T, find the minimum window in S which will 
 * contain all the characters in T in complexity O(n). 
 * 
 * For example, 
 *  S = "ADOBECODEBANC",  T = "ABC" 
 *  Minimum window is "BANC". 
 *  
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

    /**
     * First expand window until we find a qualified window, 
     * then minimize this window until window is not qualified any more.
     */
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        // count characters in string t
        int nums = t.length();
        Map<Character, Integer> tMap = new HashMap<>();
        for (char ch : t.toCharArray()) {
            int count = 1;
            if (tMap.containsKey(ch)) {
                count += tMap.get(ch);
            }
            tMap.put(ch, count);
        }
        
        // only stores characters that exist in both s and t
        Map<Character, Integer> sMap = new HashMap<>();
        int start = 0; // start index for global maximal solution
        int end = Integer.MAX_VALUE; // end index for global maximal solution
        int num = 0; // number of characters from string t in current window

        // [i : j] is current window
        for (int j = 0, i = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (tMap.containsKey(ch)) {
                // update s map and number
                int count = 1;
                if (sMap.containsKey(ch)) {
                    count += sMap.get(ch);
                }
                sMap.put(ch, count);
                
                if (count <= tMap.get(ch)) {
                    num++;
                }
            }
            
            // minimize window
            while (i <= j && num >= nums) {
                // update global result
                if (j - i < end - start) {
                    start = i;
                    end = j;
                }
                char h = s.charAt(i);
                if (!tMap.containsKey(h)) {  // irrelevant character
                    i++;
                } else if (tMap.get(h) < sMap.get(h)) { // more than enough
                    sMap.put(h, sMap.get(h) - 1);
                    i++;
                } else {  // key character in window
                    sMap.put(h, sMap.get(h) - 1);
                    num--;
                    i++;
                }
            }
        }
                
        return end == Integer.MAX_VALUE ? "" : s.substring(start, end + 1); 
    }

}
