/**
 * Time : O(); Space : O()
 * @tag : Dynamic Programming; Backtracking; Greedy; String
 * @by  : Steven Cooks
 * @date: Jul 2, 2015
 *************************************************************************
 * Description: 
 * 
 * Implement wildcard pattern matching with support for '?' and '*'. 
 * 
 * '?' Matches any single character. 
 * '*' Matches any sequence of characters (including the empty sequence). 
 * 
 * The matching should cover the entire input string (not partial). 
 * 
 * The function prototype should be: 
 * bool isMatch(const char *s, const char *p) 
 * 
 * Some examples: 
 * 
 *  isMatch("aa","a") → false 
 *  isMatch("aa","aa") → true 
 *  isMatch("aaa","aa") → false 
 *  isMatch("aa", "*") → true 
 *  isMatch("aa", "a*") → true 
 *  isMatch("ab", "?*") → true 
 *  isMatch("aab", "c*a*b") → false
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/wildcard-matching/ }
 */
package _044_WildcardMatching;

/**
 * @reference {@link https://leetcode.com/discuss/10133/linear-runtime-and-constant-space-solution }
 *  see test {@link _044_WildcardMatching.SolutionTest } */
public class Solution {
    
    public boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        int sIndex = 0;
        int pIndex = 0;
        int index = 0;
        int startIndex = -1;
        while (sIndex < sLen) {
            if (pIndex < pLen && (p.charAt(pIndex) == '?' || s.charAt(sIndex) == p.charAt(pIndex))) {
                // advance index on s and p together
                sIndex++;
                pIndex++;
            } else if (pIndex < pLen && p.charAt(pIndex) == '*') {
                // 
                startIndex = pIndex;
                index = sIndex;
                pIndex++;
            } else if (startIndex != -1) {
                // 
                pIndex = startIndex + 1;
                index++;
                sIndex = index;
            } else {
                return false;
            }
        }
        while (pIndex < pLen && p.charAt(pIndex) == '*') {
            pIndex++;
        }
        return pIndex == pLen;
    }

}
