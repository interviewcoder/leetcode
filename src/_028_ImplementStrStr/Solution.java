/**
 * Time : O(N); Space: O()
 * @tag : String; Two Pointers
 * @by  : Steven Cooks
 * @date: May 8, 2015
 *************************************************************************
 * Description: 
 * 
 * Implement strStr(). 
 * Returns the index of the first occurrence of needle in haystack, 
 * or -1 if needle is not part of haystack.
 *
 *************************************************************************
 * {@link https://leetcode.com/problems/implement-strstr/ }
 */
package _028_ImplementStrStr;

/** see test {@link _028_ImplementStrStr.SolutionTest } */
public class Solution {
    public int strStr(String haystack, String needle) {
        int startIndex = 0;
        int lenOfNeedle = needle.length();
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            startIndex = i;
            int j = 0;
            while (i < haystack.length() && j < needle.length()
                    && haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if (j == lenOfNeedle) {
                // found
                return startIndex;
            }
            i = startIndex;
        }
        return -1;
    }
}
