/**
 * Time : O(N); Space : O(N)
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

import java.util.HashMap;
import java.util.Map;

/**
 * This memo solution will cause StackOverflow 
 * see test {@link _044_WildcardMatching.SolutionMemoTest } */
public class SolutionMemo {

    private Map<Integer, Boolean> memo = new HashMap<>(); 
    
    public boolean isMatch(String s, String p) {
        return isMatchCore(s, p, 0, 0, s.length(), p.length());
    }

    private boolean isMatchCore(String s, String p, int sIndex, int pIndex,
            int sLen, int pLen) {
        int index = sIndex * (pLen + 1) + pIndex;
        if (memo.containsKey(index)) {
            return memo.get(index);
        }
        
        // base case
        if (sIndex >= s.length() && pIndex == p.length()) {
            // both string and pattern end
            return true;
        }
        if (sIndex < s.length() && pIndex == p.length()) {
            // string not ends, but pattern ends
            return false;
        }

        boolean matched = false;

        // recursive case 1: met '*' in pattern
        if (p.charAt(pIndex) == '*') {
            matched = isMatchCore(s, p, sIndex, pIndex + 1, sLen, pLen) || 
                    (sIndex < sLen && isMatchCore(s, p, sIndex + 1, pIndex, sLen, pLen));
            // use '*' to match empty sequence in string
            // return isMatchCore(s, p, sIndex, pIndex + 1, sLen, pLen)
            // use '*' to match a sequence including s.charAt(sIndex) in string
            // || isMatchCore(s, p, sIndex + 1, pIndex, sLen, pLen);
        } else
        // recursive case 2: met character other than '*' in pattern
        if (sIndex < sLen
                && (s.charAt(sIndex) == p.charAt(pIndex) || p.charAt(pIndex) == '?')) {
            // met same characters in string and pattern || met '?' in pattern
            matched = isMatchCore(s, p, sIndex + 1, pIndex + 1, sLen, pLen);
        }
        memo.put(index, matched);
        return matched;
    }

}
