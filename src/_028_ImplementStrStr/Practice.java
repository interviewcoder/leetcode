/**
 *************************************************************************
 * Description: 
 * 
 * Implement strStr(). 
 * Returns the index of the first occurrence of needle in haystack, 
 * or -1 if needle is not part of haystack.
 *
 *************************************************************************
 * @tag : String; Two Pointers
 * {@link https://leetcode.com/problems/implement-strstr/ }
 */
package _028_ImplementStrStr;

/** see test {@link _028_ImplementStrStr.PracticeTest } */
public class Practice {

    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        int start = 0;
        while (start <= haystack.length() - needle.length()) {
            int i = start;
            int j = 0;
            while (i < hLen && j < nLen && haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if (j == nLen) {
                // found
                return start;
            }
            start++;
        }
        return -1;
    }

}
