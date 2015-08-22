/**
 * Time : O(N); Space: O(N)
 * @tag : Dynamic Programming; String
 * @by  : Steven Cooks
 * @date: May 8, 2015
 ************************************************************************
 * Description: 
 * 
 * A message containing letters from A-Z is being encoded to numbers using 
 * the following mapping: 
 *  'A' -> 1 'B' -> 2 ... 'Z' -> 26 
 *  Given an encoded message containing digits, determine the total number 
 *  of ways to decode it. 
 *  
 *  For example, 
 *  Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12). 
 *  The number of ways decoding "12" is 2.
 * 
 ************************************************************************
 * {@link https://leetcode.com/problems/decode-ways/ }
 */
package _091_DecodeWays;

/** see test {@link _091_DecodeWays.SolutionSuffixTest } */
public class SolutionSuffix {

    // considering suffix: s[i: end]
    public int numDecodings(String s) {
        int len = s.length();
        if (len == 0) {
            // for "", 0 ways to decode
            return 0;
        }
        // dp[i] = decode ways for s[i:end]
        int[] dp = new int[len + 1];

        // initialize dp[len] and dp[len-1]
        dp[len] = 1;
        dp[len - 1] = s.charAt(len - 1) == '0' ? 0 : 1;

        for (int i = len - 2; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != '0') {
                if (Integer.parseInt(s.substring(i, i + 2)) <= 26) {
                    // for [10-26]: decode as: [10-26] | decode(s[i+2],end)
                    // + decode as: [1-9] | decode(s[i+1],end)
                    dp[i] = dp[i + 2] + dp[i + 1];
                } else {
                    // for [27-99], decode as: [2-9] | decode(s[i+1,end])
                    dp[i] = dp[i + 1];
                }
            }
            // if ch == '0', dp[i] = 0
        }
        return dp[0];
    }
}
