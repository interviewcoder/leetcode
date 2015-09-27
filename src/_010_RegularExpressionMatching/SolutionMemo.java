/**
 * Time : O(); Space : O()
 * @tag : Dynamic Programming; Backtracking; String
 * @by  : Steven Cooks
 * @date: Jul 2, 2015
 *******************************************************************************
 * Description: 
 * 
 * Implement regular expression matching with support for '.' and '*'. 
 * '.' Matches any single character. 
 * '*' Matches zero or more of the preceding element. 
 * The matching should cover the entire input string (not partial). 
 * 
 * The function prototype should be: 
 * 
 * bool isMatch(const char *s, const char *p) 
 * 
 * Some examples: 
 * 
 * isMatch("aa","a") → false 
 * isMatch("aa","aa") → true 
 * isMatch("aaa","aa") → false 
 * isMatch("aa", "a*") → true 
 * isMatch("aa", ".*") → true 
 * isMatch("ab", ".*") → true 
 * isMatch("aab", "c*a*b") → true
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/regular-expression-matching/ }
 */
package _010_RegularExpressionMatching;

import java.util.HashMap;
import java.util.Map;

/** see test {@link _010_RegularExpressionMatching.SolutionMemoTest } */
public class SolutionMemo {

    Map<Integer, Map<Integer, Boolean>> memo = new HashMap<>();

    public boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        int sIndex = 0;
        int pIndex = 0;
        return isMatchCore(s, p, sIndex, pIndex, sLen, pLen);
    }

    private boolean isMatchCore(String s, String p, int sIndex, int pIndex,
            int sLen, int pLen) {
        // look up in memo
        if (memo.containsKey(sIndex) && memo.get(sIndex).containsKey(pIndex)) {
            return memo.get(sIndex).get(pIndex);
        }

        if (sIndex == sLen && pIndex == pLen) {
            return true;
        }
        if (sIndex != sLen && pIndex == pLen) {
            return false;
        }
        boolean matched = false;
        if ((pIndex + 1) < pLen && p.charAt(pIndex + 1) == '*') {
            if (sIndex < sLen && p.charAt(pIndex) == s.charAt(sIndex)
                    || (p.charAt(pIndex) == '.' && sIndex < sLen)) {
                // if equals or met with '.', then move on to the next state
                matched = isMatchCore(s, p, sIndex + 1, pIndex + 2, sLen, pLen)
                        || isMatchCore(s, p, sIndex + 1, pIndex, sLen, pLen)
                        || isMatchCore(s, p, sIndex, pIndex + 2, sLen, pLen);
            } else {
                // ignore a '*'
                matched = isMatchCore(s, p, sIndex, pIndex + 2, sLen, pLen);
            }
        } else if (sIndex < sLen && pIndex < pLen
                && s.charAt(sIndex) == p.charAt(pIndex)
                || (p.charAt(pIndex) == '.' && sIndex < sLen)) {
            matched = isMatchCore(s, p, sIndex + 1, pIndex + 1, sLen, pLen);
        }
        if (!memo.containsKey(sIndex)) {
            Map<Integer, Boolean> map = new HashMap<>();
            map.put(pIndex, matched);
            memo.put(sIndex, map);
        } else {
            memo.get(sIndex).put(pIndex, matched);
        }
        return matched;
    }

}
