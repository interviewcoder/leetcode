/**
 * Time : O() ; Space: O()
 * @tag : Hash Table; Sort
 * @by  : Steven Cooks
 * @date: Aug 17, 2015
 ***************************************************************************
 * Description:
 * 
 * Given two strings s and t, write a function to determine if t is an anagram of s. 
 * For example, 
 *  s = "anagram", t = "nagaram", return true. 
 *  s = "rat", t = "car", return false. 
 * Note: You may assume the string contains only lowercase alphabets.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/valid-anagram/ }
 */
package _242_ValidAnagram;

/** see test {@link _242_ValidAnagram.SolutionTest } */
public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // since input contains only lowercase alphabets
        int[] counts = new int[26];
        
        // count character occurrence
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        
        // check
        for (int i = 0; i < 26; i++) {
            if (counts[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
