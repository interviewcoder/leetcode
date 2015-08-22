/**
 * Time : O(2N); Space : O(1)
 * @tag : String
 * @by  : Steven Cooks
 * @date: Jul 10, 2015
 *******************************************************************************
 * Description: 
 * 
 * Given a string S, find the longest palindromic substring in S. You may 
 * assume that the maximum length of S is 1000, and there exists one 
 * unique longest palindromic substring.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/longest-palindromic-substring/ }
 */
package _005_LongestPalindromicSubstring;

/** see test {@link _005_LongestPalindromicSubstring.SolutionTest } */
public class Solution {

    /**
     * Choose center for a possible palindrome string, then span string towards
     * left and right. At the same time, update global best result.
     */
    public String longestPalindrome(String s) {
        int longest = 0; // length of up-to-now longest palindrome substring
        int left = -1;   // left index of longest P substring
        int right = -1;  // right index of longest P substring
        int upper = 2 * s.length();
        int len = s.length();
        for (int i = 0; i < upper; i++) {
            int l = 0;
            int r = 0;
            if (i % 2 == 0) {
                // use A[i / 2] as center
                l = i / 2 - 1;
                r = i / 2 + 1;
            } else {
                // use gap betwen A[(i-1)/2] and A[(i+1)/2] as center
                l = (i - 1) / 2;
                r = (i + 1) / 2;
            }
            while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            // palindrome length
            int length = r - l - 1;
            if (length > longest) {
                // update global max
                longest = length;
                left = l + 1;
                right = r - 1;
            }
        }
        return longest == 0 ? "" : s.substring(left, right + 1);
    }

}
