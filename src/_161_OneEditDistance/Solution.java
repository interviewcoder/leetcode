/**
 * Time : O(N) ; Space: O(1)
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

/** see test {@link _161_OneEditDistance.SolutionTest } */
public class Solution {

    // one edit distance:
    // 1) equal length: only one substitution
    // 2) lengths diff by 1: skip one on longer string, then rest should be the same 
    public boolean isOneEditDistance(String s, String t) {
        if (s.length() > t.length()) {
            return isOneEditDistance(t, s);
        }
        if (t.length() - s.length() > 1) {
            return false;
        }
        int i = 0;
        int j = 0;
        boolean diff = false;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) != t.charAt(j)) {
                if (diff) {
                    return false;
                } else {
                    diff = true;
                    if (s.length() == t.length()) {
                        // substitute
                    } else {
                        // jump one in longer string
                        i--;
                    }
                }
            }
            i++;
            j++;
        }
        return diff || s.length() + 1 == t.length();
    }

}
