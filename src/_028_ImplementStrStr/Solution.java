/**
 * Time : O(N); Space: O(1)
 * @tag : String; Two Pointers
 * @by  : Steven Cooks
 * @date: May 8, 2015
 *************************************************************************
 * Description: 
 * 
 * Implement strStr(). 
 * 
 * Returns the index of the first occurrence of needle in haystack, 
 * or -1 if needle is not part of haystack.
 *
 *************************************************************************
 * {@link https://leetcode.com/problems/implement-strstr/ }
 */
package _028_ImplementStrStr;

/** see test {@link _028_ImplementStrStr.SolutionTest } */
public class Solution {

    // try each possible start index from haystack
    public int strStr(String haystack, String needle) {
        for (int index = 0; index <= haystack.length() - needle.length(); index++) {
            int i = index;
            int j = 0;
            while (j < needle.length() && haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if (j == needle.length()) {
                // found
                return index;
            }
        }
        return -1;
    }

}
